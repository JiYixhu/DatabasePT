<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/business/header.jsp"%>
<link rel="stylesheet" href="admin/mycss.css"/>
<body>
<center>
    <br><h1>硬件列表</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/BusinessServlet?flag=Searchlist" />
    <form action="${url}" method="post" style="margin-bottom: 10px;">
        请选择类别：<select name="cate" style="width: 100px;height: 30px;">
            <option value="全部类别" <c:if test="${parameType==null}">selected</c:if>>全部类别</option>
            <option value="图片" <c:if test="${parameType==1}">selected</c:if>>图片</option>
            <option value="Flash" <c:if test="${parameType==2}">selected</c:if>>Flash</option>
            <option value="音乐" <c:if test="${parameType==3}">selected</c:if>>音乐</option>
            <option value="小视频" <c:if test="${parameType==4}">selected</c:if>>小视频</option>
            <option value="其他" <c:if test="${parameType==5}">selected</c:if>>其他</option>
            </select>
            <%--根据以下思路进行动态下拉列表--%>
            <c:forEach items="${gradeInfo}" var="gradeInfo">
            <OPTION VALUE="${gradeInfo.gradeName}">${gradeInfo.gradeName}
            </c:forEach>
        请选择品牌：<select name="brand" style="width: 100px;height: 30px;">
                <option value="" <c:if test="${parameType==null}">selected</c:if>>全部品牌</option>
            <option value="1" <c:if test="${parameType==1}">selected</c:if>>图片</option>
            <option value="2" <c:if test="${parameType==2}">selected</c:if>>Flash</option>
            <option value="3" <c:if test="${parameType==3}">selected</c:if>>音乐</option>
            <option value="4" <c:if test="${parameType==4}">selected</c:if>>小视频</option>
            <option value="5" <c:if test="${parameType==5}">selected</c:if>>其他</option>
            </select>
        请输入硬件名称关键字：<input  style="width: 200px;height: 30px;" type="text" name="name" value="${param.instruction}" >
        <input type="submit" value="查看" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">
    </form>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Halist" />
    <a style="display: block;width: 120px;background-color: #FFA500;height: 30px;line-height: 30px;color: #fff;margin-bottom: 5px;border-radius: 4px;" href="${pageContext.request.contextPath}/admin/add.jsp">硬件添加</a>
    <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="15%">硬件编号</th>
            <th width="26%">硬件名称</th>
            <th width="12%">硬件类别</th>
            <th width="12%">硬件品牌</th>
            <th width="20%">更新日期</th>
            <th colspan="2" width="15%">编辑</th>
        </tr>
        <c:forEach var="hardware" items="${pageBean.data}">
            <tr>
                <td><a href="${pageContext.request.contextPath}/AdminServlet?flag=showHadetail&id=${hardware.HaNo}">${hardware.HaNo}</a></td>
                <td>${hardware.HaName}</td>
                <td>${hardware.HaCate}</td>
                <td>${hardware.HaBrand}</td>
                <td>${hardware.HaDate}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
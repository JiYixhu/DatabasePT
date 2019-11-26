<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/user/header.jsp"%>
<link rel="stylesheet" href="mycss.css"/>
<body>
<center>
    <br><h1>硬件列表</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/UserServlet?flag=Halist" />
    <form action="${url}" method="post" style="margin-bottom: 10px;">
        请选择类别：<select name="selectcate" style="width: 100px;height: 30px;">
            <option value="">全部类别</option>
            <c:forEach  var="cate" items="${category.data}">
                <option value="${cate.HaCate}">${cate.HaCate}</option>
            </c:forEach>
        </select>
        <%--根据以下思路进行动态下拉列表--%>
        请选择品牌：<select name="selectbrand" style="width: 100px;height: 30px;">
            <option value="">全部品牌</option>
            <c:forEach  var="brand" items="${bbrand.data}">
                <option value="${brand.HaBrand}">${brand.HaBrand}</option>
            </c:forEach>
        </select>
        请输入硬件名称关键字：<input  style="width: 200px;height: 30px;" type="text" name="selectname">
        <input type="submit" value="查看" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">
    </form>
    <table class="table" width="75%">
        <tr style="background-color: #eee;">
            <th width="10%">硬件编号</th>
            <th width="25%">硬件名称</th>
            <th width="10%">硬件类别</th>
            <th width="10%">硬件品牌</th>
            <th width="20%">更新日期</th>
        </tr>
        <c:forEach var="hardware" items="${pageBean.data}">
            <tr>
                <td><a href="${pageContext.request.contextPath}/UserServlet?flag=showHadetail&id=${hardware.HaNo}">${hardware.HaNo}</a></td>
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
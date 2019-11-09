<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<link rel="stylesheet" href="admin/mycss.css"/>
<body background="/DatabasePT/img/背景2.jpg">
<center>
    <br><h1>硬件列表</h1><br>
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
                <td><form action="${pageContext.request.contextPath}/admin/update.jsp" >
                        <input type="hidden" name="id" value="${hardware.HaNo}">
                        <input type="hidden" name="fileName" value="${hardware.HaName}">
                        <input class="updateBtn" type="submit" value="修改">
                    </form></td>
                <td><form action="${pageContext.request.contextPath}/admin/delete.jsp" >
                        <input type="hidden" name="id" value="${hardware.HaNo}">
                        <input type="hidden" name="fileName" value="${hardware.HaName}">
                        <input class="deleteBtn" type="submit" value="删除">
                    </form></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
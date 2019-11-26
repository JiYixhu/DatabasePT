<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/user/header.jsp"%>
<link rel="stylesheet" href="mycss.css"/>
<body>
<center>
    <br><h1>商家列表</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/UserServlet?flag=Bulist"/>
    <form action="${url}" method="post" style="margin-bottom: 10px;"> 
        <input placeholder="输入商家编号" style="width: 200px;height: 30px;" type="text" name="Number">&nbsp或&nbsp
        <input  placeholder="输入商家名称" style="width: 200px;height: 30px;" type="text" name="Name">
        <input type="submit" value="查看" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">  
    </form>
        <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="15%">商家编号</th>
            <th width="20%">商家名称</th>
            <th width="25%">商家地址</th>
            <th width="20%">商家电话</th>
        </tr>
        <c:forEach var="businessman" items="${pageBean.data}">
            <tr>
                <td>${businessman.BuNo}</td>
                <td>${businessman.BuName}</td>
                <td>${businessman.BuAdd}</td>
                <td>${businessman.BuTel}</td> 
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
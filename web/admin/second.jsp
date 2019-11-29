<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<link rel="stylesheet" href="mycss.css"/>
<body>
<center>
    <br><h1>商家列表</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Bulist"/>
    <a style="display: block;
    width: 120px;
    background-color: #FFA500;
    height: 30px;
    line-height: 30px;
    color: #fff;
    margin-bottom: 5px;
    border-radius: 4px;" href="${pageContext.request.contextPath}/admin/addBu.jsp">商家添加</a>
    <form action="${url}" method="post" style="margin-bottom: 10px;"> 
        <input placeholder="输入商家编号" style="width: 200px;height: 30px;" type="text" name="Number">&nbsp或&nbsp
        <input  placeholder="输入商家名称" style="width: 200px;height: 30px;" type="text" name="Name">
        <input type="submit" value="查看" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">  
    </form>
    <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="20%">商家编号</th>
            <th width="20%">商家名称</th>
            <th width="25%">商家地址</th>
            <th width="20%">商家电话</th>
            <th colspan="2" width="15%">编辑</th>
        </tr>
        <c:forEach var="businessman" items="${pageBean.data}">
            <tr>
                <td>${businessman.BuNo}</td>
                <td>${businessman.BuName}</td>
                <td>${businessman.BuAdd}</td>
                <td>${businessman.BuTel}</td>
                <td><form action="${pageContext.request.contextPath}/admin/updateBu.jsp" >
                        <input type="hidden" name="BuNo" value="${businessman.BuNo}">
                        <input type="hidden" name="BuName" value="${businessman.BuName}">
                        <input class="updateBtn" type="submit" value="修改">
                    </form></td>
                <td><form action="${pageContext.request.contextPath}/admin/deleteBu.jsp" >
                        <input type="hidden" name="BuNo" value="${businessman.BuNo}">
                        <input type="hidden" name="BuName" value="${businessman.BuName}">
                        <input class="deleteBtn" type="submit" value="删除">
                    </form></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
<c:if test="${result=='删除成功'}">
    <script>window.alert("删除成功！");</script>
    <%session.setAttribute("result", null);%>
</c:if>
     <c:if test="${result=='删除失败'}">
    <script>window.alert("删除失败！");</script>
    <%session.setAttribute("result", null);%>
</c:if>
    <c:if test="${result=='修改成功'}">
    <script>window.alert("修改成功！");</script>
    <%session.setAttribute("result", null);%>
</c:if>
     <c:if test="${result=='修改失败'}">
    <script>window.alert("修改失败！");</script>
    <%session.setAttribute("result", null);%>
</c:if>
</body>
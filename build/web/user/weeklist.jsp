<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/user/header.jsp"%>
<link rel="stylesheet" href="mycss.css"/>
<body>
<center>
    <br><h1>七天内报价信息</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/UserServlet?flag=weeklist"/>
    <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="12%">商品编号</th>
            <th width="20%">商品名称</th>
            <th width="10%">商家编号</th>
            <th width="10%">商家名称</th>
            <th width="10%">报价</th>
            <th width="18%">报价时间</th>
        </tr>
        <c:forEach var="price" items="${pageBean.data}">
            <tr>
                <td>${price.HaNo}</td>
                <td>${price.HaName}</td>
                <td>${price.BuNo}</td>
                <td>${price.BuName}</td>
                <td class="pricefocus">${price.NowPrice}</td>
                <td>${price.NowDate}</td>
            </tr>
        </c:forEach>
    </table><br>
    <c:set var="sum" value="0"/>
    <c:set var="cnt" value="0"/>
    <c:forEach items="${pageBean.data}" var="p">
        <c:set var="sum" value="${sum+p.NowPrice}"/>
        <c:set var="cnt" value="${cnt+1}"/>
    </c:forEach>
    <table><tr><td style="font-size: 20px; color: red;">近七天平均价格为：${sum/cnt}</td></tr></table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
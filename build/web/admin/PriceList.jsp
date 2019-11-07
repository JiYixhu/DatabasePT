<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<style>
    h1{
        color: transparent;
        background-color :#008B8B;
        text-shadow : rgba(255,255,255,0.5) 0 5px 6px, rgba(255,255,255,0.2) 1px 3px 3px;
        -webkit-background-clip : text;
    }
    .table tr:hover{background-color: #f6f6f6;}
    .table td{text-align: center;}
    .table th{background-color: #48D1CC; color:#FFFFFF; font-size:18px;}
    .table tr:hover{background-color: #f6f6f6;}
    .updateBtn,.deleteBtn{display: block;width: 60px;height: 26px;font-size: 14px;font-weight: 800;line-height: 26px;color: #fff;}
    .updateBtn{background-color: #6495ED;border: none;box-sizing: border-box;border-radius: 4px;}
    .deleteBtn{background-color: #DC143C;border: none;box-sizing: border-box;border-radius: 4px;}
</style>
<body background="/DatabasePT/img/背景.jpeg">
<center>
    <br><h1>报价列表</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Pricelist"/>
    <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="15%">商品编号</th>
            <th width="15%">商品名称</th>
            <th width="10%">商家编号</th>
            <th width="10%">商家名称</th>
            <th width="10%">报价</th>
            <th width="20%">报价时间</th>
        </tr>
        <c:forEach var="price" items="${pageBean.data}">
            <tr>
                <td>${price.HaNo}</td>
                <td>${price.HaName}</td>
                <td>${price.BuNo}</td>
                <td>${price.BuName}</td>
                <td>${price.NowPrice}</td>
                <td>${price.NowDate}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
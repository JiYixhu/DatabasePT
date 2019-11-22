<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/business/header.jsp"%>
<link rel="stylesheet" href="business/mycss.css"/>
<body>
<center>
    <br><h1>实时报价列表</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/BusinessServlet?flag=Pricelist" />
    <form action="${url}" method="post" style="margin-bottom: 10px;"> 
        1.<input placeholder="输入硬件名称关键字" style="width: 200px;height: 30px;" type="text" name="Name1">
        2.<input  placeholder="输入商家名称关键字" style="width: 200px;height: 30px;" type="text" name="Name2">
        <input type="submit" value="查看" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">  
    </form>
    <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="10%">硬件编号</th>
            <th width="25%">硬件名称</th>
            <th width="7%">商家编号</th>
            <th width="12%">商家名称</th>
            <th width="7%">当前报价</th>
            <th width="18%">更新时间</th>
        </tr>
        <c:forEach var="price" items="${pageBean.data}">
            <tr>
                <td><a href="${pageContext.request.contextPath}/BusinessServlet?flag=showHadetail&id=${price.HaNo}">${price.HaNo}</a></td>
                <td>${price.HaName}</td>
                <td>${price.BuNo}</td>
                <td>${price.BuName}</td>
                <td style="color: #DC143C">${price.NowPrice}</td>
                <td>${price.NowDate}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
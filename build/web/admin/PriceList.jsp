<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<link rel="stylesheet" href="admin/mycss.css"/>
<body background="/DatabasePT/img/����2.jpg">
<center>
    <br><h1>�����б�</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Pricelist"/>
    <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="15%">��Ʒ���</th>
            <th width="15%">��Ʒ����</th>
            <th width="10%">�̼ұ��</th>
            <th width="10%">�̼�����</th>
            <th width="10%">����</th>
            <th width="20%">����ʱ��</th>
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
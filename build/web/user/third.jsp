<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/user/header.jsp"%>
<link rel="stylesheet" href="mycss.css"/>
<body>
<center>
    <br><h1>�̼��б�</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/UserServlet?flag=Bulist"/>
    <form action="${url}" method="post" style="margin-bottom: 10px;"> 
        <input placeholder="�����̼ұ��" style="width: 200px;height: 30px;" type="text" name="Number">&nbsp��&nbsp
        <input  placeholder="�����̼�����" style="width: 200px;height: 30px;" type="text" name="Name">
        <input type="submit" value="�鿴" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">  
    </form>
        <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="15%">�̼ұ��</th>
            <th width="20%">�̼�����</th>
            <th width="25%">�̼ҵ�ַ</th>
            <th width="20%">�̼ҵ绰</th>
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
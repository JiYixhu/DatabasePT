<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<link rel="stylesheet" href="mycss.css"/>
<body>
<center>
    <br><h1>�̼��б�</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Bulist"/>
    <a style="display: block;
    width: 120px;
    background-color: #FFA500;
    height: 30px;
    line-height: 30px;
    color: #fff;
    margin-bottom: 5px;
    border-radius: 4px;" href="${pageContext.request.contextPath}/admin/addBu.jsp">�̼����</a>
    <form action="${url}" method="post" style="margin-bottom: 10px;"> 
        <input placeholder="�����̼ұ��" style="width: 200px;height: 30px;" type="text" name="Number">&nbsp��&nbsp
        <input  placeholder="�����̼�����" style="width: 200px;height: 30px;" type="text" name="Name">
        <input type="submit" value="�鿴" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">  
    </form>
    <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="20%">�̼ұ��</th>
            <th width="20%">�̼�����</th>
            <th width="25%">�̼ҵ�ַ</th>
            <th width="20%">�̼ҵ绰</th>
            <th colspan="2" width="15%">�༭</th>
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
                        <input class="updateBtn" type="submit" value="�޸�">
                    </form></td>
                <td><form action="${pageContext.request.contextPath}/admin/deleteBu.jsp" >
                        <input type="hidden" name="BuNo" value="${businessman.BuNo}">
                        <input type="hidden" name="BuName" value="${businessman.BuName}">
                        <input class="deleteBtn" type="submit" value="ɾ��">
                    </form></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
<c:if test="${result=='ɾ���ɹ�'}">
    <script>window.alert("ɾ���ɹ���");</script>
    <%session.setAttribute("result", null);%>
</c:if>
     <c:if test="${result=='ɾ��ʧ��'}">
    <script>window.alert("ɾ��ʧ�ܣ�");</script>
    <%session.setAttribute("result", null);%>
</c:if>
    <c:if test="${result=='�޸ĳɹ�'}">
    <script>window.alert("�޸ĳɹ���");</script>
    <%session.setAttribute("result", null);%>
</c:if>
     <c:if test="${result=='�޸�ʧ��'}">
    <script>window.alert("�޸�ʧ�ܣ�");</script>
    <%session.setAttribute("result", null);%>
</c:if>
</body>
<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<link rel="stylesheet" href="mycss.css"/>
<body>
<center>
    <br><h1>����б�</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Calist" />
    <a style="display: block;width: 120px;background-color: #FFA500;height: 30px;line-height: 30px;color: #fff;margin-bottom: 5px;border-radius: 4px;" href="${pageContext.request.contextPath}/admin/addCa.jsp">������</a>
    <table class="table" width="60%">
        <tr style="background-color: #eee;">
            <th width="40%">������</th>
            <th width="40%">�������</th>
            <th colspan="2" width="20%">�༭</th>
        </tr>
        <c:forEach var="category" items="${pageBean.data}">
            <tr>
                <td>${category.HaCateNo}</td>
                <td>${category.HaCate}</td>
                <td><form action="${pageContext.request.contextPath}/admin/updateCa.jsp" >
                        <input type="hidden" name="HaCateNo" value="${category.HaCateNo}">
                        <input type="hidden" name="HaCate" value="${category.HaCate}">
                        <input class="updateBtn" type="submit" value="�޸�">
                    </form></td>
                <td><form action="${pageContext.request.contextPath}/admin/deleteCa.jsp" >
                        <input type="hidden" name="HaCateNo" value="${category.HaCateNo}">
                        <input type="hidden" name="HaCate" value="${category.HaCate}">
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
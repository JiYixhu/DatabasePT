<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<link rel="stylesheet" href="mycss.css"/>
<body>
<center>
    <br><h1>Ʒ���б�</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Brlist" />
    <a style="display: block;width: 120px;background-color: #FFA500;height: 30px;line-height: 30px;color: #fff;margin-bottom: 5px;border-radius: 4px;" href="${pageContext.request.contextPath}/admin/add.jsp">�ļ����</a>
    <table class="table" width="60%">
        <tr style="background-color: #eee;">
            <th width="40%">Ʒ�ƴ���</th>
            <th width="40%">Ʒ������</th>
            <th colspan="2" width="20%">�༭</th>
        </tr>
        <c:forEach var="brand" items="${pageBean.data}">
            <tr>
                <td>${brand.HaBrandNo}</td>
                <td>${brand.HaBrand}</td>
                <td><form action="${pageContext.request.contextPath}/admin/update.jsp" >
                        <input type="hidden" name="id" value="${file.id}">
                        <input type="hidden" name="fileName" value="${file.fileName}">
                        <input class="updateBtn" type="submit" value="�޸�">
                    </form></td>
                <td><form action="${pageContext.request.contextPath}/admin/deleteBr.jsp" >
                        <input type="hidden" name="HaBrandNo" value="${brand.HaBrandNo}">
                        <input type="hidden" name="HaBrand" value="${brand.HaBrand}">
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
</body>
<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<link rel="stylesheet" href="mycss.css"/>
<body>
<center>
    <br><h1>Ӳ���б�</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Halist" />
    <a style="display: block;width: 120px;background-color: #FFA500;height: 30px;line-height: 30px;color: #fff;margin-bottom: 5px;border-radius: 4px;" href="${pageContext.request.contextPath}/admin/add.jsp">Ӳ�����</a>
    <form action="${url}" method="post" style="margin-bottom: 10px;">
        ��ѡ�����<select name="selectcate" style="width: 100px;height: 30px;">
            <option value="">ȫ�����</option>
            <c:forEach  var="cate" items="${category.data}">
                <option value="${cate.HaCate}">${cate.HaCate}</option>
            </c:forEach>
        </select>
        <%--��������˼·���ж�̬�����б�--%>
        ��ѡ��Ʒ�ƣ�<select name="selectbrand" style="width: 100px;height: 30px;">
            <option value="">ȫ��Ʒ��</option>
            <c:forEach  var="brand" items="${bbrand.data}">
                <option value="${brand.HaBrand}">${brand.HaBrand}</option>
            </c:forEach>
        </select>
        ������Ӳ�����ƹؼ��֣�<input  style="width: 200px;height: 30px;" type="text" name="selectname">
        <input type="submit" value="�鿴" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">
    </form>
    <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="15%">Ӳ�����</th>
            <th width="26%">Ӳ������</th>
            <th width="12%">Ӳ�����</th>
            <th width="12%">Ӳ��Ʒ��</th>
            <th width="20%">��������</th>
            <th colspan="2" width="15%">�༭</th>
        </tr>
        <c:forEach var="hardware" items="${pageBean.data}">
            <tr>
                <td><a href="${pageContext.request.contextPath}/AdminServlet?flag=showHadetail&id=${hardware.HaNo}">${hardware.HaNo}</a></td>
                <td>${hardware.HaName}</td>
                <td>${hardware.HaCate}</td>
                <td>${hardware.HaBrand}</td>
                <td>${hardware.HaDate}</td>
                <td><form action="${pageContext.request.contextPath}/admin/updateHa.jsp" >
                        <input type="hidden" name="HaNo" value="${hardware.HaNo}">
                        <input type="hidden" name="HaName" value="${hardware.HaName}">
                        <input class="updateBtn" type="submit" value="�޸�">
                    </form></td>
                <td><form action="${pageContext.request.contextPath}/admin/deleteHa.jsp" >
                        <input type="hidden" name="HaNo" value="${hardware.HaNo}">
                        <input type="hidden" name="HaName" value="${hardware.HaName}">
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
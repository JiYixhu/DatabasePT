<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/business/header.jsp"%>
<link rel="stylesheet" href="admin/mycss.css"/>
<body>
<center>
    <br><h1>Ӳ���б�</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/BusinessServlet?flag=Searchlist" />
    <form action="${url}" method="post" style="margin-bottom: 10px;">
        ��ѡ�����<select name="cate" style="width: 100px;height: 30px;">
            <option value="ȫ�����" <c:if test="${parameType==null}">selected</c:if>>ȫ�����</option>
            <option value="ͼƬ" <c:if test="${parameType==1}">selected</c:if>>ͼƬ</option>
            <option value="Flash" <c:if test="${parameType==2}">selected</c:if>>Flash</option>
            <option value="����" <c:if test="${parameType==3}">selected</c:if>>����</option>
            <option value="С��Ƶ" <c:if test="${parameType==4}">selected</c:if>>С��Ƶ</option>
            <option value="����" <c:if test="${parameType==5}">selected</c:if>>����</option>
            </select>
            <%--��������˼·���ж�̬�����б�--%>
            <c:forEach items="${gradeInfo}" var="gradeInfo">
            <OPTION VALUE="${gradeInfo.gradeName}">${gradeInfo.gradeName}
            </c:forEach>
        ��ѡ��Ʒ�ƣ�<select name="brand" style="width: 100px;height: 30px;">
                <option value="" <c:if test="${parameType==null}">selected</c:if>>ȫ��Ʒ��</option>
            <option value="1" <c:if test="${parameType==1}">selected</c:if>>ͼƬ</option>
            <option value="2" <c:if test="${parameType==2}">selected</c:if>>Flash</option>
            <option value="3" <c:if test="${parameType==3}">selected</c:if>>����</option>
            <option value="4" <c:if test="${parameType==4}">selected</c:if>>С��Ƶ</option>
            <option value="5" <c:if test="${parameType==5}">selected</c:if>>����</option>
            </select>
        ������Ӳ�����ƹؼ��֣�<input  style="width: 200px;height: 30px;" type="text" name="name" value="${param.instruction}" >
        <input type="submit" value="�鿴" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">
    </form>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Halist" />
    <a style="display: block;width: 120px;background-color: #FFA500;height: 30px;line-height: 30px;color: #fff;margin-bottom: 5px;border-radius: 4px;" href="${pageContext.request.contextPath}/admin/add.jsp">Ӳ�����</a>
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
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
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
<body background="/DatabasePT/img/����.jpeg">
<center>
    <br><h1>Ӳ���б�</h1><br>
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
                <td><form action="${pageContext.request.contextPath}/admin/update.jsp" >
                        <input type="hidden" name="id" value="${hardware.HaNo}">
                        <input type="hidden" name="fileName" value="${hardware.HaName}">
                        <input class="updateBtn" type="submit" value="�޸�">
                    </form></td>
                <td><form action="${pageContext.request.contextPath}/admin/delete.jsp" >
                        <input type="hidden" name="id" value="${hardware.HaNo}">
                        <input type="hidden" name="fileName" value="${hardware.HaName}">
                        <input class="deleteBtn" type="submit" value="ɾ��">
                    </form></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
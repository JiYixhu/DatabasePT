<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<%
    request.setCharacterEncoding("GB2312");
    response.setCharacterEncoding("GB2312");
%>
<style>
    h1{
        margin-top: 80px;
        color: transparent;
        background-color :#008B8B;
        text-shadow : rgba(255,255,255,0.5) 0 5px 6px, rgba(255,255,255,0.2) 1px 3px 3px;
        -webkit-background-clip : text;
    }
    table{border-collapse: collapse;}
    table td{text-align: center;border: 3px solid #48D1CC;}
    table tr{height: 40px;}
    .anniu
    {
        width: 120px;
        color: #fff;
        height: 30px;
        background-color:#FFA500;
        border: none;
        border-radius:5px;
    }
</style>
<body>
<center>
    <h1>�̼����</h1><!--����̼���Ϣ��ʱ����ذ���������Ϣ���˺�����ȣ����� -->
    <form action="${pageContext.request.contextPath}/AdminServlet?flag=addBu" method="post">
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�̼ұ��</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="BuNo">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�̼��˺�</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="BuID">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >��������</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="password" name="BuPwd1">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >������������</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="password" name="BuPwd2">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�̼�����</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="BuName">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�̼ҵ�ַ</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="BuAdd">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�̼ҵ绰</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="BuTel">
                </td>
            </tr>
        </table>
        <br>
        <input class="anniu" type="submit" value="�ύ">
        <input class="anniu" type="reset" value="����">
    </form>
</center>
<c:if test="${result=='��ӳɹ�'}">
    <script>window.alert("��ӳɹ���");</script>
    <%session.setAttribute("result", null);%>
</c:if>
<c:if test="${result=='���ʧ��'}">
    <script>window.alert("���ʧ�ܣ����ܱ��/�˺��ظ�");</script>
    <%session.setAttribute("result", null);%>
</c:if>
<c:if test="${result=='�������'}">
    <script>window.alert("�ڶ��������������!");</script>
    <%session.setAttribute("result", null);%>
</c:if>
<c:if test="${result=='isnull'}">
    <script>window.alert("���������Ϊ�գ�");</script>
    <%session.setAttribute("result", null);%>
</c:if>
</body>

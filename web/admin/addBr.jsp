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
    <h1>Ʒ�����</h1>
    <form action="${pageContext.request.contextPath}/AdminServlet?flag=addBr" method="post">
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >Ʒ�ƴ���</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="HaBrandNo">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >Ʒ������</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="HaBrand">
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
<c:if test="${result=='isnull'}">
    <script>window.alert("���������Ϊ�գ�");</script>
    <%session.setAttribute("result", null);%>
</c:if>
</body>

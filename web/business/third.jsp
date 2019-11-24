<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/business/header.jsp"%>
<style>
    h2{
        color: transparent;
        background-color :#008B8B;
        text-shadow : rgba(255,255,255,0.5) 0 5px 6px, rgba(255,255,255,0.2) 1px 3px 3px;
        -webkit-background-clip : text;
    }
    table{border-collapse: collapse;}
    table td{text-align: center;border: 3px solid #48D1CC;}
    table tr{height: 40px;}
    input[type="submit"],input[type="reset"]
    {display: inline-block;width: 120px;background-color:#FFA500;height: 35px;line-height: 30px;color: #fff; border-radius: 10px;}
</style>
<center>
    <h2>��ӱ���</h2><!--HaNo BuNo NowPrice ʱ���Զ����룬������ʱ��ȷ���̼�����-->
    <form action="${pageContext.request.contextPath}/BusinessServlet?flag=add" method="post">
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >Ӳ�����</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="THaNo">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >Ӳ������</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="TBuNo">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�̼ұ��</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="TBuNo">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�̼ұ��</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="TBuNo">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�̼�����</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="TBuNo">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >��ǰ����</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="TNowPrice">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�̼�����</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="password" name="TPwd">
                </td>
            </tr>
        </table>
        <br>
        <input type="submit" value="�ύ">
        <input type="reset" value="����">
    </form>
</center>
<c:if test="${PwdResult=='no'}">
    <script>window.alert("�������!!!");</script>
    <%session.setAttribute("PwdResult", null);%>
</c:if>
<c:if test="${PwdResult=='ok'&&addResult=='ok'}">
    <script>window.alert("��ӳɹ���");</script>
    <%
        session.setAttribute("PwdResult", null);
        session.setAttribute("addResult", null);
    %>
</c:if>
<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/business/header.jsp"%>
<style>
    h1{
    margin-top: 50px;
    font-size: 30px;
    color: #6699CC;
    font-family: "Arial","Microsoft YaHei","����","����",sans-serif;
}
    table{border-collapse: collapse;}
    table td{text-align: center;border: 3px solid #48D1CC;}
    table tr{height: 40px;}
    input[type="submit"],input[type="reset"]
    {display: inline-block;width: 120px;background-color:#FFA500;height: 35px;line-height: 30px;color: #fff; border-radius: 10px;}
</style>
<center>
    <br><h1>��ӱ���</h1><!--HaNo BuNo NowPrice ʱ���Զ����룬������ʱ��ȷ���̼�����-->
    <form action="${pageContext.request.contextPath}/BusinessServlet?flag=add" method="post">
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >Ӳ�����</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="THaNo" placeholder="�뱣֤�����Ӳ�����д��ڵ�">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%">Ӳ������</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="THaName" placeholder="�뱣֤���ƺ�Ӳ��������һ��">
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
                    <input style="width: 415px;height: 30px;" type="text" name="TBuName">
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
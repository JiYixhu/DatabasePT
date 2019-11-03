<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<style>
    h2{
        color: transparent;
        background-color :#008B8B;
        text-shadow : rgba(255,255,255,0.5) 0 5px 6px, rgba(255,255,255,0.2) 1px 3px 3px;
        -webkit-background-clip : text;
    }
    table{align-items: center;border-collapse: collapse;}
    table td{text-align: center;border: 3px solid #48D1CC;}
    table tr{height: 40px;}
    table td a{display: inline-block;width: 120px;background-color:#FFA500;height: 30px;line-height: 30px;color: #fff;}
</style>
<center>
    <h2>Ӳ����ϸ��Ϣ</h2>
    <table width="90%">
        <tr>
            <td bgcolor="#AFEEEE" width="15%" >Ӳ�����</td>
            <td width="20%" >${hardware.HaNo}</td>
            <td bgcolor="#AFEEEE" width="15%" >Ӳ������</td>
            <td width="20%" >${hardware.HaName}</td>
            <td bgcolor="#AFEEEE" width="20%" >Ӳ��ͼƬ</td>
            
        </tr>
        <tr>
            <td bgcolor="#AFEEEE" width="15%" >Ӳ�����</td>
            <td width="20%" >${hardware.HaCate}</td>
            <td bgcolor="#AFEEEE" width="15%" >Ӳ��Ʒ��</td>
            <td width="20%" >${hardware.HaBrand}</td>
            <td width="20%" rowspan="2"><img src = "${hardware.HaPic}"/></td>
        </tr>
        <tr>
            <td bgcolor="#AFEEEE" width="15%" >����Ӳ���۸�</td>
            <td width="30%" >${hardware.HaPrice}</td>
            <td bgcolor="#AFEEEE" width="15%" >Ӳ����������</td>
            <td width="30%" >${hardware.HaDate}</td>
        </tr>
        <tr>
            <td bgcolor="#AFEEEE" width="15%" >Ӳ������</td>
            <td colspan="4" style=" text-align: left">${hardware.HaPara}</td>
        </tr>
        <tr>
            <td colspan="5">
                <a href="${pageContext.request.contextPath}/DownLoadServlet?id=${file.id}">����</a>
                <a href="${pageContext.request.contextPath}/index.jsp">����</a>
            </td>
        </tr>
    </table>
</center>

<c:if test="${DownLoadResult==\"ok\"}">
    <script>window.alert("���سɹ�");</script>
    <%session.setAttribute("DownLoadResult", null);%>
</c:if>
<c:if test="${DownLoadResult==\"no\"}">
    <script>window.alert("����ʧ��");</script>
    <%session.setAttribute("DownLoadResult", null);%>
</c:if>
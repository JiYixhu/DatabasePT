<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<%
   request.setCharacterEncoding("GB2312");
   response.setCharacterEncoding("GB2312");
%>
<style>
    h2{
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
<center>
    <h2>硬件信息修改</h2>
    <form action="${pageContext.request.contextPath}/AdminServlet?flag=updateHa" method="post">
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%">硬件名称</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="HaName" placeholder="<%=request.getParameter("HaName")%>" >
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%">硬件参数</td>
                <td width="70%" >
                    <textarea cols="60" rows="3" name="HaPara" placeholder="限100个字符"></textarea>
                </td>
            </tr>
        </table>
        <br>
        <input type="hidden" name="HaNo" value="<%=request.getParameter("HaNo")%>">
        <input class="anniu" type="submit" value="提交">
        <input class="anniu" type="reset" value="重置">
    </form>
</center>

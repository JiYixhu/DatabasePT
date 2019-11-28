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
    <h1>商家信息修改</h1><!--添加商家信息的时候务必包括所有信息，账号密码等！！！ -->
    <form action="${pageContext.request.contextPath}/AdminServlet?flag=updateBu" method="post">
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >商家名称</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="BuName" placeholder="<%=request.getParameter("BuName")%>">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >商家地址</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="BuAddress">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >商家电话</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="BuTel">
                </td>
            </tr>
        </table>
        <br>
        <input type="hidden" name="BuNo" value="<%=request.getParameter("BuNo")%>">
        <input class="anniu" type="submit" value="提交">
        <input class="anniu" type="reset" value="重置">
    </form>
</center>
</body>

<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/business/header.jsp"%>
<style>
    h1{
        margin-top: 50px;
        font-size: 30px;
        color: #6699CC;
        font-family: "Arial","Microsoft YaHei","黑体","宋体",sans-serif;
    }
    table{border-collapse: collapse;}
    table td{text-align: center;border: 3px solid #48D1CC;}
    table tr{height: 40px;}
    .anniu
    {
        width: 120px;
        color: #FFFFFF;
        height: 30px;
        background-color:#FFA500;
        border: none;
        border-radius:5px;
    }
</style>
<body>
    
<center>
    <br><h1>添加报价</h1><!--HaNo BuNo NowPrice 时间自动填入，点击添加时需确认商家密码-->
    <form action="${pageContext.request.contextPath}/BusinessServlet?flag=add" method="post">
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%">硬件编号</td>
                <td width="70%" >
                    <input id="1" style="width: 415px;height: 30px;" type="text" name="THaNo" placeholder="请保证编号是硬件表中存在的">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%">硬件名称</td>
                <td width="70%" >
                    <input id="2" style="width: 415px;height: 30px;" type="text" name="THaName" placeholder="请保证名称和硬件表名称一致">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >商家编号</td>
                <td width="70%" >
                    <input id="3" style="width: 415px;height: 30px;" type="text" name="TBuNo">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >商家名称</td>
                <td width="70%" >
                    <input id="4" style="width: 415px;height: 30px;" type="text" name="TBuName">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >当前报价</td>
                <td width="70%" >
                    <input id="5" style="width: 415px;height: 30px;" type="text" name="TNowPrice">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >商家密码</td>
                <td width="70%" >
                    <input id="6" style="width: 415px;height: 30px;" type="password" name="TPwd">
                </td>
            </tr>
        </table>
        <br>
        <input class="anniu" type="submit" value="提交" >
        <input class="anniu" type="reset" value="重置">
    </form>
</center>
</body>
<c:if test="${addresult=='密码错误'}">
    <script>window.alert("密码错误!");</script>
    <%session.setAttribute("addresult", null);%>
</c:if>
<c:if test="${addresult=='isnull'}">
    <script>window.alert("各项均不能为空！");</script>
    <%session.setAttribute("addresult", null);%>
</c:if>
 <c:if test="${addresult=='添加成功'}">
    <script>window.alert("添加成功！");</script>
    <%session.setAttribute("addresult", null);%>
</c:if>
     <c:if test="${addresult=='添加失败'}">
    <script>window.alert("添加失败！");</script>
    <%session.setAttribute("addresult", null);%>
</c:if>
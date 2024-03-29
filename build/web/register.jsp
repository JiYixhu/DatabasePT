<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
    .login{width: 340px;height: 280px;margin: 50px auto;padding: auto;
           align-items: center;border: 4px solid #3399ff;border-radius: 10px;
           background-color:rgba(238,238,238,0.5);
    }    
    .dq{
        text-align: justify;
        text-align-last: justify;
        display:inline-block;
    }
    h1{
        color:  #FFFFFF;
        text-shadow : rgba(255,255,255,0.5) 0 5px 5px, rgba(255,255,255,0.2) 1px 3px 3px;
        -webkit-background-clip : text;
        margin: 30px auto 0;
        font-size: 50px;
        letter-spacing: 2pt;
        font-family: SimHei;
    }
    body{
        background-repeat:no-repeat ;
        background-size:100% 100%;
        background-attachment: fixed;
    }
    .submit{
        width: 40%;
        color: #FFFFFF;
        height: 30px;
        background-color:#6699FF;
        border: none;
        border-radius:15px;        
    }
    td{color:#333333;}
    .t{/*下划线样式*/
        border-bottom: 1px solid #005aa7;
        color:#005aa7;
        border-top: 0px;border-left: 0px;border-right: 0px;
        background-color: transparent;
        height: 30px;
        width: 150px;
    }
    .tt{width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;}/*备用样式*/
</style>
<body background="/DatabasePT/img/背景1.jpg">
<center>
    <h1>IT硬件报价系统</h1>
    <form class="login" action="${pageContext.request.contextPath}/UserServlet?flag=register" method="post">
        <table>
            <h2>注册</h2>
            <tr>
                <td><div class="dq">请输入用户名:</div></td><td><input class="t" name="username" placeholder="十三个字符以内" type="text" ></td>
            </tr>
            <tr>
                <td><div class="dq">请输入密码:</div></td><td><input class="t" name="pwd1" placeholder="十个字符以内" type="password"></td>
            </tr>
            <tr>    
                <td><div class="dq">请确认密码:</div></td><td><input class="t" name="pwd2" placeholder="十个字符以内" type="password"></td>
            </tr>
            <tr>    
                <td><div class="dq">请输入手机号:</div></td><td><input class="t" name="tel" placeholder="中国大陆11位手机号" type="text"></td>
            </tr>
        </table>
        <br>
        <input class="submit" type="submit" value="提交">
        <input class="submit" type="button" value="返回" onclick="location.href = 'login.jsp'">
    </form>
</center>
</body>

<c:if test="${result=='isnull'}">
    <script>window.alert("各项均不能为空！");</script>
    <%session.setAttribute("result", null);%>
</c:if>
<c:if test="${result=='no'}">
    <script>window.alert("注册失败!用户名重复！");</script>
    <%session.setAttribute("result", null);%>
</c:if>
<c:if test="${result=='pwdwrong'}">
    <script>window.alert("请确认两次密码相同！");</script>
    <%session.setAttribute("result", null);%>
</c:if>
<c:if test="${result=='yes'}">
    <script>window.alert("注册成功!点击立即返回登录界面！");</script>
    <%
        session.setAttribute("result", null);
        response.setHeader("refresh", "1;URL=login.jsp");
    %>
</c:if>
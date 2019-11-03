<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
    .login{width: 340px;height: 240px;margin: 50px auto;padding: auto;
           align-items: center;border: 4px solid #3399ff;border-radius: 10px;
           background-color:rgba(238,238,238,0.5);
    }    
    h1{
        color:  #FFFFFF;
        /*color: transparent;
        background-color :#0066FF;*/
        text-shadow : rgba(255,255,255,0.5) 0 5px 5px, rgba(255,255,255,0.2) 1px 3px 3px;
        -webkit-background-clip : text;
        margin: 30px auto 0;
        font-size: 50px;
        letter-spacing: 2pt;
        font-family: SimHei;
    }
    h2{color:#000000;}
    body{
        background-repeat:no-repeat ;
        background-size:100% 100%;
        background-attachment: fixed;
    }
    .submit{
        width: 100%;
        color: #FFFFFF;
        height: 30px;
        background-color:#6699FF;
        border: none;
        border-radius:15px;
        
    }
</style>
<body background="/DatabasePT/img/背景1.jpg">
<center>
    <h1>IT硬件报价系统</h1>
    <form class="login" action="${pageContext.request.contextPath}/LoginServlet" method="post">
        <table>
            <h2>登录</h2>
            <tr>
                <td><input name="username" type="text" placeholder="账号" style="width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;"></td>
            </tr>
            <tr>
                <td><input name="password" type="password" placeholder="密码" style="width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;"></td>
            </tr>
            <tr>    
                <td style="color:#333333">
                    管理员：<input type="radio" name="role" value="1" checked>
                    商家：<input type="radio" name="role" value="2">
                    买家：<input type="radio" name="role" value="3">
                </td>
            </tr>
            <tr>
                <td><input class="submit" type="submit" value="登录"></td>
            </tr>
            <tr>
            <a href="register.jsp">点击立即注册</a>
            </tr>
        </table>
    </form>
</center>
</body>
<c:if test="${loginResult=='no'}">
    <script>window.alert("账号或密码错误!!!");</script>
    <%session.setAttribute("loginResult", null);%>
</c:if>
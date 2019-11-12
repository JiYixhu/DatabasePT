<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
    .login{width: 340px;height: 240px;margin: 50px auto;padding: auto;
           align-items: center;border: 4px solid #3399ff;border-radius: 10px;
           background-color:rgba(238,238,238,0.5);
    }    
    .logo{
        margin-left: 10px;
        margin-top: 10px;   
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
    a{color: blue; text-decoration:none;}
    a:hover{color: aquamarine; text-decoration:underline; }
</style>
<body background="/DatabasePT/img/±³¾°1.jpg">
<center>
    <div class="logo">
        <img src="/DatabasePT/img/logo.jpg" width="450px" height="191px">
    </div>
    <form class="login" action="${pageContext.request.contextPath}/LoginServlet" method="post">
        <table>
            <h2>µÇÂ¼</h2>
            <tr>
                <td><input name="username" type="text" placeholder="ÕËºÅ" style="width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;"></td>
            </tr>
            <tr>
                <td><input name="password" type="password" placeholder="ÃÜÂë" style="width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;"></td>
            </tr>
            <tr>    
                <td style="color:#333333">
                    ¹ÜÀíÔ±£º<input type="radio" name="role" value="1" checked>
                    ÉÌ¼Ò£º<input type="radio" name="role" value="2">
                    Âò¼Ò£º<input type="radio" name="role" value="3">
                </td>
            </tr>
            <tr>
                <td><input class="submit" type="submit" value="µÇÂ¼"></td>
            </tr>
            <tr>
            <a href="register.jsp">µã»÷Á¢¼´×¢²á</a>
            </tr>
        </table>
    </form>
</center>
</body>
<c:if test="${loginResult=='no'}">
    <script>window.alert("ÕËºÅ»òÃÜÂë´íÎó!!!");</script>
    <%session.setAttribute("loginResult", null);%>
</c:if>
<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
    .login{width: 340px;height: 280px;margin: 50px auto;padding: auto;
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
    td{
        color:#333333;
    }
</style>
<body background="/DatabasePT/img/����1.jpg">
<center>
    <h1>ITӲ������ϵͳ</h1>
    <form class="login" action="${pageContext.request.contextPath}/UserServlet?flag=register" method="post">
        <table>
            <h2>ע��</h2>
            <tr>
                <td>�������û���:</td><td><input name="username" placeholder="ʮ�����ַ�����" type="text" style="width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;"></td>
            </tr>
            <tr>
                <td>����������:</td><td><input name="pwd1" placeholder="ʮ���ַ�����" type="password" style="width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;"></td>
            </tr>
            <tr>    
                <td>��ȷ�����룺</td><td><input name="pwd2" placeholder="ʮ���ַ�����" type="password" style="width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;"></td>
            </tr>
            <tr>    
                <td>�������ֻ��ţ�</td><td><input name="tel" placeholder="�й���½11λ�ֻ���" type="text" style="width: 100%;height: 30px;border:1px solid #3399ff;padding-left: 10px;border-radius: 5px;"></td>
            </tr>
        </table>
        <br>
        <input class="submit" type="submit" value="�ύ">
        <input class="submit" type="reset" value="����">
    </form>

</center>
</body>
<c:if test="${result=='no'}">
    <script>window.alert("ע��ʧ��!�û����ظ���");</script>
    <%session.setAttribute("result", null);%>
</c:if>
<c:if test="${result=='pwdwrong'}">
    <script>window.alert("��ȷ������������ͬ��");</script>
    <%session.setAttribute("result", null);%>
</c:if>
<c:if test="${result=='yes'}">
    <script>window.alert("ע��ɹ�!3��󷵻ص�¼���棡");</script>
    <%
        session.setAttribute("result", null);
        response.setHeader("refresh", "3;URL=login.jsp");
    %>
</c:if>
<%@page contentType="text/html" pageEncoding="GB2312"%>
<%
    request.setCharacterEncoding("GB2312");
    response.setCharacterEncoding("GB2312");
%>
<center>
    <style>
        h1{color:#6699CC;}
        .anniu
        {
            width: 120px;
            color: #fff;
            height: 30px;
            background-color:#DC143C;
            border: none;
            border-radius:5px;
        }
    </style>
    <h1>ȷ��ɾ�� <%=request.getParameter("HaName")%> ?<h1>
            <form action="${pageContext.request.contextPath}/AdminServlet?flag=deleteHa" method="post">
                <input type="hidden" name="HaNo" value="<%=request.getParameter("HaNo")%>">
                <input class="anniu" type="submit" value="ȷ��"> 
                <input class="anniu" style="background-color: gray;" type="button" value="ȡ��" onclick="location.href = '${pageContext.request.contextPath}/AdminServlet?flag=Halist'">
        </form>
</center>

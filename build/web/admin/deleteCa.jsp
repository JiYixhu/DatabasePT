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
    <h1>ȷ��ɾ��&nbsp&nbsp<%=request.getParameter("HaCate")%>&nbsp&nbsp��������?<h1>
            <form action="${pageContext.request.contextPath}/AdminServlet?flag=deleteCa" method="post">
                <input type="hidden" name="HaCateNo" value="<%=request.getParameter("HaCateNo")%>">
                <input class="anniu" type="submit" value="ȷ��"> 
                <input class="anniu" style="background-color: gray;" type="button" value="ȡ��" onclick="location.href = '${pageContext.request.contextPath}/AdminServlet?flag=Calist'">
        </form>
</center>

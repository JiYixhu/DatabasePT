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
    <h1>确认删除&nbsp&nbsp<%=request.getParameter("HaBrand")%>&nbsp&nbsp这个品牌吗?<h1>
            <form action="${pageContext.request.contextPath}/AdminServlet?flag=deleteBr" method="post">
                <input type="hidden" name="HaBrandNo" value="<%=request.getParameter("HaBrandNo")%>">
                <input class="anniu" type="submit" value="确认"> 
                <input class="anniu" style="background-color: gray;" type="button" value="取消" onclick="location.href = '${pageContext.request.contextPath}/AdminServlet?flag=Brlist'">
        </form>
</center>

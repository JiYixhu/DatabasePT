<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<center><h1 style="color: red">${addresult}</h1><br>
<%request.setAttribute("addresult", null);%>
<a href="${pageContext.request.contextPath}/BusinessServlet?flag=Pricelist">·µ»Ø</a>
</center>
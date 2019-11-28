<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/header.jsp"%>
<%
   request.setCharacterEncoding("GB2312");
   response.setCharacterEncoding("GB2312");
%>
<style>
    h2{
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
<center>
    <h2>硬件信息修改</h2>
    <form action="${pageContext.request.contextPath}/AdminServlet?flag=updateHa" method="post">
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%">硬件名称</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="name" >
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >硬件类别</td>
                <td width="70%" >
                    <select name="selectcate" style="width: 100px;height: 30px;">
            <option value="">全部类别</option>
            <c:forEach  var="cate" items="${category.data}">
                <option value="${cate.HaCate}">${cate.HaCate}</option>
            </c:forEach>
        </select>
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >硬件品牌</td>
                <td width="70%" >
                   <select name="selectbrand" style="width: 100px;height: 30px;">
            <option value="">全部品牌</option>
            <c:forEach  var="brand" items="${bbrand.data}">
                <option value="${brand.HaBrand}">${brand.HaBrand}</option>
            </c:forEach>
        </select>
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >现有图片</td>
                <td width="70%" >
                    <img width="200" height="140" src = "${hardware.HaPic}"/>
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >重新上传</td>
                <td width="70%" >
                    <input type="file">
                </td>
            </tr>
        </table>
        <br>
        <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
        <input class="anniu" type="submit" value="提交">
        <input class="anniu" type="reset" value="重置">
    </form>
</center>

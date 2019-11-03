<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<style>
    h1{
        color: transparent;
        background-color :#008B8B;
        text-shadow : rgba(255,255,255,0.5) 0 5px 6px, rgba(255,255,255,0.2) 1px 3px 3px;
        -webkit-background-clip : text;
    }
    .table tr:hover{background-color: #f6f6f6;}
    .table td{text-align: center;}
    .table th{background-color: #48D1CC; color:#FFFFFF; font-size:18px;}
    .table tr:hover{background-color: #f6f6f6;}
    .updateBtn,.deleteBtn{display: block;width: 60px;height: 26px;font-size: 14px;font-weight: 800;line-height: 26px;color: #fff;}
    .updateBtn{background-color: #6495ED;border: none;box-sizing: border-box;border-radius: 4px;}
    .deleteBtn{background-color: #DC143C;border: none;box-sizing: border-box;border-radius: 4px;}
</style>
<body background="/DatabasePT/img/背景.jpeg">
<center>
    <br><h1>类别列表</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/AdminServlet?flag=Calist" />
    <a style="display: block;width: 120px;background-color: #FFA500;height: 30px;line-height: 30px;color: #fff;margin-bottom: 5px;border-radius: 4px;" href="${pageContext.request.contextPath}/admin/add.jsp">文件添加</a>
    <table class="table" width="60%">
        <tr style="background-color: #eee;">
            <th width="40%">类别代码</th>
            <th width="40%">类别名称</th>
            <th colspan="2" width="20%">编辑</th>
        </tr>
        <c:forEach var="category" items="${pageBean.data}">
            <tr>
                <td>${category.HaCateNo}</td>
                <td>${category.HaCate}</td>
                <td><form action="${pageContext.request.contextPath}/admin/update.jsp" >
                        <input type="hidden" name="id" value="${file.id}">
                        <input type="hidden" name="fileName" value="${file.fileName}">
                        <input class="updateBtn" type="submit" value="修改">
                    </form></td>
                <td><form action="${pageContext.request.contextPath}/admin/delete.jsp" >
                        <input type="hidden" name="id" value="${file.id}">
                        <input type="hidden" name="fileName" value="${file.fileName}">
                        <input class="deleteBtn" type="submit" value="删除">
                    </form></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
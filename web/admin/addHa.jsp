<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<%
    request.setCharacterEncoding("GB2312");
    response.setCharacterEncoding("GB2312");
%>
<style>
    h1{
        margin-top: 80px;
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
<body>
<center>
    <h1>硬件添加</h1>
    <form action="${pageContext.request.contextPath}/UploadServlet" method="post" enctype="multipart/form-data"><!-- 以二进制流文件输出 -->
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >硬件编号</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="HaNo">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >硬件名称</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="HaName">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >硬件类别</td>
                <td width="70%">
                    <select name="HaCate" style="width: 100px;height: 30px;">
                        <option value="CPU">CPU</option>
                        <option value="显卡">显卡</option>
                        <option value="硬盘">硬盘</option>
                        <option value="主板">主板</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >硬件品牌</td>
                <td width="70%">
                    <select name="HaBrand" style="width: 100px;height: 30px;">
                        <option value="Intel">Intel</option>
                        <option value="AMD">AMD</option>
                        <option value="华硕">华硕</option>
                        <option value="七彩虹">七彩虹</option>
                        <option value="三星">三星</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >硬件参数</td>
                <td width="70%" >
                    <textarea cols="60" rows="3" name="HaPara" placeholder="限100个字符"></textarea>
                </td>
            </tr>    
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >硬件图片</td>
                <td width="70%" >
                    <input type="file" name="HaPic">
                </td>
            </tr>
        </table>
        <br>
        <input class="anniu" type="submit" value="提交">
        <input class="anniu" type="reset" value="重置">
    </form>
</center>
<c:if test="${result=='添加成功'}">
    <script>window.alert("添加成功！");</script>
    <%session.setAttribute("result", null);%>
</c:if>
<c:if test="${result=='添加失败'}">
    <script>window.alert("添加失败！可能编号/账号重复");</script>
    <%session.setAttribute("result", null);%>
</c:if>
</body>
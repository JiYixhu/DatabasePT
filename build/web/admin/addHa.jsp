<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/header.jsp"%>
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
    input[type="submit"],input[type="reset"]{display: inline-block;width: 120px;background-color:#FFA500;height: 35px;line-height: 30px;color: #fff;}
</style>
<center>
    <h2>Ӳ�����</h2>
    <form action="${pageContext.request.contextPath}/AdminServlet?flag=add" method="post" enctype="multipart/form-data">
        <table width="60%">
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�ļ�˵��</td>
                <td width="70%" >
                    <input style="width: 415px;height: 30px;" type="text" name="name">
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�ļ�����</td>
                <td width="70%" >
                    <select name="type" style="width: 100px;height: 30px;">
                        <option value="" <c:if test="${parameType==null}">selected</c:if>>ȫ�����</option>
                        <option value="1" <c:if test="${parameType==1}">selected</c:if>>ͼƬ</option>
                        <option value="2" <c:if test="${parameType==2}">selected</c:if>>Flash</option>
                        <option value="3" <c:if test="${parameType==3}">selected</c:if>>����</option>
                        <option value="4" <c:if test="${parameType==4}">selected</c:if>>С��Ƶ</option>
                        <option value="5" <c:if test="${parameType==5}">selected</c:if>>����</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�ļ�����</td>
                <td width="70%" >
                    <textarea cols="60" rows="4" name="description"></textarea>
                </td>
            </tr>
            <tr>
                <td bgcolor="#AFEEEE" width="30%" >�ļ��ϴ�</td>
                <td width="70%" >
                    <input type="file" name="fileName">
                </td>
            </tr>
        </table>
        <br>
        <input type="submit" value="�ύ">
        <input type="reset" value="����">
    </form>
</center>
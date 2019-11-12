<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/admin/header.jsp"%>
<style>
    h2{
        margin-top: 50px;
        font-size: 30px;
        color: transparent;
        background-color :#008B8B;
        text-shadow : rgba(255,255,255,0.5) 0 5px 6px, rgba(255,255,255,0.2) 1px 3px 3px;
        -webkit-background-clip : text;
    }
    table{align-items: center;border-collapse: collapse;}
    table td{text-align: center;border: 3px solid #48D1CC;}
    table tr{height: 40px;}
    table td a{display: inline-block;
               width: 120px;
               background-color:#FFA500;
               height: 30px;
               line-height: 30px;
               color: #fff;
               text-decoration:none;
    }
</style>
<center>
    <h2>硬件详细信息</h2>
    <table width="90%">
        <tr>
            <td bgcolor="#AFEEEE" width="15%" >硬件编号</td>
            <td width="20%" >${hardware.HaNo}</td>
            <td bgcolor="#AFEEEE" width="15%" >硬件名称</td>
            <td width="20%" >${hardware.HaName}</td>
            <td bgcolor="#AFEEEE" width="20%" >硬件图片</td>
            
        </tr>
        <tr>
            <td bgcolor="#AFEEEE" width="15%" >硬件类别</td>
            <td width="20%" >${hardware.HaCate}</td>
            <td bgcolor="#AFEEEE" width="15%" >硬件品牌</td>
            <td width="20%" >${hardware.HaBrand}</td>
            <td width="20%" rowspan="2"><img width="400" height="280" src = "${hardware.HaPic}"/></td>
        </tr>
        <tr>
            <td bgcolor="#AFEEEE" width="15%" >最新硬件价格</td>
            <td width="30%" >${hardware.HaPrice}</td>
            <td bgcolor="#AFEEEE" width="15%" >硬件更新日期</td>
            <td width="30%" >${hardware.HaDate}</td>
        </tr>
        <tr>
            <td bgcolor="#AFEEEE" width="15%" >硬件参数</td>
            <td colspan="4" style=" text-align: left">${hardware.HaPara}</td>
        </tr>
        <tr>
            <td colspan="5">
                <a href="${pageContext.request.contextPath}/AdminServlet?flag=PriceList&id=${hardware.HaNo}">查看报价信息</a>
                <a href="${pageContext.request.contextPath}/AdminServlet?flag=Halist">返回</a>
            </td>
        </tr>
    </table>
</center>
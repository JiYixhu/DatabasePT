<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
    *{margin: 0px;padding: 0px;}
    a{text-decoration: none;color: #039;}
    .footer{margin-top:50px;width: 80%;align-items: center;}
    .footer ul{height: 40px;display: inline-block;}
    .footer ul li{ float: left;list-style: none;height: 40px;width: 240px;
                   line-height: 40px;display: inline-block;border: solid 2px rgba(102,186,183,1);
                   border-bottom-width: 0px;margin: 0 0 -2px -2px;}
    .footer ul li a{color:#008B8B;}
    .footer ul li a:hover{background-color:#008B8B; color: white;}
    .copyright{
        margin-bottom: 20px;
    }
    
</style>
<div class="footer">
    <ul>
        <li>
            ÿҳ ${pageBean.pageSize} ��
        </li> 
        <li>
            �� ${pageBean.totalRows} ��
        </li>
        <li>
            ҳ�� ${pageBean.curPage} / ${pageBean.totalPages}
        </li>
        <li>
            <c:choose>
                <c:when test="${pageBean.curPage==1}">��ҳ ��һҳ</c:when>
                <c:otherwise>
                    <a href="${url}&page=1">��һҳ</a>
                    <a href="${url}&page=${pageBean.curPage-1}">��ҳ</a>
                </c:otherwise>
            </c:choose>
            <c:choose>
                <c:when test="${pageBean.curPage>=pageBean.totalPages}">��һҳ βҳ</c:when>
                <c:otherwise>
                    <a href="${url}&page=${pageBean.curPage+1}">��һҳ</a>
                    <a href="${url}&page=${pageBean.totalPages}">βҳ</a>
                </c:otherwise>
            </c:choose>
        </li>
    </ul>
</div>
<div class="copyright" align="center">  
    <ul>Copyright 2019 JiYi</ul>
</div>
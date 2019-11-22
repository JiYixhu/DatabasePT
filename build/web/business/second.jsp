<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/business/header.jsp"%>
<link rel="stylesheet" href="business/mycss.css"/>
<body>
<center>
    <br><h1>ʵʱ�����б�</h1><br>
    <c:set var="url" value="${pageContext.request.contextPath}/BusinessServlet?flag=Pricelist" />
    <form action="${url}" method="post" style="margin-bottom: 10px;"> 
        1.<input placeholder="����Ӳ�����ƹؼ���" style="width: 200px;height: 30px;" type="text" name="Name1">
        2.<input  placeholder="�����̼����ƹؼ���" style="width: 200px;height: 30px;" type="text" name="Name2">
        <input type="submit" value="�鿴" style="width: 100px;color: #FFFFFF;height: 30px;background-color:#FFA500;border: none;border-radius: 4px;">  
    </form>
    <table class="table" width="80%">
        <tr style="background-color: #eee;">
            <th width="10%">Ӳ�����</th>
            <th width="25%">Ӳ������</th>
            <th width="7%">�̼ұ��</th>
            <th width="12%">�̼�����</th>
            <th width="7%">��ǰ����</th>
            <th width="18%">����ʱ��</th>
        </tr>
        <c:forEach var="price" items="${pageBean.data}">
            <tr>
                <td><a href="${pageContext.request.contextPath}/BusinessServlet?flag=showHadetail&id=${price.HaNo}">${price.HaNo}</a></td>
                <td>${price.HaName}</td>
                <td>${price.BuNo}</td>
                <td>${price.BuName}</td>
                <td style="color: #DC143C">${price.NowPrice}</td>
                <td>${price.NowDate}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <%@include file="/footer.jsp"%>
</center>
</body>
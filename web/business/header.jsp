<%@page contentType="text/html" pageEncoding="GB2312"%>
<div class="logo">
    <strong>ITӲ������</strong>
    <b>|</b>
    <strong style=" font-size: 20px">רҵ ȫ��</strong>
</div>
<div class="box" align="center">
    <ul>
        <li><a href="${pageContext.request.contextPath}/login.jsp">��¼ҳ��</a></li>
        <li><a href="${pageContext.request.contextPath}/BusinessServlet?flag=Searchlist">Ӳ���б�</a></li>
        <li><a href="${pageContext.request.contextPath}/BusinessServlet?flag=Bulist">�����б�</a></li>
    </ul>
</div>
   
<style>
    .logo{
        color: #000000;
        margin-top:15px;
        margin-left:15px;
        font-size: 30px;
        font-weight: bold;
        letter-spacing: 2pt;
        font-family: SimHei;  
    }
    .box{
        /* ���ÿ�ȸ߶ȱ�����ɫ */
        height: 50px;
        width:100%;
        background:#66CCFF;
        position: fixed; /*�̶��ڶ���*/
        top: 67px;/*�붥���ľ���Ϊ0*/
    }
    .box ul{
        /* ���ul��ǩ��Ĭ����ʽ */
        width: 80%;
        list-style-type: none;
        margin: 0;            
        padding: 0;
        overflow: hidden;

    }
    .box li {    
        float:left; /* ʹli���ݺ��򸡶�������������  */
        margin-right:35px;  /* ����li֮��ľ���*/
    }

    .box li a{
        /* ��������������ʾ�ĸ�ʽ*/
        display: block; /* ��������ʾΪ��Ԫ�ؿ�ʹ������������ɵ�� */
        color:white;
        text-align: center;
        font-weight: bold;
        padding: 14px 16px;
        letter-spacing: 3px;/*�ַ����*/
        text-decoration: none; /* ȥ���»��� */
    }
    .box li a:hover{
        /* ���ѡ��ʱ������ɫ */
        background-color: #FFCC99;
    }
</style>

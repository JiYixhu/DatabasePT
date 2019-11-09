<%@page contentType="text/html" pageEncoding="GB2312"%>

<div class="top" align="center">
    <ul>
        <li><a href="${pageContext.request.contextPath}/index.jsp">��¼ҳ��</a></li>
        <li><a href="${pageContext.request.contextPath}/UserServlet?flag=top">��������</a></li>
        <li><a href="${pageContext.request.contextPath}/UserServlet?flag=sort">�����ѯ</a></li>
        <li><a href="${pageContext.request.contextPath}/UserServlet?flag=search">��������</a></li>
        <li><a href="${pageContext.request.contextPath}/admin/login.jsp">������</a></li>
    </ul>
</div>

<style>
    .box{
        width: 100%;
        height: 40px;
        background: #48D1CC;
        margin-top: 20px; 
        border-radius:2px;
        box-shadow: 0 5px 2px #008B8B;
    }
    .box ul{
        height: 100%;
        padding: 0 5%;
        list-style: none;
        color: #fff;
        display: flex;
        justify-content: space-around;
        font:bold 16px/50px Arial;

    }
    .box ul li{
        height: 100%;
        width: 20%;
        font-size: 18px;
        display: flex;
        align-items: center;
        justify-content: center;
        text-shadow:2px 2px 4px rgba(0,0,0,.5);
        background: linear-gradient(red,#a82724,red) no-repeat right/1px 15px;
    }
    .box ul li:last-of-type{
        background:none;
    }
    .box ul li a{
        text-decoration: none;
        color:#FFFFFF;

    }
    .box ul li a:hover{
        transform: rotate(10deg);
    }
    .top{
        /* ���ÿ�ȸ߶ȱ�����ɫ */
        height: 50px;
        width:100%;
        background:#99CCFF;
        position: fixed; /*�̶��ڶ���*/
        top: 0;/*�붥���ľ���Ϊ0*/
    }
    .top ul{
        /* ���ul��ǩ��Ĭ����ʽ */
        width: 80%;
        list-style-type: none;
        margin: 0;            
        padding: 0;
        overflow: hidden;

    }
    .top li {    
        float:left; /* ʹli���ݺ��򸡶�������������  */
        margin-right:50px;  /* ����li֮��ľ���*/
    }

    .top li a{
        /* ��������������ʾ�ĸ�ʽ*/
        display: block; /* ��������ʾΪ��Ԫ�ؿ�ʹ������������ɵ�� */
        color:white;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none; /* ȥ���»��� */
    }
    .top li a:hover{
        /* ���ѡ��ʱ������Ϊ��ɫ */
        background-color: #FFCC99;
    }
    .cap{
        margin-top:  0px;
        margin-left: 10px;
    }
    .cap{
        font-size: 30px;
        color: #FFA500;
        font-family: "Arial","Microsoft YaHei","����","����",sans-serif;
    }
    .back{
        margin-right: 0px;
        margin-top: 0px;
    }
    .back a{color: darkgray; text-decoration:none;}
    .back a:hover{color: aquamarine; text-decoration:underline; }

</style>

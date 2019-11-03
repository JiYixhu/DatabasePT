<%@page contentType="text/html" pageEncoding="GB2312"%>

<div class="box" align="right">
    <ul>
        <li><a href="${pageContext.request.contextPath}/AdminServlet?flag=Halist">硬件列表</a></li>
        <li><a href="${pageContext.request.contextPath}/AdminServlet?flag=Bulist">商家列表</a></li>
        <li><a href="${pageContext.request.contextPath}/AdminServlet?flag=Calist">类别列表</a></li>
        <li><a href="${pageContext.request.contextPath}/AdminServlet?flag=Brlist">品牌列表</a></li>
    </ul>
</div>
    <style>
            .box{
            width: 600px;
            height: 50px;
            background: #48D1CC;
            margin: 30px auto 0; 
            border-radius:10px;
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
            width: 100px;
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
</style>

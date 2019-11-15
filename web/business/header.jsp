<%@page contentType="text/html" pageEncoding="GB2312"%>
<div class="logo">
    <strong>IT硬件报价</strong>
    <b>|</b>
    <strong style=" font-size: 20px">专业 全面</strong>
</div>
<div class="box" align="center">
    <ul>
        <li><a href="${pageContext.request.contextPath}/login.jsp">登录页面</a></li>
        <li><a href="${pageContext.request.contextPath}/BusinessServlet?flag=Searchlist">硬件列表</a></li>
        <li><a href="${pageContext.request.contextPath}/BusinessServlet?flag=Bulist">报价列表</a></li>
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
        /* 设置宽度高度背景颜色 */
        height: 50px;
        width:100%;
        background:#66CCFF;
        position: fixed; /*固定在顶部*/
        top: 67px;/*离顶部的距离为0*/
    }
    .box ul{
        /* 清除ul标签的默认样式 */
        width: 80%;
        list-style-type: none;
        margin: 0;            
        padding: 0;
        overflow: hidden;

    }
    .box li {    
        float:left; /* 使li内容横向浮动，即横向排列  */
        margin-right:35px;  /* 两个li之间的距离*/
    }

    .box li a{
        /* 设置链接内容显示的格式*/
        display: block; /* 把链接显示为块元素可使整个链接区域可点击 */
        color:white;
        text-align: center;
        font-weight: bold;
        padding: 14px 16px;
        letter-spacing: 3px;/*字符间隔*/
        text-decoration: none; /* 去除下划线 */
    }
    .box li a:hover{
        /* 鼠标选中时背景变色 */
        background-color: #FFCC99;
    }
</style>

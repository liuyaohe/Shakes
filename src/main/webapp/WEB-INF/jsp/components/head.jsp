<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" href="<%=basePath %>components/BootStrap/css/font-awesome.min.css">

<link rel="stylesheet" href="<%=basePath %>css/main.css">
<!-- 头部 -->
<div class="navbar navbar-inverse navbar-fixed-top headroom" >
    <div class="container">
        <div class="navbar-header">
            <!-- Button for smallest screens -->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav pull-right">
                <li class="active"><a href="<%=basePath %>index">首页</a></li>
                <li><a href="about.html">关于</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">更多 <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="sidebar-left.html">产品</a></li>
                        <li class="active"><a href="sidebar-right.html">公司</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">管理 <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=basePath %>admin/loadUserList">用户</a> </li>
                        <li><a href="<%=basePath %>admin/loadUserList">角色</a></li>
                    </ul>
                </li>
                <li><a href="contact.html">联系我们</a></li>
                <li><a class="btn" href="<%=basePath %>login">登录 / 退出</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>

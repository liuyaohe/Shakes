<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">--%>
<%--<link rel="stylesheet" href="../../components/BootStrap/css/bootstrap.min.css">--%>
<link rel="stylesheet" href="../../components/BootStrap/css/font-awesome.min.css">

<!-- Custom styles for our template -->
<%--<link rel="stylesheet" href="../../components/BootStrap/css/bootstrap-theme.min.css" media="screen" >--%>
<link rel="stylesheet" href="../../css/main.css">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]-->
<!--[endif]-->
<!-- 头部 -->
<div class="navbar navbar-inverse navbar-fixed-top headroom" >
    <div class="container">
        <div class="navbar-header">
            <!-- Button for smallest screens -->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav pull-right">
                <li class="active"><a href="/admin/index">首页</a></li>
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
                        <li><a href="/admin/loadUserList">用户</a> </li>
                        <li><a href="/admin/loadUserList">角色</a></li>
                    </ul>
                </li>
                <li><a href="contact.html">联系我们</a></li>
                <li><a class="btn" href="/admin/login">登录 / 退出</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>

    <!-- JavaScript libs are placed at the end of the document so the pages load faster -->
   <%-- <script src="../../components/JQuery/1.11.3/jquery.min.js"></script>
    <script src="../../components/BootStrap/js/bootstrap.min.js"></script>
    <script src="../../js/headroom.min.js"></script>
    <script src="../../js/jQuery.headroom.min.js"></script>
    <script src="../../js/template.js"></script>--%>
</div>

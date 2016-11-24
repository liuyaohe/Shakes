<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<title>登录</title>
	<meta charset="utf-8">
	<meta name="viewport"    content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author"      content="Sergey Pozhilov (GetTemplate.com)">

	<link rel="shortcut icon" href="../../../img/gt_favicon.png">

	<link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
	<link rel="stylesheet" href="../../../components/BootStrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="../../../components/BootStrap/css/font-awesome.min.css">

	<!-- Custom styles for our template -->
	<link rel="stylesheet" href="../../../components/BootStrap/css/bootstrap-theme.min.css" media="screen" >
	<link rel="stylesheet" href="../../../css/main.css">

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
	<script src="../../../components/BootStrap/js/html5shiv.js"></script>
	<script src="../../../components/BootStrap/js/respond.min.js"></script>
	<![endif]-->
</head>

<body>
	<jsp:include page="/admin/head"/>
	<br/>
	<br/>
	<!-- container -->
	<div class="container">
		<div class="row">
			
			<!-- Article main content -->
			<article class="col-xs-12 maincontent">
				<header class="page-header">
					<h1 class="page-title">登录</h1>
				</header>
				
				<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class="panel panel-default">
						<div class="panel-body">
							<h3 class="thin text-center"></h3>
							<p class="text-center text-muted"> </p>
							<hr>
							
							<form>
								<div class="top-margin">
									<label>用户名/邮箱 <span class="text-danger">*</span></label>
									<input type="text" class="form-control" placeholder="用户名/邮箱">
								</div>
								<div class="top-margin">
									<label>密码<span class="text-danger">*</span></label>
									<input type="password" class="form-control" placeholder="密码">
								</div>

								<hr>

								<div class="row">
									<div class="col-lg-8">
										<b><a href="">忘记密码?</a>&nbsp;<a href="">注册</a></b>
									</div>
									<div class="col-lg-4 text-right">
										<button class="btn btn-action" type="submit">登录</button>
									</div>
								</div>
							</form>
						</div>
					</div>

				</div>
				
			</article>
			<!-- /Article -->

		</div>
	</div>	<!-- /container -->



	<jsp:include page="/admin/foot"/>

	<!-- JavaScript libs are placed at the end of the document so the pages load faster -->
	<script src="../../../components/JQuery/1.11.3/jquery.min.js"></script>
	<script src="../../../components/BootStrap/js/bootstrap.min.js"></script>
	<script src="../../../js/headroom.min.js"></script>
	<script src="../../../js/jQuery.headroom.min.js"></script>
	<script src="../../../js/template.js"></script>
</body>
</html>
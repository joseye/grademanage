<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html class="bootstrap-admin-vertical-centered">
    <head>
        <title>成绩管理系统</title>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap Docs -->
        <link href="css/docs.min.css" rel="stylesheet" media="screen">

        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href="css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href="css/bootstrap-theme.min.css">

        <!-- Bootstrap Admin Theme -->
        <link rel="stylesheet" media="screen" href="css/bootstrap-admin-theme.css">
        <link rel="stylesheet" media="screen" href="css/bootstrap-admin-theme-change-size.css">

        <!-- Custom styles -->
       

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="js/html5shiv.js"></script>
           <script type="text/javascript" src="js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="bootstrap-admin-with-small-navbar">
        <!-- small navbar -->
        <nav class="navbar navbar-default navbar-fixed-top bootstrap-admin-navbar-sm" role="navigation">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="collapse navbar-collapse">
                            <ul class="nav navbar-nav navbar-left bootstrap-admin-theme-change-size">
                                <li class="text">设置字体大小:</li>
                                <li><a class="size-changer small">小</a></li>
                                <li><a class="size-changer large active">大</a></li>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <li class="dropdown">
                                    <a href="#" role="button" class="dropdown-toggle" data-hover="dropdown"> <i class="glyphicon glyphicon-user"></i> ${sessionScope.sessionuser.name } <i class="caret"></i></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="logout">Logout</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </nav>

        <!-- main / large navbar -->
        <nav class="navbar navbar-default navbar-fixed-top bootstrap-admin-navbar bootstrap-admin-navbar-under-small" role="navigation">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".main-navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="about.html">管理中心</a>
                        </div>
                        <div class="collapse navbar-collapse main-navbar-collapse">
                            <ul class="nav navbar-nav">
                            	
                            	<c:forEach items="${ menus}" var="item">
                            	<li class="dropdown">
                                    <a href="javascript:void(0)" class="dropdown-toggle" data-hover="dropdown">${item.key.authorityname}<b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                    	<c:forEach items="${ item.value}" var="subitem">
                                    		 <li><a href="#">${subitem.authorityname} </a></li>
                                    	</c:forEach>
                                    </ul>
                                </li>
                            	</c:forEach>
                            	<c:forEach items="${ menus}" var="item">
                            	<li class="dropdown">
                                    <a href="javascript:void(0)" class="dropdown-toggle" data-hover="dropdown">${item.key.authorityname}<b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                    	<c:forEach items="${ item.value}" var="subitem">
                                    		 <li><a href="#">${subitem.authorityname} </a></li>
                                    	</c:forEach>
                                    </ul>
                                </li>
                            	</c:forEach>
                                
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div>
                </div>
            </div><!-- /.container -->
        </nav>

        <div class="container maincontainer">
       
        </div>

        <!-- footer -->
        <div class="navbar navbar-footer">dsadadsadsadsa
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <footer role="contentinfo">
                            <p class="left">成绩管理系统</p>
                            <p class="right">&copy; 2014 <a href="#" target="_blank">lafengmaker</a></p>
                        </footer>
                    </div>
                </div>
            </div>
        </div>

        <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/twitter-bootstrap-hover-dropdown.min.js"></script>
        <script type="text/javascript" src="js/bootstrap-admin-theme-change-size.js"></script>
    </body>
</html>

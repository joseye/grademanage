<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html class="bootstrap-admin-vertical-centered">
    <head>
        <title>成绩管理系统</title>
        <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="">
	    <meta name="author" content="">
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

        <div class="container">
            <!-- left, vertical navbar & content -->
            <div class="row">
                <!-- left, vertical navbar -->
                <div class="col-md-2 bootstrap-admin-col-left">
                    <ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                        <li class="active">
                            <a href="about.html"><i class="glyphicon glyphicon-chevron-right"></i> About</a>
                        </li>
                        <li>
                            <a href="dashboard.html"><i class="glyphicon glyphicon-chevron-right"></i> Dashboard</a>
                        </li>
                        <li class="disabled">
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> Calendar</a><!-- calendar.html -->
                        </li>
                        <li class="disabled">
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> Statistics (Charts)</a><!-- stats.html -->
                        </li>
                        <li>
                            <a href="forms.html"><i class="glyphicon glyphicon-chevron-right"></i> Forms</a>
                        </li>
                        <li>
                            <a href="tables.html"><i class="glyphicon glyphicon-chevron-right"></i> Tables</a>
                        </li>
                        <li>
                            <a href="buttons-and-icons.html"><i class="glyphicon glyphicon-chevron-right"></i> Buttons &amp; Icons</a>
                        </li>
                        <li>
                            <a href="wysiwyg-editors.html"><i class="glyphicon glyphicon-chevron-right"></i> WYSIWYG Editors</a>
                        </li>
                        <li>
                            <a href="ui-and-interface.html"><i class="glyphicon glyphicon-chevron-right"></i> UI &amp; Interface</a>
                        </li>
                        <li>
                            <a href="error-pages.html"><i class="glyphicon glyphicon-chevron-right"></i> Error pages</a>
                        </li>
                        <li>
                            <a href="#"><span class="badge pull-right">731</span> Orders</a>
                        </li>
                        <li>
                            <a href="#"><span class="badge pull-right">812</span> Invoices</a>
                        </li>
                        <li>
                            <a href="#"><span class="badge pull-right">27</span> Clients</a>
                        </li>
                        <li>
                            <a href="#"><span class="badge pull-right">1,234</span> Users</a>
                        </li>
                        <li>
                            <a href="#"><span class="badge pull-right">2,221</span> Messages</a>
                        </li>
                        <li>
                            <a href="#"><span class="badge pull-right">11</span> Reports</a>
                        </li>
                        <li>
                            <a href="#"><span class="badge pull-right">83</span> Errors</a>
                        </li>
                        <li>
                            <a href="#"><span class="badge pull-right">4,231</span> Logs</a>
                        </li>
                    </ul>
                </div>

                <!-- content -->
                <div class="col-md-10">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="page-header bootstrap-admin-content-title">
                                <h1>Bootstrap 3.x Admin's Theme</h1>
                                <a href="https://github.com/meritoo/Bootstrap-3-Admin-Theme" class="action btn">
                                    Go to GitHub &raquo;
                                </a>
                                <a href="https://github.com/meritoo/Bootstrap-3-Admin-Theme/archive/master.zip" class="action">
                                    <button class="btn btn-success">Download (.zip)</button>
                                </a>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <div class="text-muted bootstrap-admin-box-title">Details</div>
                                </div>
                                <div class="bootstrap-admin-panel-content">
                                    <ul>
                                        <li>An admin theme built with <a href="http://getbootstrap.com" target="_blank">Bootstrap 3.x.</a></li>
                                        <li>Free for personal and commercial use</li>
                                        <li>Inspired by and based on <a href="https://github.com/VinceG/Bootstrap-Admin-Theme" target="_blank">Bootstrap-Admin-Theme</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <div class="text-muted bootstrap-admin-box-title">Source</div>
                                </div>
                                <div class="bootstrap-admin-panel-content">
                                    <ul>
                                        <li>
                                            <a href="https://github.com/meritoo/Bootstrap-3-Admin-Theme" target="_blank">Github Repository</a>
                                        </li>
                                        <li>
                                            <a href="https://github.com/meritoo/Bootstrap-3-Admin-Theme/archive/master.zip">Download (.zip package)</a>
                                        </li>
                                        <li>
                                            License: MIT (see below)
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <div class="text-muted bootstrap-admin-box-title">License</div>
                                </div>
                                <div class="bootstrap-admin-panel-content">
                                    <p>The MIT License (MIT)</p>
                                    <p>Copyright © 2013 - Meritoo.pl &lt;github [at] meritoo [dot] pl&gt;</p>
                                    <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:</p>
                                    <p>The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.</p>
                                    <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.</p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="bs-docs-masthead">
                                <a href="http://getbootstrap.com" target="_blank">
                                    <h1>Bootstrap</h1>
                                </a>
                            </div>
                        </div>
                        <div class="col-md-6 meritoo-logo">
                            <a href="http://www.meritoo.pl" target="_blank">
                                <img src="images/logo-meritoo.png" alt="Meritoo.pl">
                                <span>Internet software house</span>
                            </a>
                        </div>
                    </div>

                    <div class="row row-urls">
                        <div class="col-md-6">
                            <a href="http://getbootstrap.com" target="_blank">Bootstrap 3.x</a>
                        </div>
                        <div class="col-md-6">
                            <a href="http://www.meritoo.pl" target="_blank">Meritoo.pl</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        

        <!-- footer -->
        <div class="navbar navbar-footer">
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

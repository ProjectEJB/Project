<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

        <title>Đăng Nhập</title>

        <!-- Bootstrap core CSS -->
        <link href="resources/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="resources/font-awesome/css/font-awesome.css" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/css/style-responsive.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>

        <!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->

        <div id="login-page">
            <div class="container">

                <div class="form-login" >
                    <h2 class="form-login-heading">Đăng Nhập</h2>
                    <div class="login-wrap">
                        <input type="text" id="txtUsername" class="form-control" placeholder="Tên Đăng Nhập" autofocus>
                        <br>
                        <input type="password" id="txtPassword" class="form-control" placeholder="Mật Khẩu">

                        <button class="btn btn-theme btn-block " id="btnLogin" <i class="fa fa-lock"></i> Đăng Nhập</button>
                        <hr>




                    </div>

                    <!-- Modal -->

                    <!-- modal -->

                </div>
            </div>
        </div>

        <!-- js placed at the end of the document so the pages load faster -->
        <script src="resources/js/jquery.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>

        <!--BACKSTRETCH-->
        <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
        <script type="text/javascript" src="resources/js/jquery.backstretch.min.js"></script>
        <script>
            $.backstretch("resources/img/login-bg.jpg", {speed: 500});
        </script>


    </body>
    <script src="<c:url value="resources/js/myjs/login.js" />"></script>
</html>

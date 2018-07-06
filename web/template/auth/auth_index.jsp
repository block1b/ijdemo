<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/7/5
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<head>
    <title>Home - Example: Auth</title>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">


    <link href="../../static/bootstrap/bootstrap3/swatch/default/bootstrap.min.css?v=3.3.5" rel="stylesheet">

    <link href="../../static/bootstrap/bootstrap3/css/bootstrap-theme.min.css?v=3.3.5" rel="stylesheet">

    <link href="../../static/admin/css/bootstrap3/admin.css?v=1.1.1" rel="stylesheet">

    <style>
        body {
            padding-top: 4px;
        }
    </style>





</head>
<body>

<div class="container">
    <nav class="navbar navbar-default" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#admin-navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

            <a class="navbar-brand" href="/admin">Example: Auth</a>

        </div>
        <!-- navbar content -->
        <div class="collapse navbar-collapse" id="admin-navbar-collapse">

            <ul class="nav navbar-nav">


                <li class="active">
                    <a href="../../">Home</a>
                </li>

            </ul>



            <ul class="nav navbar-nav navbar-right">




            </ul>




        </div>
    </nav>














    <div class="container">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <h1>Flask-Admin example</h1>
                <p class="lead">
                    Authentication
                </p>
                <p>
                    This example shows how you can use <a href="https://pythonhosted.org/Flask-Security/index.html" target="_blank">Flask-Security</a> for authentication.
                </p>

                <p>You can register as a regular user, or log in as a superuser with the following credentials:
                <ul>
                    <li>email: <b>admin</b></li>
                    <li>password: <b>admin</b></li>
                </ul>
                <p>
                    <a class="btn btn-primary" href="login.jsp">login</a> <a class="btn btn-default" href="register.jsp">register</a>
                </p>

                <p>
                    <a class="btn btn-primary" href="../../index.jsp"><i class="glyphicon glyphicon-chevron-left"></i> Back</a>
                </p>
            </div>
        </div>
    </div>

</div>



<script src="../../static/vendor/jquery.min.js?v=2.1.4" type="text/javascript"></script>
<script src="../../static/bootstrap/bootstrap3/js/bootstrap.min.js?v=3.3.5" type="text/javascript"></script>
<script src="../../static/vendor/moment.min.js?v=2.9.0" type="text/javascript"></script>
<script src="../../static/vendor/select2/select2.min.js?v=3.5.2" type="text/javascript"></script>





</body>
</html>

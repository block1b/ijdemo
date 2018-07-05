<%--
  Created by IntelliJ IDEA.
  User: BLOCK1B
  Date: 2018/7/3
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Register</title>

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
                    <a href="./home.html">Home</a>
                </li>

            </ul>



            <ul class="nav navbar-nav navbar-right">




            </ul>




        </div>
    </nav>














    <div class="row-fluid">
        <div class="col-sm-8 col-sm-offset-2">
            <h1>Register</h1>
            <div class="well">
                <form action="register.action" method="POST" name="register_user_form">
                    <input id="next" name="next" type="hidden" value="">
                    <%--<input id="csrf_token" name="csrf_token" type="hidden" value="IjFjZWViNGVhMmI1ZmZiZDk5ODg3ZjEwNDJhMTA4ZjgwYjY1NmQ1ODQi.Dhegsw.D-ExHroQ0qKFSPqdn69TycvSa1M">--%>


                    <div class="form-group">
                        <label for="userid">学号</label> <input class="form-control" id="userid" name="register.userid" type="text" value="">

                    </div>
                    <div class="form-group">
                        <label for="username">姓名</label> <input class="form-control" id="username" name="register.username" type="text" value="">

                    </div>
                    <div class="form-group">
                        <label for="classname">班级</label> <input class="form-control" id="classname" name="register.classname" type="text" value="">

                    </div>


                    <div class="form-group">
                        <label for="password">密码</label> <input class="form-control" id="password" name="register.password" type="password" value="">

                    </div>




                    <div class="form-group">
                        <label for="password_confirm">确认密码</label> <input class="form-control" id="password_confirm" name="register.repassword" type="password" value="">

                    </div>



                    <p><input class="btn btn-primary" class="form-control" id="submit" name="submit" type="submit" value="Register"></p>

                </form>
                <p>Already signed up? Please <a href="login.jsp">log in</a>.</p>
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
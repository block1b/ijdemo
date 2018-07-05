
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
          
          <a class="navbar-brand" href="">Auth</a>
          
        </div>
        <!-- navbar content -->
        <div class="collapse navbar-collapse" id="admin-navbar-collapse">
          
          <ul class="nav navbar-nav">
            
  
        <li class="active">
          <a href="">Home</a>
        </li>

          </ul>
          

          
          <ul class="nav navbar-nav navbar-right">
            
  
  

          </ul>
          
          


        </div>
      </nav>

      
      
  
    
  

      

      
      

      

<div class="row-fluid">
    <div class="col-sm-8 col-sm-offset-2">
        <h1>Login</h1>
        <div class="well">
            <form action="login.action" method="POST" name="login_user_form">
                <input id="next" name="next" type="hidden" value="">
<input id="csrf_token" name="csrf_token" type="hidden" value="IjFjZWViNGVhMmI1ZmZiZDk5ODg3ZjEwNDJhMTA4ZjgwYjY1NmQ1ODQi.Dhegbg.tTqpFKdPSZclXMv3xHxAycgWCv4">
                

<div class="form-group">
    <label for="name">Name</label> <input class="form-control" id="name" name="user.username" type="text" value="">
    
</div>

                

<div class="form-group">
    <label for="password">Password</label> <input class="form-control" id="password" name="user.password" type="password" value="">
    
</div>

                <div class="form-group">
    <div class="checkbox">
        <label>
            <input id="remember" name="remember" type="checkbox" value="y"> <label for="remember">Remember Me</label>
        </label>
    </div>
</div>
                
<p><input class="form-control" id="next" name="next" type="hidden" value=""></p>

                
<p><input class="btn btn-primary" class="form-control" id="submit" name="submit" type="submit" value="Login"></p>

            </form>
            <p>Not yet signed up? Please <a href="register.jsp">register for an account</a>.</p>
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
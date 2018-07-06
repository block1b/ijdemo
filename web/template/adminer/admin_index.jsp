<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/7/5
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin</title>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">


    <link href="../../static/bootstrap/bootstrap3/swatch/default/bootstrap.min.css?v=3.3.5" rel="stylesheet">

    <link href="../../static/bootstrap/bootstrap3/css/bootstrap-theme.min.css?v=3.3.5" rel="stylesheet">

    <link href="../../static/admin/css/bootstrap3/admin.css?v=1.1.1" rel="stylesheet">
    <%--引用导航栏--%>
    <link rel="import" href="./admin_head.html">
    <style>
        body {
            padding-top: 4px;
        }
    </style>





</head>
<body>

<div class="container">

    <%--导航栏--%>
        <div id="head"></div>
        <script>
            var link = document.querySelector('link[rel="import"]');

            // 从导入中复制 <template>。
            var template = link.import.querySelector('template');
            var content = template.content.cloneNode(true)

            document.querySelector('#head').appendChild(content);
        </script>

    <div class="container">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <h1>Flask-Admin example</h1>
                <p class="lead">
                    Basic SQLAlchemy model views.
                </p>
                <p>
                    This example shows how to add basic CRUD-views for your SQLAlchemy models.
                </p>
                <p>
                    The views are generated automatically, but it is perfectly possible to customize them to suit your needs.
                </p>
                <a class="btn btn-primary" href="/index.jsp"><i class="glyphicon glyphicon-chevron-left"></i> Back</a>
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

<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/7/6
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.lang.reflect.Field" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <title>update</title>

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

    <link href="../../static/vendor/select2/select2.css?v=3.5.2" rel="stylesheet">
    <link href="../../static/vendor/select2/select2-bootstrap3.css?v=1.4.6" rel="stylesheet">
    <link href="../../static/vendor/bootstrap-daterangepicker/daterangepicker-bs3.css?v=1.3.22" rel="stylesheet">
    <%--引用导航栏--%>
    <link rel="import" href="./admin_head.html">
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
    <%--以上为导航栏引用--%>

    <ul class="nav nav-tabs">
        <li>
            <a href="manage_show.action">List</a>
        </li>
        <li class="active">
            <a href="create.jsp">Create</a>
        </li>
    </ul>

    <%--表单--%>
    <%--Role(int id, String roleid, String rolename, String permissions)--%>
    <form action="create.action" method="POST" role="form" class="admin-form form-horizontal" enctype="multipart/form-data">

        <input name="role.id" type="hidden" value="0">

        <div class="form-group">
            <label for="role_id" class="col-md-2 control-label">角色id
                &nbsp;
            </label>
            <div class="col-md-10">
                <input class="form-control" id="role_id" name="role.roleid" type="text" value="">

            </div>
        </div>

        <div class="form-group">
            <label for="role_name" class="col-md-2 control-label">角色名
                &nbsp;
            </label>
            <div class="col-md-10">
                <input class="form-control" id="role_name" name="role.rolename" type="text" value="">

            </div>
        </div>

        <div class="form-group">
            <label for="permissions" class="col-md-2 control-label">权限
                &nbsp;
            </label>
            <div class="col-md-10">

                <select class="form-control" data-role="select2" id="permissions" multiple name="role.permissions">
                    <option value="r">r</option>
                    <option value="w">w</option>
                    <option value="rw">rw</option>
                </select>

            </div>

        </div>

        <hr>
        <div class="form-group">
            <div class="col-md-offset-2 col-md-10 submit-row">
                <input type="submit" class="btn btn-primary" value="Save" />
                <a href="manage_show.action" class="btn btn-danger" role="button" >Cancel</a>

            </div>
        </div>


    </form>




</div>



<script src="../../static/vendor/jquery.min.js?v=2.1.4" type="text/javascript"></script>
<script src="../../static/bootstrap/bootstrap3/js/bootstrap.min.js?v=3.3.5" type="text/javascript"></script>
<script src="../../static/vendor/moment.min.js?v=2.9.0" type="text/javascript"></script>
<script src="../../static/vendor/select2/select2.min.js?v=3.5.2" type="text/javascript"></script>

<script src="../../static/vendor/bootstrap-daterangepicker/daterangepicker.js?v=1.3.22"></script>

<script src="../../static/admin/js/form.js?v=1.0.1"></script>


</body>
</html>
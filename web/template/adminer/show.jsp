
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/7/5
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.lang.reflect.Field" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <title>User - Example: SQLAlchemy</title>

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

    <%--展示查询到的表 --%>
    <%--<table>--%>
        <%--<s:iterator value="#session.table" var="line">--%>
            <%--<tr>--%>
                <%--<td><s:property value="#line.id"/></td>--%>
            <%--</tr>--%>
        <%--</s:iterator>--%>
    <%--</table>--%>
        <%-----------功能栏----------List | Create | with selectd------------------------%>
    <ul class="nav nav-tabs actions-nav">
        <li class="active">
            <a href="manage_show.action">List (<s:property value="#session.table.size"/>)</a>
        </li>

        <li>
            <a href="create.jsp" title="Create New Record">Create</a></li>

        <li class="dropdown">
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="javascript:void(0)">With selected<b class="caret"></b></a>
            <ul class="dropdown-menu">

                <li>
                    <a href="deletes.action" onclick="return modelActions.execute('delete');">Delete</a>
                </li>

            </ul>

        </li>

    </ul>
<%---------------表----------------------------%>
    <div class="table-responsive">
        <table class="table table-striped table-bordered table-hover model-list">
    <%---------------表头--- |roleid | rolename | rolepermissions -------------------------------%>
            <thead>
            <tr>

                <th class="list-checkbox-column">
                    <%--此处会通过js选中所有，但是结果都记录在rowid字段--%>
                    <input type="checkbox" name="rowtoggle" class="action-rowtoggle" title="Select all records" />
                </th>

                <th class="col-md-1">&nbsp;</th>
<%--todo short by key--%>
                <th class="column-header col-roleid">
                    <a href="" title="Sort by First Name">角色id</a>

                </th>

                <th class="column-header col-rolename">
                    <a href="" title="Sort by Last Name">角色名</a>

                </th>


                <th class="column-header col-permissions">
                    <a href="" title="Sort by Username">权限</a>

                </th>

            </tr>
            </thead>
        <%--行展示--%>
        <s:iterator value="#session.table" var="line">
            <tr>
                    <%-- todo 选中修改删除功能--%>
                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="<s:property value="#line.id"/>" title="Select record" />
                </td>
                <td class="list-buttons-column">
                        <%--修改按钮--%>
                    <a class="icon" href="findbyid.action?table=role&id=<s:property value="#line.id"/>" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>

                        <%--删除按钮--%>
                    <a class="icon" href="delete?table=role&id=<s:property value="#line.id"/>" title="Edit Record">
                        <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                    </a>

                </td>

                    <%-- 选中修改删除功能-end----------------%>
                <td class="col-roleid"><s:property value="#line.roleid"/></td>
                <td class="col-rolename"><s:property value="#line.rolename"/></td>
                <td class="col-permissions"><s:property value="#line.permissions"/></td>

            </tr>
        </s:iterator>


    <%---------------行内容静态样例--- 复选框|修改|删除 |roleid | rolename | rolepermissions -------------------------------%>
            <%--<tr>--%>
                <%--&lt;%&ndash; todo 选中修改删除功能&ndash;%&gt;--%>
                <%--<td>--%>
                    <%--<input type="checkbox" name="rowid" class="action-checkbox" value="1" title="Select record" />--%>
                <%--</td>--%>
                <%--<td class="list-buttons-column">--%>
                    <%--&lt;%&ndash;修改按钮&ndash;%&gt;--%>
                    <%--<a class="icon" href="/sqla/simple/admin/user/edit/?id=1&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">--%>
                        <%--<span class="fa fa-pencil glyphicon glyphicon-pencil"></span>--%>
                    <%--</a>--%>
                    <%--&lt;%&ndash;删除按钮&ndash;%&gt;--%>
                    <%--<form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">--%>
                        <%--<input id="id" name="id" type="hidden" value="1">--%>
                        <%--<input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">--%>

                        <%--<button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">--%>
                            <%--<span class="fa fa-trash glyphicon glyphicon-trash"></span>--%>
                        <%--</button>--%>
                    <%--</form>--%>

                <%--</td>--%>
                <%--&lt;%&ndash; 选中修改删除功能-end--------------&ndash;%&gt;--%>

                <%--<td class="col-roleid">--%>
                    <%--Harry--%>
                <%--</td>--%>
                <%--<td class="col-rolename">--%>
                    <%--Brown--%>
                <%--</td>--%>
                <%--<td class="col-rolepermissions">--%>
                    <%--harry--%>
                <%--</td>--%>

            <%--</tr>--%>

    <%-----------------------------------------------------------------------------------------%>
<%------------------------表内--end--------------------%>
        </table>
    </div>
<%--------表内容--end------------------------------%>

<%--分页--%>
    <ul class="pagination">

        <li class="disabled">
            <a href="javascript:void(0)">&laquo;</a>
        </li>
        <li class="disabled">
            <a href="javascript:void(0)">&lt;</a>
        </li>
        <li class="active">
            <a href="javascript:void(0)">1</a>
        </li>
        <li>
            <a href="/sqla/simple/admin/user/?page=1">2</a>
        </li>
        <li>
            <a href="/sqla/simple/admin/user/?page=1">&gt;</a>
        </li>


        <li class="disabled">
            <a href="javascript:void(0)">&raquo;</a>
        </li>

    </ul>

    <form id="action_form" action="deletes.action" method="POST" style="display: none">
        <%--<input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">--%>
        <%--<input id="action" name="action" type="hidden" value="">--%>
    </form>
<%-------------分页----------------------------------------------------%>


</div>



<script src="../../static/vendor/jquery.min.js?v=2.1.4" type="text/javascript"></script>
<script src="../../static/bootstrap/bootstrap3/js/bootstrap.min.js?v=3.3.5" type="text/javascript"></script>
<script src="../../static/vendor/moment.min.js?v=2.9.0" type="text/javascript"></script>
<script src="../../static/vendor/select2/select2.min.js?v=3.5.2" type="text/javascript"></script>


<script src="../../static/admin/js/filters.js?v=1.0.0"></script>


<script src="../../static/vendor/bootstrap-daterangepicker/daterangepicker.js?v=1.3.22"></script>

<script src="../../static/admin/js/form.js?v=1.0.1"></script>




<script src="../../static/admin/js/actions.js?v=1.0.0"></script>
<script language="javascript">
    var modelActions = new AdminModelActions("Please select at least one record.", {"delete": "Are you sure you want to delete selected records?"});
</script>



<script language="javascript">
    (function($) {
        $('[data-role=tooltip]').tooltip({
            html: true,
            placement: 'bottom'
        });

    })(jQuery);

    // Catch exception when closing dialog with <esc> key
    // and prevent accidental deletions.
    function safeConfirm(msg) {
        try {
            var isconfirmed = confirm(msg);
            if (isconfirmed == true) {
                return true;
            }
            else {
                return false;
            }
        }
        catch(err) {
            return false;
        }
    }
</script>

</body>
</html>

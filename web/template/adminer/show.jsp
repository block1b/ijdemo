
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

    <%--展示查询到的表 todo --%>
    <table>
        <%--要展示的表头--%>
        <s:iterator value="#session.table_head" var="key">
            <td><s:property value="#key"/></td>
        </s:iterator>
        <s:iterator value="#session.table" var="line">
            <tr>
                <td><s:property value="#line.id"/></td>
            </tr>
        </s:iterator>
    </table>

    <ul class="nav nav-tabs actions-nav">
        <li class="active">
            <a href="javascript:void(0)">List (25)</a>
        </li>


        <li>
            <a href="" title="Create New Record">Create</a></li>


        <li class="dropdown">
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="javascript:void(0)">With selected<b class="caret"></b></a>
            <ul class="dropdown-menu">

                <li>
                    <a href="javascript:void(0)" onclick="return modelActions.execute('delete');">Delete</a>
                </li>

            </ul>

        </li>




    </ul>





    <div class="table-responsive">
        <table class="table table-striped table-bordered table-hover model-list">
            <thead>
            <tr>


                <th class="list-checkbox-column">
                    <input type="checkbox" name="rowtoggle" class="action-rowtoggle" title="Select all records" />
                </th>



                <th class="col-md-1">&nbsp;</th>




                <th class="column-header col-first_name">


                    <a href="/sqla/simple/admin/user/?sort=0" title="Sort by First Name">First Name</a>



                </th>


                <th class="column-header col-last_name">


                    <a href="/sqla/simple/admin/user/?sort=1" title="Sort by Last Name">Last Name</a>



                </th>


                <th class="column-header col-username">


                    <a href="/sqla/simple/admin/user/?sort=2" title="Sort by Username">Username</a>



                </th>


                <th class="column-header col-email">


                    <a href="/sqla/simple/admin/user/?sort=3" title="Sort by Email">Email</a>



                </th>


            </tr>
            </thead>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="1" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=1&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="1">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Harry

                </td>

                <td class="col-last_name">

                    Brown

                </td>

                <td class="col-username">

                    harry

                </td>

                <td class="col-email">

                    harry@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="2" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=2&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="2">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Amelia

                </td>

                <td class="col-last_name">

                    Smith

                </td>

                <td class="col-username">

                    amelia

                </td>

                <td class="col-email">

                    amelia@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="3" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=3&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="3">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Oliver

                </td>

                <td class="col-last_name">

                    Patel

                </td>

                <td class="col-username">

                    oliver

                </td>

                <td class="col-email">

                    oliver@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="4" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=4&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="4">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Jack

                </td>

                <td class="col-last_name">

                    Jones

                </td>

                <td class="col-username">

                    jack

                </td>

                <td class="col-email">

                    jack@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="5" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=5&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="5">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Isabella

                </td>

                <td class="col-last_name">

                    Williams

                </td>

                <td class="col-username">

                    isabella

                </td>

                <td class="col-email">

                    isabella@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="6" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=6&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="6">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Charlie

                </td>

                <td class="col-last_name">

                    Johnson

                </td>

                <td class="col-username">

                    charlie

                </td>

                <td class="col-email">

                    charlie@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="7" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=7&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="7">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Sophie

                </td>

                <td class="col-last_name">

                    Taylor

                </td>

                <td class="col-username">

                    sophie

                </td>

                <td class="col-email">

                    sophie@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="8" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=8&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="8">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Mia

                </td>

                <td class="col-last_name">

                    Thomas

                </td>

                <td class="col-username">

                    mia

                </td>

                <td class="col-email">

                    mia@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="9" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=9&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="9">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Jacob

                </td>

                <td class="col-last_name">

                    Roberts

                </td>

                <td class="col-username">

                    jacob

                </td>

                <td class="col-email">

                    jacob@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="10" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=10&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="10">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Thomas

                </td>

                <td class="col-last_name">

                    Khan

                </td>

                <td class="col-username">

                    thomas

                </td>

                <td class="col-email">

                    thomas@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="11" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=11&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="11">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Emily

                </td>

                <td class="col-last_name">

                    Lewis

                </td>

                <td class="col-username">

                    emily

                </td>

                <td class="col-email">

                    emily@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="12" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=12&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="12">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Lily

                </td>

                <td class="col-last_name">

                    Jackson

                </td>

                <td class="col-username">

                    lily

                </td>

                <td class="col-email">

                    lily@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="13" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=13&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="13">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Ava

                </td>

                <td class="col-last_name">

                    Clarke

                </td>

                <td class="col-username">

                    ava

                </td>

                <td class="col-email">

                    ava@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="14" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=14&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="14">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Isla

                </td>

                <td class="col-last_name">

                    James

                </td>

                <td class="col-username">

                    isla

                </td>

                <td class="col-email">

                    isla@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="15" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=15&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="15">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Alfie

                </td>

                <td class="col-last_name">

                    Phillips

                </td>

                <td class="col-username">

                    alfie

                </td>

                <td class="col-email">

                    alfie@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="16" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=16&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="16">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Olivia

                </td>

                <td class="col-last_name">

                    Wilson

                </td>

                <td class="col-username">

                    olivia

                </td>

                <td class="col-email">

                    olivia@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="17" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=17&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="17">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Jessica

                </td>

                <td class="col-last_name">

                    Ali

                </td>

                <td class="col-username">

                    jessica

                </td>

                <td class="col-email">

                    jessica@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="18" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=18&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="18">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    Riley

                </td>

                <td class="col-last_name">

                    Mason

                </td>

                <td class="col-username">

                    riley

                </td>

                <td class="col-email">

                    riley@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="19" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=19&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="19">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    William

                </td>

                <td class="col-last_name">

                    Mitchell

                </td>

                <td class="col-username">

                    william

                </td>

                <td class="col-email">

                    william@example.com

                </td>


            </tr>

            <tr>


                <td>
                    <input type="checkbox" name="rowid" class="action-checkbox" value="20" title="Select record" />
                </td>



                <td class="list-buttons-column">




                    <a class="icon" href="/sqla/simple/admin/user/edit/?id=20&amp;url=%2Fsqla%2Fsimple%2Fadmin%2Fuser%2F" title="Edit Record">
                        <span class="fa fa-pencil glyphicon glyphicon-pencil"></span>
                    </a>




                    <form class="icon" method="POST" action="/sqla/simple/admin/user/delete/">
                        <input id="id" name="id" type="hidden" value="20">
                        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">

                        <button onclick="return safeConfirm('Are you sure you want to delete this record?');" title="Delete record">
                            <span class="fa fa-trash glyphicon glyphicon-trash"></span>
                        </button>
                    </form>



                </td>


                <td class="col-first_name">

                    James

                </td>

                <td class="col-last_name">

                    Rose

                </td>

                <td class="col-username">

                    james

                </td>

                <td class="col-email">

                    james@example.com

                </td>


            </tr>

        </table>
    </div>



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








    <form id="action_form" action="/sqla/simple/admin/user/action/" method="POST" style="display: none">

        <input id="url" name="url" type="hidden" value="/sqla/simple/admin/user/">
        <input id="action" name="action" type="hidden" value="">
    </form>



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

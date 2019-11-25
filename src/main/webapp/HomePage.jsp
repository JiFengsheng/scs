<%--
  Created by IntelliJ IDEA.
  User: master
  Date: 2019/11/23
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <meta charset="UTF-8">
    <title>智能教室后台管理</title>

    <link rel="stylesheet" href="./css/bootstrap.css">
    <script src="./js/jquery.js"></script>
    <script src="./js/bootstrap.js"></script>
    <script src="./js/vue.js"></script>
    <script src="./js/vue-resource.js"></script>

    <style type="text/css">
        .main{
            position: fixed;
            top: 70px;
            width: 100%;
        }


    </style>
</head>
<body>
<div id="app">

    <nav class="navbar navbar-inverse navbar-static-top navbar-lg" role="navigation"
         style="font-size: 30px;font-family: 华文行楷;font-weight: bold;">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#" style="font-size: 25px;
                display: block;height: 70px;line-height: 40px">SmartClass</a>
            </div>
            <div>
                <ul class="nav navbar-nav">
                    <!--<li >
                        <a href="#home" data-toggle="tab"
                           style="display: block;height: 70px;line-height: 40px">
                            Home
                        </a>
                    </li>-->
                    <li class="active" >
                        <a href="#first" data-toggle="tab"
                           style="display: block;height: 70px;line-height: 40px">
                            系统管理
                        </a>
                    </li>
                    <li>
                        <a href="#second" data-toggle="tab"
                           style="display: block;height: 70px;line-height: 40px">
                            日志管理
                        </a>
                    </li>
                    <li>
                        <a href="#third" data-toggle="tab"
                           style="display: block;height: 70px;line-height: 40px">
                            权限管理
                        </a>
                    </li>
                    <li class="" style="float: right">
                        <a href="html/login.html" class="navbar-link"
                           style="display: block;height: 70px;line-height: 40px">
                            返回</a>
                    </li>

                </ul>

            </div>

        </div>
    </nav>

    <div class="main">
        <div id="content" class="tab-content" >
            <!--<div class="tab-pane fade " id="home">
                home
            </div>-->
            <div class="tab-pane fade in active" id="first"
                 style="height: calc(100vh)">
                <iframe scrolling="auto" frameborder="0"
                        src="html/SystemManager.html" style="width:100%;height:100%;">
                </iframe>
            </div>
            <div class="tab-pane fade" id="second"
                 style="height: calc(100vh)">
                <iframe scrolling="auto" frameborder="0"
                        src="html/LogManager.html" style="width:100%;height:100%;">
                </iframe>
            </div>
            <div class="tab-pane fade" id="third"
                 style="height: calc(100vh)">
                <iframe scrolling="auto" frameborder="0"
                        src="html/AccessManager.html" style="width:100%;height:100%;">
                </iframe>
            </div>

        </div>
    </div>


</div>


<script type="text/javascript">





</script>



</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/bootstrap.js"></script>
    <script src="js/jquery.js"></script>
    <script src="js/vue.js"></script>
    <script src="js/vue-resource.js"></script>
    <style type="text/css">
        /* #label2{
              display:none;
          }*/
        .body{
            background-image: url("backgroud/1.jpg");
            width: 100%;
            height: 822px;
            background-repeat:no-repeat;
            background-position:center;
        }
        .system{
            position: fixed;
            top:13%;
            text-shadow: 0px 5px 5px rgba(105, 105, 105, 0.9);
        }
        .foot{
            position: fixed;
            top:90%;
        }

        h1{
            color: black;
            font-family: 华文行楷;
            font-weight: bolder;
            font-size: 100px;
        }
        h4{
            color: white;
        }


        div.login{
            display: inline-block;
            position: fixed;
            left:50%;
            top:60%;
            width:600px;
            height:350px;
            margin-left: -300px;
            margin-top: -200px;
            border:1px solid #888;
            background-color: rgba(238, 220, 250, 0.5);
            text-align: center;
            border-radius: 7px;
        }

        .title{
            background-color: rgba(20, 0, 255, 0.8);
        }

        #label{
            display:inline-block !important;
        }


    </style>

</head>


<body>


<div id="app">
    <nav class="navbar navbar-default navbar-inverse navbar-fixed-top"
         style="font-size: 30px;font-family: 华文行楷;font-weight: bold;">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#" style="padding: 11px 10px 10px 10px;">
                    <img alt="Brand" src="./backgroud/a.png" style="width: 50px;height: 50px">
                </a>
            </div>
            <!--<p id="label" class="navbar-text navbar-right" style="padding-right: 10px;
                        font-family:微软雅黑;font-weight: normal;font-size: 24px">
                管理员
                <a href="manager.aspx" class="navbar-link" >登录
                    <span class="glyphicon glyphicon-user" aria-hidden="true"
                          style="padding: 0px 6px 0px 0px;"></span>
                </a>
            </p>-->
            <!--<p id="label2" class="navbar-text navbar-right" style="padding-right: 10px;
                        font-family:微软雅黑;font-weight: normal;font-size: 24px">
                <a href="" class="navbar-link" >返回</a>
            </p>-->
            <p class="navbar-text "style="color: white">广东海洋大学</p>
        </div>
    </nav>

    <div class="system container" style="text-align: center;width: 100%">
        <div><h1>智能教室管理系统</h1></div>
    </div>


    <div class="body">

        <div class="login" >
            <form id="loginForm"  class="form-horizontal"
                  action="http://localhost:8080/scs/LoginController">
                <fieldset>
                    <legend class="title" style="text-align: center;">
                        <h2 style="color: white">用户登录</h2>
                    </legend>
                    <br>
                    <div class="form-group">
                        <label for="name" class="col-sm-3 control-label" style="font-size: large">
                            用户名:
                        </label>
                        <div class="col-sm-7">
                            <input id="name" class="form-control input-lg" placeholder="请输入用户名" required/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  for="password" class="col-sm-3 control-label" style="font-size: large">
                            密&nbsp&nbsp&nbsp&nbsp码:
                        </label>
                        <div class="col-sm-7">
                            <input id="password"  class="form-control input-lg" placeholder="请输入密码"  required/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-5">
                            <div class="checkbox ">
                                <label>
                                    <input type="checkbox"> Remember me
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-1 col-sm-6">
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            &nbsp
                            <button type="submit" class="btn btn-info btn-lg"  >submit</button>
                            <button type="reset" value="reset" class="btn btn-info btn-lg">reset</button>
                        </div>
                        <div class="col-sm-2">
                            <a href="">
                                <button type="button" class="btn btn-link btn-lg" style="font-weight: bold;color: blue">
                                    注册新用户
                                </button>
                            </a>
                        </div>
                    </div>
                </fieldset>
            </form>
            <br>
        </div>



    </div>


    <div class="foot" style="text-align: center;width: 100%">
        <div><h4>Copyright©2019 nine</h4></div>
    </div>

    <div id="tip" style="display: none">${requestScope.get("tip")}</div>
</div>



<script src="vue/login.js"></script>







</body>
</html>

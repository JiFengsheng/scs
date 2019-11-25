<%--
  Created by IntelliJ IDEA.
  User: master
  Date: 2019/11/23
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>客户端主页</title>
    <link rel="stylesheet" href="./css/bootstrap.css">
    <script src="./js/jquery.js"></script>
    <script src="./js/bootstrap.js"></script>
    <script src="./js/vue.js"></script>
    <script src="./js/vue-resource.js"></script>
    <style type="text/css">

        #main{
            position: fixed;
            top: 70px;
            width: 100%;
        }

        .sidebar {
            /*float: left;*/
            z-index: 10;
            display: block;
            padding-left: 5px;
            overflow-x: hidden;
            overflow-y: auto;
            background-color: #f5f5f5;
            border-right: 1px solid #eee;
            width:100%;
            height:calc(100vh);
        }

        .nav-sidebar {
            margin-right: -21px; /* 20px padding + 1px border */
            margin-bottom: 20px;
            margin-left: -20px;
        }
        .nav-sidebar > li > a {
            font-size:x-large;
            padding-top:20px;
            padding-bottom:20px;
            padding-right: 20px;
            padding-left: 20px;
        }
        .nav-sidebar > .active > a,
        .nav-sidebar > .active > a:hover,
        .nav-sidebar > .active > a:focus {
            color: #fff;
            background-color: #428bca;
        }
        .left{
            float: left;
            width: 18%;
        }

        .right{
            float: right;
            width: 82%;
            /*background-color: white;*/
        }

        .clr{
            clear:both
        }

        ol > li{
            font-size:x-large;

            padding-top:12px;
            padding-bottom:12px;

        }

        .picture{
            text-align:center;
            width:100%;
            background-color: #428bca;
            margin-top:0px;
            border-bottom:1px solid grey;
            padding-top:15px;
            padding-bottom:18px;
        }


        body{
            margin:0px;
            width:100%;
            min-height:470px;
            overflow-y:auto;

        }

        .right{
            height:750px;
            overflow-y: auto;
            overflow-x: hidden;

        }

        form>div{
            padding-bottom: 15px;
            padding-left: 10px;
        }

    </style>



</head>
<body>

<div id="client">

    <nav class="navbar navbar-default navbar-inverse navbar-fixed-top"
         style="font-size: 30px;font-family: 华文行楷;font-weight: bold;">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#" style="padding: 11px 10px 10px 10px;">
                    <img alt="Brand" src="./backgroud/a.png" style="width: 50px;height: 50px">
                </a>
            </div>
            <p class="navbar-text "style="color: white">广东海洋大学</p>
            <p id="label2" class="navbar-text navbar-right" style="padding-right: 10px;
                        font-family:微软雅黑;font-weight: normal;font-size: 24px">
                <a href="" class="navbar-link" >返回</a>
            </p>

        </div>
    </nav>

    <div id="main">
        <div class="left">
            <div class="sidebar">
                <ul class="nav nav-sidebar">

                    <li class="active">
                        <a href="#access2" data-toggle="tab">个人信息</a>
                    </li>

                </ul>

            </div>
        </div>
        <div class="right">
            <div id="content" class="tab-content"
                 style="width: 100%;height: calc(100vh)">

                <div class="tab-pane in active" id="access2">

                    <div class="write" v-if="!isWrite">
                        <ol class="breadcrumb" style="margin-bottom: 0px">
                            <li style="padding-left:10px;">
                                <a href="" style="text-decoration: none">个人信息</a>
                            </li>
                            <li>
                                <a href="#" style="text-decoration: none">填写</a>
                            </li>
                        </ol>
                        <div style="padding: 12px">


                            <div class="panel panel-danger" >
                                <div class="panel-heading" style="padding-top:15px;padding-bottom:15px;">
                                    <h3 class="panel-title" style="font-size:22px;" >个人信息</h3>
                                </div>
                                <div class="panel-body">

                                    <form class="form-inline" method="post"
                                          action="http://localhost:8080/scs/insert"
                                          enctype="multipart/form-data"
                                          style="font-size: large;padding-left: 5px">
                                        <div class="row" >
                                            <div class="form-group ">
                                                <label for="name">姓名:</label>&nbsp;&nbsp;
                                                <input type="text" class="form-control input-lg "
                                                       id="name" placeholder="name" name="name" required>
                                            </div>

                                        </div>
                                        <div class="row">
                                            <div class="form-group ">
                                                <label for="id"class="">学号:</label>&nbsp;&nbsp;
                                                <input type="text" class="form-control input-lg "
                                                       id="id" placeholder="学号" name="id">
                                            </div>

                                        </div>


                                        <div class="row">
                                            <div class="form-group" >
                                                <label for="sex" class="">性别：</label>
                                                <select id="sex" class="form-control input-lg" name="sex">
                                                    <option value="" selected>--请选择--</option>
                                                    <option value="男">男</option>
                                                    <option value="女">女</option>
                                                </select>
                                            </div>

                                        </div>
                                        <div class="row">
                                            <div class="form-group ">
                                                <label for="birth"class="">生辰:</label>&nbsp;&nbsp;
                                                <input type="date" class="form-control input-lg "
                                                       id="birth" name="birth">
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="form-group" >
                                                <label for="grade" class="">年级：</label>
                                                <select id="grade" class="form-control input-lg"
                                                        name="grade"  @change="getGradeValue()">
                                                    <option value="" selected>&nbsp;&nbsp;---请选择---&nbsp;&nbsp;</option>
                                                    <template v-if="grades.length">

                                                        <option v-for="(grade,index) in grades" v-bind:value="grade" >{{grade}}</option>

                                                    </template>

                                                </select>
                                            </div>
                                            <div class="form-group" >
                                                <label for="academy" class="">学院：</label>
                                                <select id="academy" class="form-control input-lg"
                                                        name="academy" @change="getAcademyValue()">
                                                    <option value="" selected>&nbsp;&nbsp;---请选择---&nbsp;&nbsp;</option>
                                                    <template v-if="academys.length">
                                                        <option v-for="(academy,index) in academys" v-bind:value="academy" >{{academy}}</option>
                                                    </template>


                                                </select>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="form-group" >
                                                <label for="major" class="">专业：</label>
                                                <select id="major" class="form-control input-lg"
                                                        name="major" @change="getMajorValue()">
                                                    <option value="" selected>&nbsp;&nbsp;---请选择---&nbsp;&nbsp;</option>
                                                    <template v-if="majors.length">
                                                        <option v-for="(major,index) in majors" v-bind:value="major">
                                                            {{major}}
                                                        </option>

                                                    </template>


                                                </select>
                                            </div>

                                            <div class="form-group" >
                                                <label for="c" class="">班级：</label>
                                                <select id="c" class="form-control input-lg"
                                                        name="c" @change="getClassValue()">
                                                    <option value="" selected>&nbsp;&nbsp;---请选择---&nbsp;&nbsp;</option>
                                                    <template v-if="cs.length">
                                                        <option v-for="(c,index) in cs" v-bind:value="c.id">
                                                            {{c.name}}
                                                        </option>
                                                    </template>


                                                </select>
                                            </div>


                                        </div>
                                        <div class="row">
                                            <div class="form-group ">
                                                <label for="email">邮编:</label>&nbsp;&nbsp;
                                                <input type="text" class="form-control input-lg "
                                                       id="email" name="email"/>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="form-group " id="test1">
                                                <label for="admission"class="">入学日期:</label>
                                                <input type="date" class="form-control input-lg "
                                                       id="admission" name="admission"/>
                                            </div>
                                            &nbsp;&nbsp;
                                            <div class="form-group " id="test2">
                                                <label for="nativePlace">籍贯:</label>
                                                <input type="text" class="form-control input-lg "
                                                       id="nativePlace" name="nativePlace"/>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="form-group ">
                                                <label for="home">家庭地址:</label>
                                                <input type="text" class="form-control input-lg "
                                                       id="home" name="home" style="width: calc(69vh)"/>
                                            </div>
                                        </div>

                                        <div class="row">

                                            <div class="form-group">
                                                <label for="upload">选择文件：</label>
                                                <input type="file" name="upload" id="upload" />
                                            </div>
                                        </div>

                                        <div class="row" >
                                            <div class="col-sm-2 col-sm-offset-4">
                                                <input type="submit" class="btn btn-primary btn-lg btn-block">
                                            </div>
                                            <div class="col-sm-2">
                                                <input type="reset" class="btn btn-default btn-lg btn-block">
                                            </div>
                                        </div>
                                        <br>

                                    </form>


                                </div>

                            </div>


                        </div>


                    </div>

                    <div class="formation" v-if="isWrite">
                        <ol class="breadcrumb" style="margin-bottom:0px;">
                            <li style="padding-left:10px;"><a href="">个人信息</a></li>
                            <!--<li><a href="#">填写</a></li>-->
                        </ol>

                        <div class="picture ">
                            <div>
                                <img src='/upload/234a114e-6912-4387-9262-0aaec6c9a3ef.jpg'
                                     width="200" height="200" class="img-circle"
                                     style="border:1px solid grey;box-shadow:0px 5px 5px rgba(40, 40, 40, 0.9)">
                            </div>
                        </div>

                        <div class="panel panel-success" >
                            <div class="panel-heading" style="padding-top:11px;padding-bottom:10px;">
                                <h3 class="panel-title" style="font-size:22px;" >
                                    个人信息&nbsp
                                    <a href="" class="btn btn-link " style="font-size:20px;"
                                       data-toggle="modal" data-target="#myModal">
                                        编辑
                                    </a>
                                </h3>

                            </div>
                            <div class="panel-body">







                            </div>

                        </div>


                    </div>



                </div>



            </div>
        </div>


        <div class="clr"></div>

    </div>


    <!-- Modal -->
    <div class="modal fade bs-example-modal-lg" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                </div>
                <div class="modal-body">
                    ...
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>





</div>


<script src="./vue/client.js"></script>
</body>
</html>

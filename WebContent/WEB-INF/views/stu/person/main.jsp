<%--
  Created by IntelliJ IDEA.
  User: liujingtao
  Date: 2017-10-24
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html style="width: 100%;height: 100%">
<head>
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="../../eastCMS/js/jquery-easyui-1.5.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../eastCMS/js/jquery-easyui-1.5.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../eastCMS/js/jquery-easyui-1.5.1/demo/demo.css">
    <script type="text/javascript" src="../../eastCMS/js/jquery.js"></script>
    <%--<script type="text/javascript" src="../../js/jquery.easyui.min.js"></script>--%>

    <script type="text/javascript" src="../../eastCMS/js/jquery-easyui-1.5.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../eastCMS/js/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../eastCMS/js/tools.js"></script>
    <script type="text/javascript" src="../../eastCMS/js/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="../../eastCMS/js/dataformat.js"></script>
    <script type="text/javascript" src="../../eastCMS/js/echarts.js"></script>

    

    
    <style type="text/css">
        .content{
            width: 100%;
            height: 99%;
            border: 0px solid red;
        }
        .left{
            width: 39.5%;
            height: 100%;
            float: left;
            border: 0px solid red;
        }
       .right{
       float:left;
       margin-left:20px;
       width:500px;
       height:500px;
       border:1px solid black;
       }
       .right img{
       width:100%;
       height:100%; 
       }
        table tr td{
            color: #949494;
            font-family: 'Microsoft Yahei', '微软雅黑';
            font-size: 18px;
            text-align: left;
        }
        table tr td:first-child{
            color: #949494;
            font-family: 'Microsoft Yahei', '微软雅黑';
            font-size: 18px;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="content">
    <div class="left">
        <div style="float: left;width: 10%;height: 45px;border: 0px solid red;"></div>
        <div style="float: left;width: 78%;height: 45px;border-bottom: 3px solid #949494;font-size: 30px;font-weight: 900;text-align: center;font-family: 'Microsoft Yahei', '微软雅黑';color: #949494">个人信息</div>
        <div style="float: left;width: 10%;height: 45px;border: 0px solid red;"></div>
        <div style="float: left;width: 99%;height: 80%;margin-top: 0.5%;border: 0px solid red">
            <table border="0" width="100%" style="height: 100%">
                <tr>
                    <td style="width: 45%">
                        姓名：
                    </td>
                    <td id="loginName" >
                      ${stu.name }
                    </td>
                </tr>
                <tr>
                    <td>
                        手机号：
                    </td>
                    <td id="mphone">
                   ${stu.tel }
                    </td>
                </tr>
                <tr>
                    <td>
                        地址：
                    </td>
                    <td id="address">
                    ${stu.address }
                    </td>
                </tr>
                <tr>
                    <td>
                        头像：
                    </td>
                    <td id="mqq">
                    <img alt="#" src="${stu.files}" style="width:50px;height: 50px">
                    </td>
                </tr>

            </table>
 
        </div>
    </div>
    
   	<div class="right">
      <img src="${pageContext.request.contextPath }/toLookImage">  
    </div>
 
   	
</div>
</body>

  

</html>

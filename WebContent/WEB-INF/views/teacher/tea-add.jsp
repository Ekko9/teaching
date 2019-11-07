<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />

<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<title>教师列表</title>
</head>
<body>
  <div class="page-container">
      <form:form action="${pageContext.request.contextPath}/tea/save" modelAttribute="teacher" method="post">
		<div class="row cl">
			<label class="form-label col-xs-3 col-sm-2"><span class="c-red">*</span>教师姓名：</label>
			<div class="formControls col-xs-6 col-sm-8">
				<form:input path="name" size="50" class="input-text"/>
			</div>
			<div class="formControls col-xs-3 col-sm-2">
                <form:errors path="name" cssClass="error"></form:errors>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>所属专业：</label>
			<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
                <form:select path="majid" class="select">
                    <form:option value="0">----请选择专业----</form:option>
                </form:select>
                <form:errors path="majid"></form:errors>
				</span> 
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">工号：</label>
			<div class="formControls col-xs-8 col-sm-9">
			    <form:input path="workid" size="50" class="input-text"/>
                <form:errors path="workid" cssClass="error"></form:errors>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">登录名：</label>
			<div class="formControls col-xs-8 col-sm-9">
			    <form:input path="loginname" size="50"/>
                <form:errors path="loginname" cssClass="error" class="input-text"></form:errors>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">密码：</label>
			<div class="formControls col-xs-8 col-sm-9">
			    <form:password path="password" size="50" class="input-text"/>
                <form:errors path="password" cssClass="error" class="input-text"></form:errors>
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
			    <form:hidden path="id"/>
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 提交保存</button>
				<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div> 
		</form:form>
		${msg }
  </div>	
</body>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript">
$(function(){
	$.ajax({
		url:"tea/getMajList",
		type:'post',
		dataType: "json",
		success: function(data){
			$(data).each(function(index){
		
				$("#majid").append('<option value="'+data[index].id+'">'+data[index].name+'</option>'); 
			
			})
		}
	});
})
</script>
</html>
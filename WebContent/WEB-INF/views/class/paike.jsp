<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css"
	href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>排课</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
		班级管理 <span class="c-gray en">&gt;</span> 排课 <a
			class="btn btn-success radius r"
			style="line-height:1.6em;margin-top:3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	<form action="cla/savectc" method="post" id="myform">
		<div class="page-container">
			<div class="text-c">
				请选择周期:<select id="weekid" name="weekid" class="select"
					style="width:60%">
					<option value="1">周一</option>
					<option value="2">周二</option>
					<option value="3">周三</option>
					<option value="4">周四</option>
					<option value="5">周五</option>
					<option value="6">周六</option>
					<option value="7">周日</option>
				</select>
			</div>
			<div class="mt-20">
				<table style="width:80%;margin:auto"
					class="table table-border table-bordered table-bg table-hover table-sort">
					<thead>
						<tr class="text-c">
							<th class="text-center" style="width:200px">时间</th>
							<th class="text-center">课程
							<th class="text-center">类别
							<th class="text-center">老师</th>
						</tr>
					</thead>
					<tbody>
						<tr class="text-c va-m">
							<td class="text-center">第1节</td>
							<td><select name="cids" id="cids" class="select">
									<option value="0">--选择课程--</option>
									<c:forEach items="${coulist }" var="c">
										<option value="${c.id }">${c.name }</option>
									</c:forEach>
							</select></td>
							<td class="text-center"><select name="types" class="select">
									<option value="0">必修</option>
									<option value="1">选修</option>
							</select></td>
							<td><select name="tids" id="tids1" ondblclick="getteas(1)"
								class="select">
									<option value="0">----双击选择老师----</option>
							</select></td>
						</tr>
						<tr class="text-c va-m">
							<td class="text-center">第2节</td>
							<td class="text-center"><select name="cids" id="cids"
								class="select">
									<option value="0">--选择课程--</option>
									<c:forEach items="${coulist }" var="c">
										<option value="${c.id }">${c.name }</option>
									</c:forEach>
							</select></td>
							<td class="text-center"><select name="types" class="select">
									<option value="0">必修</option>
									<option value="1">选修</option>
							</select></td>
							<td class="text-center"><select name="tids" id="tids2"
								ondblclick="getteas(2)" class="select">
									<option value="0">--双击选择老师--</option>
							</select></td>
						</tr>
						<tr class="text-c va-m">
							<td class="text-center">第3节</td>
							<td class="text-center"><select name="cids" id="cids"
								class="select">
									<option value="0">--选择课程--</option>
									<c:forEach items="${coulist }" var="c">
										<option value="${c.id }">${c.name }</option>
									</c:forEach>
							</select></td>
							<td class="text-center"><select type="select" name="types"
								class="select">
									<option value="0">必修</option>
									<option value="1">选修</option>
							</select></td>
							<td class="text-center"><select name="tids" id="tids3"
								ondblclick="getteas(3)" class="select">
									<option value="0">----双击选择老师----</option>
							</select></td>
						</tr>
						<tr class="text-c va-m">
							<td class="text-center">第4节</td>
							<td class="text-center"><select name="cids" id="cids"
								class="select">
									<option value="0">--选择课程--</option>
									<c:forEach items="${coulist }" var="c">
										<option value="${c.id }">${c.name }</option>
									</c:forEach>
							</select></td>
							<td class="text-center"><select name="types" class="select">
									<option value="0">必修</option>
									<option value="1">选修</option>
							</select></td>
							<td class="text-center"><select class="select" name="tids"
								id="tids4" ondblclick="getteas(4)">
									<option value="0">----双击选择老师----</option>
							</select></td>
						</tr>
						<tr class="text-c va-m">
							<td colspan="4" class="text-center">
							<input type="hidden" value="0" id="flag" name="flag">
							<input type="submit" class="btn btn-primary radius" value="继续排课" /> 
							<input type="button" class="btn btn-primary radius" value="结束排课" onclick="over()"/>
							 <input type="hidden" value="${claid}" id="claid" name="claid">
							</td>
						</tr>
					</tbody>
				</table>
				
				<table style="width:80%;margin:auto"
					class="table table-border table-bordered table-bg table-hover table-sort">
					<tr>
						<td colspan="3">周一</td>
					</tr>	
					<c:forEach items="${kblist1 }" var="k">
					<tr>
						<td>${k.timeid }</td>
						<td>${k.tename }</td>
						<td>${k.couname }</td>
					</tr>
					</c:forEach>
					<tr>
						<td colspan="3">周二</td>
					</tr>	
					<c:forEach items="${kblist2 }" var="k">
					<tr>
						<td>${k.timeid }</td>
						<td>${k.tename }</td>
						<td>${k.couname }</td>
					</tr>
					</c:forEach>
					<tr>
						<td colspan="3">周三</td>
					</tr>	
					<c:forEach items="${kblist3 }" var="k">
					<tr>
						<td>${k.timeid }</td>
						<td>${k.tename }</td>
						<td>${k.couname }</td>
					</tr>
					</c:forEach>
					<tr>
						<td colspan="3">周四</td>
					</tr>	
					<c:forEach items="${kblist4 }" var="k">
					<tr>
						<td>${k.timeid }</td>
						<td>${k.tename }</td>
						<td>${k.couname }</td>
					</tr>
					</c:forEach>
					<tr>
						<td colspan="3">周五</td>
					</tr>	
					<c:forEach items="${kblist5 }" var="k">
					<tr>
						<td>${k.timeid }</td>
						<td>${k.tename }</td>
						<td>${k.couname }</td>
					</tr>
					</c:forEach>
					
			    </table>
			</div>
		</div>
	</form>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->
	<script type="text/javascript">
		function getteas(timeid) {
			
			var weekid = $("#weekid").val();
			var claid = $("#claid").val();
			$("#" + 'tids' + timeid).html("<option value='0'>----双击选择老师----</option>");
			$.ajax({
				url : 'cla/getTeas',
				type : 'post',
				data : {
					'timeid' : timeid,
					'weekid' : weekid,
					'claid' : claid
				},
				
				success : function(data) {
					//解析教师集合
					
					$(data).each(function(index) {
						 $("#" + 'tids' + timeid).append('<option value="' + data[index].id + '">' + data[index].name + '</option>'); 
						/*  $("#tids1").append('<option value="' + data[index].id + '">' + data[index].name + '</option>'); */
					});
				}
			});
		}
		
		function over(){
			$("#flag").val(1);
			$("#myform").submit();
		}
	</script>
</body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'kb.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/H-ui.admin.css" />
<!-- <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" /> -->
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/style.css" />
</head>


<body>
	<div style="height: 10%"></div>
	<table frame=box border=1 align=center cellpadding=0 cellspacing=0
		bordercolor=black
		class="table table-hover table-bordered table-striped table-condensed">
		<caption style="margin-bottom: 30px; font-size: 20px; color: blue">${teach.name}个人课表</caption>
		<thead>
			<tr class="text-c" style="height: 50px">
				<td colspan=2 align="center">时间</td>
				<td align="center">星期一</td>
				<td align="center">星期二</td>
				<td align="center">星期三</td>
				<td align="center">星期四</td>
				<td align="center">星期五</td>
				<td align="center">星期六</td>
				<td align="center">星期日</td>
			</tr>
		</thead>
		<tbody>
			<tr class="text-c" style="height: 75px">
				<td rowspan=2 align=center id="ti">上午</td>
				<td id="ti" align=center>第<br>1<br>节
				</td>
				<td align=center id="1-1">
					<!-- WEB应用开发技术<br>周一第1,2节{第1-16周} <br>熊俊涛(熊俊涛)<br>3502 -->
				</td>
				<td align=center id="1-2">
					<!-- 线性代数<br>周二第1,2节{第1-8周}<br>赵立新<br>3202 -->
				</td>
				<td align=center id="1-3">
					<!-- Internet与Intranet技术<br>周三第1,2节{第1-12周}<br>张建桃<br>3401 -->
				</td>
				<td align=center id="1-4">
					<!-- 管理统计学<br>周四第1,2节{第1-16周}<br>张建桃(张建桃)<br>3301 -->
				</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr class="text-c" style="height: 75px">
				<td id="ti" align="center">第<br>2<br>节
				</td>
				<td rowspan=1 align=center id="2-1">
					<!-- WEB应用开发技术<br>周一第1,2节{第1-16周} <br>熊俊涛(熊俊涛)<br>3502 -->
				</td>
				<td rowspan=1 align=center id="2-2">
					<!-- 线性代数<br>周二第1,2节{第1-8周}<br>赵立新<br>3202 -->
				</td>
				<td rowspan=1 align=center id="2-3">
					<!-- Internet与Intranet技术<br>周三第1,2节{第1-12周}<br>张建桃<br>3401 -->
				</td>
				<td rowspan=1 align=center id="2-4">
					<!-- 管理统计学<br>周四第1,2节{第1-16周}<br>张建桃(张建桃)<br>3301 -->
				</td>
				<td id="2-5"></td>
				<td id="2-6"></td>
				<td id="2-7"></td>
			</tr>
			<tr class="text-c" style="height: 75px">
				<td rowspan=2 align=center id="ti">下午</td>
				<td id="ti" align="center">第<br>1<br>节
				</td>
				<td rowspan=1 align=center id="3-1">
					<!-- WEB应用开发技术<br>周一第1,2节{第1-16周} <br>熊俊涛(熊俊涛)<br>3502 -->
				</td>
				<td rowspan=1 align=center id="3-2">
					<!-- 线性代数<br>周二第1,2节{第1-8周}<br>赵立新<br>3202 -->
				</td>
				<td rowspan=1 align=center id="3-3"></td>
				<td rowspan=1 align=center id="3-4"></td>
				<td id="3-5"></td>
				<td id="3-6"></td>
				<td id="3-7"></td>
			</tr>
			<tr class="text-c" style="height: 75px">
				<td id="ti" align="center">第<br>2<br>节
				</td>
				<td rowspan=1 align=center id="4-1"></td>
				<td rowspan=1 align=center id="4-2"></td>
				<td rowspan=1 align=center id="4-3"></td>
				<td rowspan=1 align=center id="4-4"></td>
				<td id="4-5"></td>
				<td id="4-6"></td>
				<td id="4-7"></td>
			</tr>
		</tbody>
	</table>
</body>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
		url:'tea/teakbList',
		type:'post',
		dataType:'json',
		success:function(data){
			$(data).each(function(index){
				var id = data[index].timeid+'-'+data[index].weekid;
				$("#"+id).html(data[index].claname+'<br>'+data[index].couname+'<br>'+data[index].typestr);
			})
			
		}
		})
	})
</script>
</html>

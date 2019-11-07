<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link href="<c:url value="/styles/main.css" />" type="text/css"
    rel="stylesheet" />
<title>选课</title>
<link rel="stylesheet" type="text/css"
	href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/H-ui.admin.css" />
<!-- <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" /> -->
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/style.css" />
<script type="text/javascript" src="<c:url value="/styles/bootstrap/js/jquery-1.10.2.js"/>" ></script>
<script type="text/javascript">
function showmsg(){
      if("${msg}"==1){
           alert("操作成功！");
         }
      }
</script>
</head>
<body onload="showmsg()" class="pos-r">
 <div class="main">
         <nav class="breadcrumb">
        
			<i class="Hui-iconfont"></i> 首页 <span class="c-gray en">&gt;</span>
			课程管理<span class="c-gray en">&gt;</span> 学生选课 <a
				class="btn btn-success radius r"
				style="line-height:1.6em;margin-top:3px"
				href="javascript:location.replace(location.href);" title="刷新"><i
				class="Hui-iconfont">&#xe68f;</i></a>
		</nav>
		<div class="page-container">
		 <form action="${pageContext.request.contextPath}/stu/saveCourse" method="post">
         <table class="table table-border table-bordered table-bg table-hover table-sort">
         	<thead>
         	  <tr class="text-c">
         	    <th><input type="checkbox"></th>
         	    <th>课程名称</th>
         	    <!-- <th>课程类别</th> -->
         	    <th>任课老师</th>
         	   </tr>
         	</thead>
         	<tbody>
         	<c:forEach items="${ctclist }" var="c">
		        <tr class="text-c">
			        <td>
			          <input type="checkbox" name="ids" value="${c.tid}_${c.couid}">
			        </td>
			        <td>${c.couname }</td>
			        
			        <td>${c.tename }</td>
		        </tr>
		        </c:forEach>
		     </tbody>
		     <tr class="text-c">
		       <td colspan="5"><input type="submit" value="提交"  class="btn btn-success radius"/></td>
		     </tr>  
		 </table>
		    ${msg }
		  </form>
		 <br>
		 </div>
		
	</div>
</body>
</html>
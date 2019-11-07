<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/styles/main.css"/>"  type="text/css" rel="stylesheet" />
<title>查看学生</title>
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
    <nav class="breadcrumb">
			<i class="Hui-iconfont"></i> 首页 <span class="c-gray en">&gt;</span>
			查看学生<span class="c-gray en">&gt;</span>我的学生<a
				class="btn btn-success radius r"
				style="line-height:1.6em;margin-top:3px"
				href="javascript:location.replace(location.href);" title="刷新"><i
				class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
    <div class="main">
        <form action="<c:url value="/tea/mystu"/>" method="post">
        <div class="page-container">
          <div class="ee" style="width:100%">
             <div style="width:20%;float:left"> 
				   <span class="select-box">
		                <select name="claid" class=select>
		                   <option value="0">--请选择班级--</option>
		                   <c:forEach items="${clist}" var="c">
		                   	<option value="${c.id}" <c:if test="${c.id==claid}">selected="selected" </c:if>>${c.name}</option>
		                   </c:forEach>
		                 </select>
				   </span> 
				</div>
			   <div style="width:20%;float:left"> 	
				<div class="radio-box">
				   <input type="radio" name="type" value="0" <c:if test="${type==0}">checked="checked" </c:if>>必修课
                   <input type="radio" name="type" value="1" <c:if test="${type==1}">checked="checked" </c:if>>选修课
				</div>
				</div>
				<div style="width:20%;float:left">
				  <input type="submit" value="查询" class="btn btn-primary radius">
				</div>
          </div>
        </div>
        <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort">
          <thead>  
            <tr class="text-c">
                <th>学生姓名</th>
                <th>学生性别</th>
                <th>联系电话</th>
                <th>所修课程</th>
                <th>总成绩</th>
                <th>操作</th>
            </tr>
          </thead>
          <tbody>
          <c:forEach items="${myStuList}" var="s">
                <tr class="text-c va-m">
                    <td class="text-l">${s.name}</td>
                    <td class="text-l">
                      ${s.sex}
                    </td>
                    <td class="text-l">${s.tel}</td>
                    <td class="text-l">${s.couname}</td>
                    <td>${s.score}</td>
                    <td class="text-l">
                    <c:if test="${s.statis==1}">
                    	已录入
                    </c:if>
                    <c:if test="${s.statis==0}">
                    <a href="tea/setGrade/${s.cid}/${s.id}">录入成绩</a>  
                    </c:if>
                    </td>
                </tr>
                </c:forEach>
           </tbody>   
        </table>
        </div>
        <script type="text/javascript" src="<c:url value="/scripts/jquery-1.10.2.min.js"/>" ></script>
    </form>
    </div>
</body>
</html>

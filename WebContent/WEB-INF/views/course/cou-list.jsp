﻿<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/H-ui.admin.css" />
<!-- <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" /> -->
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/style.css" />
<title>课程列表</title>
<!-- <link rel="stylesheet" href="lib/zTree/v3/css/zTreeStyle/zTreeStyle.css" type="text/css"> -->
</head>
<body class="pos-r">
	<div>
		<nav class="breadcrumb">
			<i class="Hui-iconfont"></i> 首页 <span class="c-gray en">&gt;</span>
			课程管理 <span class="c-gray en">&gt;</span> 课程列表 <a
				class="btn btn-success radius r"
				style="line-height:1.6em;margin-top:3px"
				href="javascript:location.replace(location.href);" title="刷新"><i
				class="Hui-iconfont">&#xe68f;</i></a>
		</nav>
		<div class="page-container">
			<form action="${pageContext.request.contextPath }/cou" method="post" id="wform">
			<div class="ee" style="width:100%">
				<input type="hidden" id="pageNO" value="" name="pageNO" />
			</div>
			</form>
		</div>
		<div class="page-container">
			<div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l"><a href="javascript:;" onclick="datadel()"
					class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
						批量删除</a> <a class="btn btn-primary radius"
					onclick="cou_add('添加课程','${pageContext.request.contextPath }/cou/showadd')"
					href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加课程</a>
				</span>
			</div>
			<form action="cou/datadel" id="myform" method="post">
			<div class="mt-20">
				<table
					class="table table-border table-bordered table-bg table-hover table-sort">
					<thead>
						<tr class="text-c">
						    <th ><input type="checkbox" id="chbAll"></th>
			                <th >课程编号</th>
			                <th >课程名称</th>
			                <th >课程介绍</th>
			                <th >操作</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${clist}" var="c">
						<tr class="text-c va-m">
						    <td><input type="checkbox" name="id" value="${c.id}"></td>
		                    <td class="text-l">${c.id}</td>
		                    <td class="text-l">${c.name}</td>
		                    <td class="text-l">${c.remark}</td>
		                    <td>
		                    <a href="cou/del?cid=${c.id}" class="btn btn-danger radius">删除</a>
		                    <a  class="btn btn-primary radius"
								onClick="cou_edit('课程编辑','cou/showadd','${c.id}')"
								href="javascript:;" title="编辑"><i class="Hui-iconfont">编辑</i></a>
		                    </td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			</form>
		</div>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20">
	    <div style="width:60%;float:right">
	    </div>
	    
	    <div style="width:10%;float:right"><span>共有数据：<strong>${count}</strong> 条</span></div> 
	    <div id="pager" style="width:20%;float:right">
	    </div>
	</div>
    
    <link href="static/page/pagination.css"  type="text/css" rel="stylesheet" />
    <script type="text/javascript" src="static/page/jquery-1.10.2.min.js" ></script>
        <script type="text/javascript" src="static/page/jquery.pagination.js" ></script>
        <script type="text/javascript">
        	
           //初始化分页组件
           var count=${count};
           var size=${size};
           var pageNO=${pageNO};
           //alert(count+"==="+size+"==="+pageNO);
           $("#pager").pagination(count, {
               items_per_page:size,
               current_page:pageNO-1,
               next_text:"下一页",
               prev_text:"上一页",
               num_edge_entries:2,
               load_first_page:false,
               callback:handlePaginationClick
            });
           
           //回调方法
           function handlePaginationClick(new_page_index, pagination_container){
               /* location.href="<c:url value="/stu"/>?pageNO="+(new_page_index+1)+
                      "&majid="+${stu.majid}+"&classid="+${stu.classid}; */
                //alert(new_page_index+1);
                $('#pageNO').val(new_page_index+1);  
                $('#wform').submit();   
           }
           
           
           function datadel(){
        	   var len = $("input[name='id']:checked").length;
        	   if(len>0){
               $('#myform').submit();
        	   }else{
        		alert("请选择要删除的数据");
        	   }
           }   
        </script>
        
        

	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->
	
	<script type="text/javascript">
  
/*课程-添加*/
function cou_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}

/*产品-编辑*/
function cou_edit(title,url,id){
    var newurl=url+'?cid='+id;
    //alert(newurl);
	/* var index = layer.open({
		type: 2,
		title: title,
		content: newurl,
		
	});
	layer.full(index);  */
	location.href=newurl;
}

</script>
</body>
</html>
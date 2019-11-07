<!DOCTYPE HTML>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>学生列表</title>
<!-- <link rel="stylesheet" href="lib/zTree/v3/css/zTreeStyle/zTreeStyle.css" type="text/css"> -->
</head>
<body class="pos-r">
	<div>
		<nav class="breadcrumb">
			<i class="Hui-iconfont"></i> 首页 <span class="c-gray en">&gt;</span>
			年级管理 <span class="c-gray en">&gt;</span> 班级列表 <a
				class="btn btn-success radius r"
				style="line-height:1.6em;margin-top:3px"
				href="javascript:location.replace(location.href);" title="刷新"><i
				class="Hui-iconfont">&#xe68f;</i></a>
		</nav>
		<div class="page-container">
			<div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l"><a href="javascript:;" onclick="datadel()"
					class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
						批量删除</a> <a class="btn btn-primary radius"
					onclick="maj_add('添加班级','${pageContext.request.contextPath }/cla/showadd')"
					href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加班级</a>
				</span>
			</div>
			<form action="cla/mutidel" id="myform" method="post">
			<div class="mt-20">
				<table
					class="table table-border table-bordered table-bg table-hover table-sort">
					<thead>
						<tr class="text-c">
						    <th ><input type="checkbox" id="chbAll"></th>
			                <th >班级编号</th>
			                <th >班级名称</th>
			                <th >班级类型</th>
			                <th >班级专业</th>
			                <th >操作</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${clist }" var="c">
					     <tr class="text-c va-m">
						    <td><input type="checkbox" name="id" value="${c.id }"></td>
		                    <td class="text-l">${c.id }</td>
		                    <td class="text-l">${c.name }</td>
		                    <td class="text-l">${c.type }</td>
		                    <td class="text-l">${c.maj.name }</td>
		                    <td>
		                    <a href="cla/mutidel1?cid=${c.id}" class="btn btn-danger radius">删除</a>
		                    <a  class="btn btn-primary radius"
								onClick="maj_edit('学生编辑','cla/showadd','${c.id}')"
								href="javascript:;" title="编辑"><i class="Hui-iconfont">编辑</i></a>
							<a href="cla/paike?claid=${c.id}" class="btn btn-danger radius">排课</a>	
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
	    <div style="width:6s0%;float:right">
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
               /* location.href="<c:url value="/maj"/>?pageNO="+(new_page_index+1)+
                      "&majid="+${maj.majid}+"&classid="+${maj.classid}; */
                //alert(new_page_index+1);
                location.href="<c:url value="/cla"/>?pageNO="+(new_page_index+1);
           }
           
        </script>
        
        

	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->
	
	

	<script type="text/javascript">
/* $('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  {"orderable":false,"aTargets":[0,7]}// 制定列不参与排序
	]
}); */
/*学生-添加*/
function maj_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}

/*产品-编辑*/
function maj_edit(title,url,id){
    var newurl=url+'?cid='+id;
    //alert(newurl);
	var index = layer.open({
		type: 2,
		title: title,
		content: newurl,
		
	});
	layer.full(index);
}

function datadel(){
	var len = $("input[name='id']:checked").length;
	if(len>0){
		$("#myform").submit();
	}else{
		alert("请选择要删除的数据");
	}
}
</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head></head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员注册</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
<script src="../js/jquery-1.11.3.min.js" type="text/javascript"></script>
<!-- 引入表单校验jQuery插件 -->
<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="../css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}

font1 {
	color: #3164af;
	font-size: 18px;
	font-weight: normal;
	padding: 0 10px;
}
.error{
	color:red
}
</style>

<script type="text/javascript">
//自定义校验规则
$.validator.addMethod(
	//规则的名称	
		"isSuitable",
	//校验的函数
	function(value,element,params){
		//value:输入的内容
		//element：被校验的元素对象
		//params规则对应的参数值;
		var reg = /^[a-zA-Z](?=.*[A-Za-z])(?=.*\d)(?=.*[-_!@#$%^&*])([-_!@#$%^&*a-zA-Z0-9]{6,16})$/;
		return this.optional(element)||(reg.test(value));}
	
	);

$(function(){
	$("#myform").validate({
		rules:{
			"uid":{
				"required":true,
		    	"rangelength":[10,10]	
		        },
		    "uname":{
		    	"required":true	
		    	},
		     "upassword":{
		    	 "required":true,
			     "rangelength":[6,16],
			    	"isSuitable":true	
		     	},
		    "academy":{
		    	"required":true	
		    	},
		    "major":{
		    	"required":true	
		    	},
		    "phone":{
		    	"required":true	
		    	}
		    },
		messages:{
			"uid":{
				"required":"学号不能为空",
	    		"rangelength":"用户名长度必须为10位"
		    },
		    "uname":{
		    	"required":"姓名不能为空"
	    	},
	    	"upassword":{
	    		"required":"密码不能为空",
	    		"rangelength":"密码长度必须为6-16位",
	    		"isSuitable":"必须以首字母开头且最小包含一个字母、数字、和特殊符号-_!@#$%^&*"
		     },
		    "academy":{
		    	"required":"学院不能为空"	
		    	},
		    "major":{
		    	"required":"专业不能为空"
		    	},
		    "phone":{
		    	"required":"联系方式不能为空"	
		    	}
		}
	});
});
</script>
</head>
<body>

	<!-- 引入header.jsp -->
	<jsp:include page="userheader.jsp"></jsp:include>

	<div class="container"
		style="width: 100%; background: url('image/regist_bg.jpg');">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8"
				style="background: #fff; padding: 40px 80px; margin: 30px; border: 7px solid #ccc;">
				<font1>会员注册</font1>USER REGISTER
				<form id="myform" class="form-horizontal" action="/user/register" method="post" style="margin-top: 5px;">
					<div class="form-group">
						<label for="uid" class="col-sm-2 control-label">学号</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="uid" name="uid"
								placeholder="请输入学号">
						</div>
					</div>
					<div class="form-group">
						<label for="uname" class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="uname" name="uname"
								placeholder="请输入姓名">
						</div>
					</div>
					<div class="form-group">
						<label for="upassword" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-6">
							<input type="password" class="form-control" id="upassword" name="upassword"
								placeholder="请输入密码">
						</div>
					</div>
					
					
					<div class="form-group opt">
						<label for="inlineRadio1" class="col-sm-2 control-label">性别</label>
						<div class="col-sm-6">
							<label class="radio-inline"> <input type="radio"
								name="usex" id="sex1" value="男" >男</label>
							 <label class="radio-inline"> <input type="radio"
								name="usex" id="sex2" value="女">女</label>
						</div>
					</div>
					<div class="form-group">
						<label for="academy" class="col-sm-2 control-label">学院</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="academy" name="academy"
								placeholder="请输入学院">
						</div>
					</div>
					<div class="form-group">
						<label for="major" class="col-sm-2 control-label">专业</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="major" name="major"
								placeholder="请输入专业">
						</div>
					</div>
					<div class="form-group">
						<label for="phone" class="col-sm-2 control-label">电话</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="phone" name="phone"
								placeholder="请输入电话">
						</div>
					</div>
					<font color="red"><span>${ms }</span></font>

					

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="submit" width="100" value="注册" name="submit"
								style=" height: 35px; width: 100px; color: black;">
						</div>
					</div>
				</form>
			</div>

			<div class="col-md-2"></div>

		</div>
	</div>

	

</body>
</html>





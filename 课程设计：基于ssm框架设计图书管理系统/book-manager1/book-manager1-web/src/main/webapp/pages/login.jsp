<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
<script src="../js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style2.css -->
<link rel="stylesheet" href="../css/style2.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}

.container .row div {
	/* position:relative;
				 float:left; */
	
}


.divcss5{text-align:center} 
</style>

		
	
</head>
<body>

	<!-- 引入header.jsp -->
	<jsp:include page="userheader.jsp"></jsp:include>


	<div class="container"
		style="width: 98%; height: 500px; background: #000 url('../img/loginbg.jpg') no-repeat;">
		<div class="row">
			<div class="col-md-5">
				<!--<img src="./image/login.jpg" width="500" height="330" alt="会员登录" title="会员登录">-->
			</div>

			<div class="col-md-7">
				<div
					style="width: 440px; border: 1px solid #E7E7E7; padding: 20px 0 20px 30px; border-radius: 5px; margin-top: 160px; background: #fff;">
					<font size="5">学生登录  </font>广东工业大学图书馆管理系统
					<div>&nbsp;</div>
					<form class="form-horizontal" action="/user/login" method="post">
						<div class="form-group">	
							<label for="uid" class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="uid" name="uid"
									placeholder="请输入用户名">
							</div>
						</div>
						<div class="form-group">
							<label for="upassword" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-6">
								<input type="password" class="form-control" id="upassword" name="upassword"
									placeholder="请输入密码">
							</div>
						</div>
						<font color="red"><span>${msg }</span></font>
						
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									<label> <input type="checkbox"> 自动登录
									</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label> <input
										type="checkbox"> 记住用户名
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="submit" width="100" value="登录" name="submit"
									style="height: 35px; width: 100px; color: black;">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="divcss5"  style="margin-top: 60px">
   		<strong>广东工业大学图书管理系统 </strong>
   		</div>
   		<div class="divcss5" style="padding-bottom: 40px">
   		<strong>版权所有 翻版必究 如有疑问 请致电15521308652 </strong>
   	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
<script src="../js/jquery-1.11.3.min.js" type="text/javascript"></script>
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
</style>
</head>

<body>


	<!-- 引入header.jsp -->
	<jsp:include page="userheader.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<div style="margin: 0 auto; margin-top: 10px; width: 950px;">
				<font size="5" color="red"><span>${tip }</span></font><br>
				<strong>我的借阅记录</strong>
				<table class="table table-bordered">
				<c:forEach items="${orderList }" var="order">
					<tbody>
						
						<tr class="warning">
							<th>学号</th>
							<th>书籍ID</th>
							<th>借书时间</th>
							<th>还书时间</th>
							<th>操作</th>
						</tr>
						
						<tr class="active">
								<td width="60" width="40%">${order.uid}</td>
								<td width="10%"> ${order.bid}</td>
								<td width="25%">￥${order.borrowtime}</td>
								<td width="25%">${order.returntime}</td>
								<td width="15%">
									<button type="button" class="btn bg-olive btn-xs" onclick="location.href='${pageContext.request.contextPath}/returnbook?uid=${order.uid}&bid=${order.bid}'">还书</button>
								</td>
						</tr>
						
					</tbody>
					
					
				</c:forEach>
				</table>
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
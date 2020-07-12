<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

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
  <script type="text/javascript">
   		function addCart(){
   			location.href="${pageContext.request.contextPath}/book/borrow?bid=${book.bid}";
   		}

  </script>
</head>

<body>
	<!-- 引入header.jsp -->
	<jsp:include page="userheader.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<div
				style="border: 1px solid #e4e4e4; width: 930px; margin-bottom: 10px; margin: 0 auto; padding: 10px; margin-bottom: 10px;">
				<a href="./index.htm">首页&nbsp;&nbsp;&gt;</a> <a href="./书籍分类.htm">书籍&nbsp;&nbsp;&gt;</a>
				<a>书籍分类</a>
			</div>

			<div style="margin: 0 auto; width: 950px;">
				<div class="col-md-6">
					<img style="opacity: 1; width: 400px; height: 350px;" title=""
						class="medium"
						src="${book.bimg }">
				</div>

				<div class="col-md-6">
					<div>
						<strong>${book.bname }</strong>
					</div>
					<div
						style="border-bottom: 1px dotted #dddddd; width: 350px; margin: 10px 0 10px 0;">
						<div>编号：${book.bid }</div>
					</div>

					<div style="margin: 10px 0 10px 0;">
						<strong style="color: #ef0101;">作者：${book.writer} 
						<strong>描述：${book.description}</strong>
					</div>

					<div style="margin: 10px 0 10px 0;">
						热度: <strong
							style="background-color: #fff000;">很受学生欢迎的一本书</strong>
					</div>

					<div
						style="padding: 10px; border: 1px solid #e7dbb1; width: 330px; margin: 15px 0 10px 0;; background-color: #fffee6;">
						

						<div
							style="border-bottom: 1px solid #faeac7; margin-top: 20px; padding-left: 10px;">
							借书数量: <input id="borrowNum" name="borrowNum" value="1"
								maxlength="4" size="10" type="text">
						</div>
						<strong style="color: #000000;">注意：每次只能借一本</strong>
						
						<div style="margin: 20px 0 10px 0;; text-align: center;">
							<a href="javascript:void(0);"onclick="addCart()"> 
							<input style="background: url('./images/book.gif') no-repeat scroll 0 -600px rgba(0, 0, 0, 0); height: 36px; width: 127px;"
								value="借书" type="button">
							</a> 
						</div>	
					</div>
					<!--  <div>
						<a href="${pageContext.request.contextPath}/book?method=bookList&cid=${cid }&currentPage=${currentPage }">返回列表页面</a>
						
						
					</div>-->
				</div>
			</div>
			<div class="clear"></div>
			<div style="width: 950px; margin: 0 auto;">
				<div
					style="background-color: #d3d3d3; width: 930px; padding: 10px 10px; margin: 10px 0 10px 0;">
					<strong>书籍介绍</strong>
				</div>

				<div>
					<img
						src="${book.bimg }">
				</div>

				<div
					style="background-color: #d3d3d3; width: 930px; padding: 10px 10px; margin: 10px 0 10px 0;">
					<strong>书籍参数</strong>
				</div>
				<div style="margin-top: 10px; width: 900px;">
					<table class="table table-bordered">
						<tbody>
							<tr class="active">
								<th colspan="2">基本参数</th>
							</tr>
							<tr>
								<th width="10%">尺寸</th>
								<td width="30%">150mm*215mm</td>
							</tr>
							<tr>
								<th width="10%">标重</th>
								<td>500g</td>
							</tr>
							<tr>
								<th width="10%">页数</th>
								<td>200</td>
							</tr>
						</tbody>
					</table>
				</div>

				<div style="background-color: #d3d3d3; width: 900px;">
					<table class="table table-bordered">
						<tbody>
							<tr class="active">
								<th><strong>书籍评论</strong></th>
							</tr>
							<tr class="warning">
								<th>暂无书籍评论信息 <a>[发表书籍评论]</a></th>
							</tr>
						</tbody>
					</table>
				</div>

				<div style="background-color: #d3d3d3; width: 900px;">
					<table class="table table-bordered">
						<tbody>
							<tr class="active">
								<th><strong>书籍咨询</strong></th>
							</tr>
							<tr class="warning">
								<th>暂无书籍咨询信息 <a>[发表书籍咨询]</a></th>
							</tr>
						</tbody>
					</table>
				</div>
			</div>

		</div>
	</div>

</body>

</html>
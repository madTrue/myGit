<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<table width="100%" border=1>
			<tr>
				<td>名称</td>
				<td>${item.name }</td>
			</tr>
			<tr>
				<td>价格</td>
				<td>${item.price }</td>
			</tr>
			<tr>
				<td>日期</td>
				<td><fmt:formatDate value="${item.createtime}"
						pattern="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
			<tr>
				<td>详情</td>
				<td>${item.detail}</textarea>
				</td>
			</tr>
		</table>
	</form>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>LoginError</title>
</head>
<body>
	<h1>エラーが発生しました。</h1>
	<br>
	<h3>ログインできません。</h3>

	<s:if test='(#session.loginDTOList.get(0).username)=="該当なし"'>
	該当者はいませんでした。
	</s:if>

	<br>
	<table>
	<tbody>
	<tr>
		<th>USERNAME</th>
		<th>PASSWORD</th>
	</tr>
	<tr>
	<s:iteratot value="#session.loginDTOList">
		<td><s:property value="username"/></td>
		<td><s:property value="password"/></td>
	</s:iteratot>
	</tr>
	</tbody>
	</table>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/1 0001
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" enctype="multipart/form-data" action="/photoes">
    <input type="file" name="photo">
    <input type="text" name="uId">
    <input type="text" name="photoName">
    <input type="submit" value="提交">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: tz_wl
  Date: 2020/7/6
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>测试参数接收</title>
</head>
<body>
<h1>测试零散类型和对象参数接受</h1>
<form action="${pageContext.request.contextPath}/param/paramObject" method="post">   <%--method="get"--%>
    用户id<input type="text" name="id"><br/>
    用户name: <input type="text" name="name"> <br>
    用户age: <input type="text" name="age"> <br>
    用户bir: <input type="text" name="bir"> <br>
    <input type="submit" value="提交">

</form>

</body>
</html>

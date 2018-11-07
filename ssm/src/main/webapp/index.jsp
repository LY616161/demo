<%@ page import="com.ssm.entry.User" %>
<%@ page import="java.util.List" %>
<%@ page import="org.springframework.web.context.request.SessionScope" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/16
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
    <form action="file/upload.action" method="post" enctype="multipart/form-data">
        <label>用户名：</label><input type="text" name="name"><br>
        <label>密码：</label><input type="password" name="password"><br>
        <label>上传头像：</label><input type="file" name="file"><br>
        <input type="submit">
    </form>
    <form id="add" class="form-horizontal" enctype="multipart/form-data" action="/test/upload" method="post">
        上传图片：<input  type="file" name="file"/>
        <input type="submit" value="提交"/>
    </form>
</head>
<body>

</body>
</html>

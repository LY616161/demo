<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
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
    <title>test</title>
    <h3>显示图片</h3>
    <%--<img src="${basePath}${user.image}">用户名：${user.name}--%>
    <img src="http://47.98.191.46:8000/images/111.jpg">用户名：${user.name}
    <hr>
</head>
<body>

</body>
</html>

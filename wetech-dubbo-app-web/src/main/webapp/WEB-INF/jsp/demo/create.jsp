<%--
  Created by IntelliJ IDEA.
  User: cjbi
  Date: 2018/3/7
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增用户</title>
</head>
<body>
<form method="post">
    <fieldset>
        <legend>新增用户</legend>
        <label for="name">姓名：</label>
        <input type="text" name="name" id="name" required>
        <br>
        <label for="phone">号码：</label>
        <input type="text" name="phone" id="phone" required>
        <br>
        <label for="email">邮箱：</label>
        <input type="email" name="email" id="email" required>
        <br>
        <label for="gender">性别：</label>
        <input type="radio" name="gender" id="gender" value="1" checked>男
        <input type="radio" name="gender" value="2">女
        <input type="radio" name="gender" value="0">未知
        <br>
        <label for="state">状态：</label>
        <select name="state" id="state">
            <option value="0" selected>待激活</option>
            <option value="1">正常</option>
            <option value="2">锁定</option>
        </select>
        <br>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </fieldset>
</form>
</body>
</html>

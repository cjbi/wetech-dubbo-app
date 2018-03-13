<%--
  Created by IntelliJ IDEA.
  User: cjbi
  Date: 2018/3/7
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/demo/user/update">
    <input type="hidden" name="id" value="${user.id}"/>
    <fieldset>
        <legend>修改用户</legend>
        <label for="name">姓名：</label>
        <input type="text" name="name" id="name" value="${user.name}" required>
        <br>
        <label for="phone">号码：</label>
        <input type="text" name="phone" id="phone" value="${user.phone}" required>
        <br>
        <label for="email">邮箱：</label>
        <input type="email" name="email" id="email" value="${user.email}" required>
        <br>
        <label for="gender">性别：</label>
        <c:choose>
            <c:when test="${user.gender eq 1}">
                <input type="radio" name="gender" id="gender" value="1" checked>男
                <input type="radio" name="gender" value="2">女
                <input type="radio" name="gender" value="0">未知
            </c:when>
            <c:when test="${user.gender eq 2}">
                <input type="radio" name="gender" id="gender" value="1">男
                <input type="radio" name="gender" value="2" checked>女
                <input type="radio" name="gender" value="0">未知
            </c:when>
            <c:when test="${user.gender eq 0}">
                <input type="radio" name="gender" id="gender" value="1">男
                <input type="radio" name="gender" value="2">女
                <input type="radio" name="gender" value="0" checked>未知
            </c:when>
        </c:choose>
        <br>
        <label for="state">状态：</label>
        <select name="state" id="state">
            <c:choose>
                <c:when test="${user.state eq 0}">
                    <option value="0" selected>待激活</option>
                    <option value="1">正常</option>
                    <option value="2">锁定</option>
                </c:when>
                <c:when test="${user.state eq 1}">
                    <option value="0">待激活</option>
                    <option value="1" selected>正常</option>
                    <option value="2">锁定</option>
                </c:when>
                <c:when test="${user.state eq 2}">
                    <option value="0">待激活</option>
                    <option value="1">正常</option>
                    <option value="2" selected>锁定</option>
                </c:when>
            </c:choose>
        </select>
        <br>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </fieldset>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: cjbi
  Date: 2018/3/7
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table border="1">
    <tr>
        <th>用户Id</th>
        <th>姓名</th>
        <th>手机号</th>
        <th>邮箱</th>
        <th>性别</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.phone}</td>
            <td>${user.email}</td>
            <td>
                <c:choose>
                    <c:when test="${user.gender eq 1}">男</c:when>
                    <c:when test="${user.gender eq 2}">女</c:when>
                    <c:when test="${user.gender eq 0}">未知</c:when>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${user.state eq 1}">待激活</c:when>
                    <c:when test="${user.state eq 2}">正常</c:when>
                    <c:when test="${user.state eq 0}">锁定</c:when>
                </c:choose>
            </td>
            <td>
                <a href="<%=request.getContextPath()%>/demo/user/update/${user.id}">修改</a>|
                <a href="<%=request.getContextPath()%>/demo/user/delete/${user.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<p>
    <a href="<%=request.getContextPath()%>/demo/user/create">新增</a>
</p>
</body>
</html>

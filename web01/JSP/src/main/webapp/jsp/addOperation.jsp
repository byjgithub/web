<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/21 0021
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>加法运算</title>
    <%
        Integer result = (Integer) request.getAttribute("result");
    %>
</head>
<body>
<form action="/JSP/AddOperaServlet" method="post">
    第1个加数：<input type="text" value="请输入第1个加数" name="addend"><br>
    第2个加数：<input type="text" value="请输入第2个加数" name="addend"><br>
    <input type="submit" value="="><br>
    运算结果：<%=result %>
</form>
</body>
</html>

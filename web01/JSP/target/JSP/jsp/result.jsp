<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/21 0021
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>运算结果</title>
    <%
        Integer result = (Integer) request.getAttribute("result");
    %>
</head>
<body>
结果是：<%=result %>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-08-04
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${!empty brandDto}">
        ${brandDto.orderId}&nbsp;&nbsp;${brandDto.logoUrl}&nbsp;&nbsp;
        ${brandDto.brandName}&nbsp;&nbsp;${brandDto.brandVoteCount}
        <a href="../deleteBrand.jsp">删除</a><br/>
    </c:if>
</body>
</html>

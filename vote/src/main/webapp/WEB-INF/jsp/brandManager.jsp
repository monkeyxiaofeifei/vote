<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-08-04
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>品牌管理</title>
</head>

<body>
    <form >
        <input type="text" name="brandName" />
    </form>

    <c:if test="${!empty brandDtoList}">
        序号&nbsp;&nbsp;LOGO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        名称&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        票数&nbsp;&nbsp;编辑&nbsp;&nbsp;<br/>
        <c:forEach var="brand" items="${brandDtoList}">
            ${brand.orderId}&nbsp;&nbsp;&nbsp;&nbsp;${brand.logoUrl}&nbsp;&nbsp;&nbsp;&nbsp;
             ${brand.brandName}&nbsp;&nbsp;${brand.brandVoteCount}&nbsp;&nbsp;
            <a href="../deleteBrand.jsp">删除</a><br/>
        </c:forEach>
    </c:if>
    <br/>
    <br/>
    <br/>
    <br/>

    <c:if test="${!empty page}">
        总记录数: ${page.total} &nbsp;&nbsp;当前页数: ${page.currentPage} &nbsp;&nbsp;
        总页数: ${page.pages}
    </c:if>
</body>
</html>

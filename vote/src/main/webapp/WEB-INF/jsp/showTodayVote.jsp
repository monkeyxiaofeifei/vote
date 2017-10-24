<%--
  Created by IntelliJ IDEA.
  User: MonkeyHu
  Date: 2017/7/30
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>当天投票列表</title>
</head>
<body>
<c:if test="${!empty todayVote}">
        当天投票ID：${todayVote.todayVoteId} &nbsp;&nbsp;投票用户ID：${todayVote.userId} &nbsp;&nbsp;投票品牌ID：${todayVote.brandId} &nbsp;&nbsp;<br>
</c:if>
</body>
</html>


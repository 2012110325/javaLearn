<%--
  Created by IntelliJ IDEA.
  User: liqiang
  Date: 2018/2/7
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spittleList</title>
</head>
<body>
    <c:forEach items="${spittleList}" var="spittle">
        <li id="spittle_<c:out value="spittle.id"/>">
            <div class="spittleMessage">
                <c:out vlaue="${spittle.message}"/>
            </div>
            <div>
                <span class="spittleTime"><c:out value="${spittle.time}"/></span>
                <span class="spittleLocation">(<c:out value="${spittle.latitude}"/>,
                    <c:out value="${spittle.longitude}"/>)</span>
            </div>
        </li>

    </c:forEach>
</body>
</html>

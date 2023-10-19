<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
<%-- 아래 % 표현식과 $ 표현식은 동일한 결과 --%>
<%--    <li>id=<%=((Member)request.getAttribute("member")).getId()%></li>--%>
    <li>id=${member.id}</li>
    <li>username=${member.username}</li>
    <li>age=${member.age}</li>
</ul>
<a href="/index.html">Main</a>
</body>
</html>

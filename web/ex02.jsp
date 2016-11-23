<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style></style>
    <!-- jQuery (자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <title>EX02</title>
</head>
<body>
<h1>test02</h1>
<p>msg:<%=request.getAttribute("msg")%></p>
<p>msg2:${msg2}</p>
<a href="test03.action?msg=aaaa">link</a>
</body>
</html>

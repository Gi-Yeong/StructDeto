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
    <title>LOGIN</title>
</head>
<body>
<h1>로그인 페이지</h1>
<form action="test22.action" method="post">
    <p>id:<input type="text" name="id" value="${bean.id}"></p>
    <p>pw:<input type="text" name="pw"></p>
    <p>
        <button type="submit">LOGIN</button>
        <button type="reset">RESET</button>
    </p>
</form>
</body>
</html>

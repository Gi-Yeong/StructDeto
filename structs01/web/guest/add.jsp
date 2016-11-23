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
    <title>ADD</title>
</head>
<body>
<h1>입력페이지</h1>
<form action="insert.action">
    <table>
        <tr>
            <td>사번</td>
            <td><input type="text" name="sabun">${filedErrors.sabun }</td>
        </tr>
        <tr>
            <td>이름</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>금액</td>
            <td><input type="text" name="pay"></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">전 송</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>

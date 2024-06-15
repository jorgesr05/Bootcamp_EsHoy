<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="/login" method="post">
        <div>
            <label for="">user</label>
            <input type="text" name="userInput" id="">
        </div>
        <div>
            <label for="">password</label>
            <input type="password" name="passwordInput" id="">
        </div>
        <button type="submit">Enviar</button>

    </form>
    
</body>
</html>
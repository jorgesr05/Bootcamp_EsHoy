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
    <h1>Send an Omikuji</h1>
    <form action="/omikuji" method="post">
        <div>
            <label for="">Pick a number</label>
            <input type="number" name="years">
        </div>
        <div>
            <label for="">Enter a city</label>
            <input type="text" name="place">
        </div>
        <div>
            <label for="">Enter a real person name</label>
            <input type="text" name="person">
        </div>
        <div>
            <label for="">Enter a hobby</label>
            <input type="text" name="hobby">
        </div>
        <div>
            <label for="">Enter a living place</label>
            <input type="text" name="living">
        </div>
        <div>
            <label for="">Say something nice</label>
            <textarea name="message"></textarea>
        </div>  
        <div>
            <label for="">Send and show a friend</label>
            <input type="submit" value="Send">
        </div>
    </form>
    
</body>
</html>
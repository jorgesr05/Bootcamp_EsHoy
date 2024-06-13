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
        <h1>Hola soy una páigina del servidor de java</h1>
        <ul>
            <li>Elemento 1: <c:out value="${2+3}"/></li>
            <li>Elemento 2</li>
            <li>Elemento 3</li>
        </ul>
    </body>
    </html>
    
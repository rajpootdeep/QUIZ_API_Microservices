<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Feed Bihar</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        header {
           
            color: #fff;
            text-align: center;
            
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #ecf0f1;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        a {
            text-decoration: none;
            color: #3498db;
            margin-right: 20px;
            padding: 8px 16px;
            border: 1px solid #3498db;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
        }
        a:hover {
            background-color: #3498db;
            color: #fff;
        }
        .content {
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        h1 {
            background-color: #27ae60;
            padding: 10px;
            border-radius: 5px;
            color: #fff;
            margin-bottom: 20px;
        }
        h2 {
            color: #2c3e50;
        }
        p {
            color: #555;
            line-height: 1.6;
        }
        .summary {
            background-color: #a112f3;
            color: #fff;
            padding: 10px;
            border-radius: 5px;
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Feed Bihar</h1>
    </header>
    <div class="container">
        <a href="callBecomeMemPage">Become a Member</a>
        <a href="memlogin">Login</a>
        <div class="content">
            <h2>Welcome to Feed Bihar</h2>
            <p>Join us in our mission to make a difference by providing support and resources to the people of Bihar.</p>
            <p>Explore our website to learn more about how you can contribute to our cause.</p>
        </div>
        <div class="summary">
            Active Member: <span>${result[1]}</span><br>
            Inactive Member: <span>${result[2]}</span><br>
            Total Member Registered: <span>${result[0]}</span>
        </div>
    </div>
</body>
</html>

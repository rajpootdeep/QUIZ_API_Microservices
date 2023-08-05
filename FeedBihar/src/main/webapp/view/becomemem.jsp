<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Become a Member</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            min-height: 100vh;
        }
        .heading {
            background-color: #27ae60;
            padding: 10px;
            border-radius: 5px;
            width: 100%;
            text-align: center;
            margin-bottom: 20px;
        }
        .heading h1 {
            color: #fff;
            margin: 0;
            padding: 0;
        }
        .content {
            display: flex;
            justify-content: center; /* Center horizontally */
            align-items: center; /* Center vertically */
            flex-wrap: wrap;
            width: 100%;
        }
        .container {
            flex: 1;
            display: flex;
            flex-direction: column;
            align-items: center;
            max-width: 400px;
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            margin: 10px;
            animation: fadeIn 0.5s ease-in-out;
        }
        @media (max-width: 768px) {
            .content {
                flex-direction: column;
            }
            .container {
                max-width: none;
                width: 100%;
                margin: 10px 0;
            }
        }
        form {
            width: 100%;
        }
        h2 {
            text-align: center;
            color: #3498db;
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-top: 10px;
            color: #555;
        }
        input[type="text"],
        input[type="email"],
        input[type="number"],
        input[type="password"],
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
            color: #333;
        }
        select {
            cursor: pointer;
        }
        input[type="submit"] {
            background-color: #3498db;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 20px;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #2181b5;
        }
        h4 {
            color: #e74c3c;
            text-align: center;
            margin-top: 10px;
        }
        .message {
            margin-top: 20px;
            padding: 10px;
            background-color: #f9f9f9;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
    </style>
</head>
<body>
    <div class="heading">
        <h1>Feed Bihar</h1>
    </div>
    <div class="content">
        <div class="container">
            <form action="addnewmember" method="post">
                <h2>Become a Member</h2>
                <h4>${msg}</h4>
                <label for="hname">Hotel Name:</label>
                <input type="text" id="hname" name="hname" required>
                <label for="mname">Manager/Owner Name:</label>
                <input type="text" id="mname" name="mname" required>
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
                <label for="addr">Address:</label>
                <input type="text" id="addr" name="addr" required>
                <label for="status">Status:</label>
                <select name="status" id="status" required>
                    <option value="Active" selected>Active</option>
                    <option value="Inactive">Inactive</option>
                </select>
                <label for="mobile">Mobile:</label>
                <input type="number" id="mobile" name="mobile" required>
                <label for="pass">Password:</label>
                <input type="password" id="pass" name="pass" required>
                <input type="submit" value="Submit">
            </form>
        </div>
        <div class="container">
            <div class="message">
                <h3>Membership Benefits</h3>
                <p>By becoming a member of Feed Bihar, you'll have the opportunity to make a meaningful impact on the lives of people in Bihar. Your support will help provide essential resources and support to those in need.</p>
            </div>
        </div>
    </div>
</body>
</html>

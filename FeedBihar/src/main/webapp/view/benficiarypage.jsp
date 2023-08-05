<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Beneficiary</title>
    <style>
        /* Reset default styling */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Global styles */
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        /* Header styles */
        .header {
            background-color: #4CAF50;
            color: white;
            text-align: center;
            padding: 20px;
        }

        .header h1 {
            margin: 0;
        }

        /* Navigation menu styles */
        .menu {
            background-color: #333;
            padding: 10px 0;
        }

        .menu-list {
            list-style-type: none;
            display: flex;
            justify-content: center;
            margin: 0;
            padding: 0;
        }

        .menu-list li {
            margin: 0 10px;
        }

        .menu-list a {
            color: white;
            text-decoration: none;
            padding: 10px 20px;
            transition: background-color 0.3s;
            border-radius: 5px;
        }

        .menu-list a:hover {
            background-color: #555;
        }

        /* Main content styles */
        .main-content {
            max-width: 800px;
            margin: 30px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border: 2px solid #4CAF50;
            border-radius: 10px;
        }

        .main-content h2 {
            color: #4CAF50;
        }

        /* Footer styles */
        .footer {
            text-align: center;
            padding: 10px;
            background-color: #333;
            color: white;
        }

        .footer p {
            margin: 0;
        }
    </style>
</head>
<body>
    <header class="header">
        <h1>Feed Bihar</h1>
        <p>Welcome to Feed Bihar, a platform dedicated to feeding the hungry beggars of Bihar.</p>
    </header>
    <nav class="menu">
        <ul class="menu-list">
            <li><a href="addBenePage">Add Beneficiary</a></li>
            <li><a href="beneUpdatePage">Update Beneficiary</a></li>
            <li><a href="listOptionPage">List Beneficiary</a></li>
        </ul>
    </nav>

    <section class="main-content">
        <h2>Empower Lives Through Feeding</h2>
        <p>
            Your compassionate actions can bring positive change. Join us in our mission to provide food and support to the beggars in Bihar.
        </p>
        <p>
            Whether you're contributing by adding a new beneficiary, updating beneficiary information, or viewing the list of beneficiaries, your efforts make a meaningful impact.
        </p>
    </section>

    <footer class="footer">
        <p>Contact Us: feedbihar@gmail.com | Follow us on Social Media: @feedbihar</p>
    </footer>
</body>
</html>
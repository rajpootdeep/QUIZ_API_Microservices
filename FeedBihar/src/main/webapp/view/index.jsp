<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="view/indexstyles.css">
    <title>Feed Bihar - Home Page</title>
</head>
<body>
    <div class="header">
        <h1>Feed Bihar</h1>
        <p>Welcome to Feed Bihar, a platform dedicated to feed the hungry beggar of Bihar.</p>
    </div>
    
    <div class="menu">
        <a href="index.jsp">Home</a>  
        <a href="aboutfeedbihar">About</a>
                <a href="addBenePage">Add Beneficiary</a>
                <a href="beneUpdatePage">Update Beneficiary</a>
                <a href="listOptionPage">List Beneficiary</a>
            
    </div>

   <!-- Adding multiple images and main content in the same line -->
   <div class="image-content-container">
    <div class="image-container">
        <div class="image-wrapper">
            <img src="view/images/beggar-1.jpg" alt="Beggar Image 1">
        </div>
    </div>
    <div class="main-content">
        <h2>How You Can Help</h2>
        <p>
            There are various ways you can contribute to our cause.
            volunteer your time and skills, or make a donation to support our projects and initiatives.
            Together, we can make a positive impact on the lives of beggars in Bihar.
        </p>
    </div>
</div>

    <div class="footer">
        <p>Contact Us: feedbihar@gmail.com | Follow us on Social Media: @feedbihar</p>
    </div>

</body>
</html>

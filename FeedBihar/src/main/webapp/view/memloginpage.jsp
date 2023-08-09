<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>

<head>
<h2>Member Login</h2>
</head>

<body>
    <form action="memberprofilepage" method="post">

        <label> User Name : <input type="text" name="username"/>
            <label> Password: <input type="password" name="password"/>
                <input type="submit" value="Sign In"/>
    </form>
</body>

</html>
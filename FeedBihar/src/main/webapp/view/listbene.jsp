<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Listing Beneficiary</title>
    <link rel="stylesheet" href="view/listbenestylesheet.css">
</head>
<body>
    <div class="header">
        <div class="header-container">
            <h1 class="heading">Feed Bihar</h1>
        </div>
    </div>
    <div class="container">
        <h2 class="sub-heading">Listing Beneficiary</h2>

        <div class="form-section">
            <form action="listByStatus" method="get">
                <div class="form-group">
                    <label for="status">Status:</label>
                    <select name="status" id="status" required> 
                        <option value="Active">Active</option>
                        <option value="Inactive">Inactive</option>
                    </select>
                </div>
                <input type="submit" value="Filter">
            </form>
        </div>

        <div class="form-section">
            <form action="getallbene" method="get">
                <input type="submit" value="List All Beneficiary">
            </form>
        </div>
    </div>
</body>
</html>

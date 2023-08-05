<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <title>Update Beneficiary</title>
    <link rel="stylesheet" href="view/updatebenestylesheet.css">
</head>
<body>
    <h1 class="heading">Beneficiary Details</h1>
    <h3 class="msg">${msg}</h3>

    <div class="container">
        <!-- Left section (form for "getOneBene") -->
        <div class="left-section">
            <h2 class="form-heading">Search Beneficiary</h2>
            <form action="getOneBene" method="get" class="form-group">
                <label for="id">ID</label>
                <input type="number" id="id" name="id" required>
                <input type="submit" value="OK">
            </form>
        </div>

        <!-- Right section (form for "updateOneBene") -->
        <div class="right-section">
            <h2 class="form-heading">Update Beneficiary</h2>
            <form action="updateOneBene" method="post" class="form-group">
                <label for="id">ID</label>
                <input type="number" id="id" name="id" value="${result.id}" readonly >
                <label for="name">Name</label>
                <input type="text" id="name" name="name"  value="${result.name}" required>
                <label for="mobile">Mobile</label>
                <input type="tel" id="mobile" name="mobile" value="${result.mobile}" required>
                <label for="address">Address</label>
                <input type="text" id="address" name="address" value="${result.address}" required>
                <label for="date">Date</label>
                <input type="datetime" id="date" value="${result.date}" readonly>
                <label for="status">Status</label>
                <select name="status" id="status" required>
                    <option value="Active">Active</option>
                    <option value="Inactive">Inactive</option>
                    <option value="${result.status}" selected>${result.status}</option>
                </select>
                <label for="l_time">Last Updated</label>
                <input type="datetime" id="l_time" value="${result.l_time}" readonly>
                <input type="submit" id="update" value="Update" >
            </form>
            
        </div>
    </div>
    
</body>
</html>

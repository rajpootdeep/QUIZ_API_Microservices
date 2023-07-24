<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
  <title>Enter Beneficiary Details</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="view/addbenestylesheet.css">
</head>
<body>
  <div class="container">
    <h1>Enter Beneficiary Details</h1>
    <h3>${msg}</h3>
    <form action="addBene" method="post">
      <div class="form-group">
        <label for="name">Name</label>
        <input type="text" id="name" name="Name" placeholder="Enter full name..." required>
      </div>
      <div class="form-group">
        <label for="addr">Address</label>
        <input type="text" id="addr" name="address" placeholder="Enter exact and full address..." required>
      </div>
      <div class="form-group">
        <label for="tel">Mobile</label>
        <input type="tel" id="tel" name="mobile" pattern="[0-9]{10}" placeholder="9534255541">
      </div>
      <div class="form-group">
        <label for="status">Status</label>
        <select name="status" id="status" required>
          <option value="Active">Active</option>
          <option value="Inactive">Inactive</option>
        </select>
      </div>
      <div class="form-group">
        <input type="submit" value="Save">
      </div>
    </form>
  </div>
</body>
</html>
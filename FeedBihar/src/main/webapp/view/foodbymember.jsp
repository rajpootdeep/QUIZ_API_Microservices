<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>

<head>



</head>

<body>
    <h1>Feed Bihar</h1>

<h3>Food Availability</h3>

<form action="addfoodbymem" method="post" >

<label for="mid">Member ID </label>
<input type="number" name="mid" id="mid"  required >

<label for="food">Food </label>
<input type="text" name="food" id="food" required>

<label for="noofperson">Quantity</label>
<input type="number" name="noofperson" id="noofperson" required>

<label for="date">Availability Date </label>
<input type="date" name="date" id="date" > 

<label for="mobile">Mobile </label>
<input type="tel" name="mobile" id="mobile" >

<label for="remark">Remark</label>
<input type="text" name="remark" id="remark" >

<select name="status" id="status" aria-readonly="true" >
    <option value="Active" selected aria-readonly="true">Active</option>
   
</select>

<input type="submit" value="Submit"  >


</form>

</body>
</html>
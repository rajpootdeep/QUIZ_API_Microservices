<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page isELIgnored="false"%>

<link rel="stylesheet" href="stylesheet.css">
<style>
 input[type=submit] , input[type=number] {
    width: 100%;
    padding: 12px 12px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
</style>


<!DOCTYPE html>
<div class="menu">
    <form action="getOneBene" method="get">
    <label for="id">Enter ID </label>
<input type="number" id="id" name="id" placeholder="Enter Beneficiary ID">
<input class="submithover" class="submitinput" type="submit" value="OK">
</form>
</div>
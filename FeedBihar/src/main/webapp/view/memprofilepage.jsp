<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>

    </head>

     <body>

        <h4>${msg}</h4>
       <form action="updatemem" method="post">

        <label for="id">Unique ID </label>
        <input type="number" id="id" name="id"  value="${res.id}">

        <label for="hname">Hotel Name </label>
        <input type="text" id="hname" name="hname" value="${res.hname}">

        <label for="mname">Owner/Manager Name </label>
        <input type="text" name="mname" id="mname" value="${res.mname}">

        <label for="mobile">Mobile </label>
        <input type="tel" name="mobile" id="mobile" value="${res.mobile}">

        <label for="addr">Address </label>
        <input type="text" name="addr" id="addr" value="${res.addr}">

        <label for="email">Email </label>
        <input type="text" name="email" id="name" value="${res.email}">

        <label for="status">Status </label>
        <input type="text" name="status" id="status" value="${res.status}">
 
        <input type="submit" value="Edit">

       </form> 
     </body>

</html>
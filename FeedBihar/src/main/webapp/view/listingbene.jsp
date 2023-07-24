<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page isELIgnored="false"%>
<%@page import = " java.util.* " %>
<%@page import = "feed.bihar.repository.Bene" %>
<!DOCTYPE html>
<html>
    <head>
<h1>${msg} Beneficiary list </h1>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
    }
    h1 {
        text-align: center;
        color: #333;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
        border: 1px solid #ccc;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }
    th, td {
        padding: 12px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #f2f2f2;
    }
    tr:hover {
        background-color: #f2f2f2;
    }
    td:first-child {
        text-align: center;
        font-weight: bold;
    }
    /* Style for "No items found" message */
    .empty-message {
        text-align: center;
        font-style: italic;
        color: #888;
    }

    /* CSS styles for the print button */ button { padding: 10px 20px;
         background-color: #4CAF50;
          color: #fff;
           border: none;
            border-radius: 5px;
             cursor: pointer;
              margin-top: 20px; 
              font-size: 16px;
               box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1); } 
    button:hover { background-color: #45a049; } 
    /* Center the button horizontally */ 
    .print-btn-container { text-align: center; }

/* CSs Style for H1 element*/

h1 { font-family: "Arial", sans-serif;
 color: #eee131; text-align: 
 center; margin-top: 20px;}

</style> 
    </head>

<body>

<table>
    <thead>
        <tr>
            <th>Sl. No.</th>
            <th>I D</th>
            <th>Name</th>
            <th>Mobile</th>
            <th>Address</th>
            <th>Enrty Date</th>
            <th>status</th> 
            <th>Last Updated</th>
        </tr>
    </thead>
<tbody>

<%@ page import="feed.bihar.repository.Bene" %>
<% List<Bene> ben=(List<Bene>) request.getAttribute("result");%>

    <% if(ben != null && !ben.isEmpty()) {%>

        <% int serialNumber = 1; %>

<% for(Bene bens : ben){ %>
<tr>
    <td><%=serialNumber++ %></td>
    <td><%=bens.getId() %></td>
    <td><%=bens.getName() %></td>
    <td><%=bens.getMobile() %></td>
    <td><%=bens.getAddress() %></td>
    <td><%=bens.getDate() %></td>
    <td><%=bens.getStatus() %></td>
    <td><%=bens.getL_time() %></td>
</tr>
<% } %>
<% } else { %>
    <tr>
        <td colspan="2">No Records found</td>
    </tr>
<% } %>
</tbody>
</table>

<%-- Print button --%>
<div class="print-btn-container">
<button onclick="printTable()">Print Report</button>
</div>
<script>
    function printTable(){
        window.print();
    }
</script>

</body>
    </html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="UserDao.FlightServiceImpl, com.controller.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border= "2" align ="center">
<thead>
<th>Number</th>
<th>Name</th>
<th>Source</th>
<th>Destination</th>
<th>Type</th>
<th>Price</th>
<th>EDIT</th>
<th>DELETE</th>
</thead>


<%


FlightServiceImpl service = new FlightServiceImpl();
List<Flight> listOfFlight= service.getAllFlight();
for(Flight flight:listOfFlight)
{  %>
<tr>
<td><%=flight.getFlightNumber()%></td>
<td><%=flight.getFlightName()%></td>
<td><%=flight.getSource()%></td>
<td><%=flight.getDestination()%></td>
<td><%=flight.getFlyTime()%></td>
<td><%=flight.getFlightPrice()%></td>
<td><a href="UpdateFlight?p1=<%=flight.getFlightNumber() %>">EDIT</a></td> 
<td><a href="DeleteFlight?p1=<%=flight.getFlightNumber() %>">DELETE</a></td>
</tr>
<%} %>

</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.controller.Flight" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% Flight flight=(Flight)application.getAttribute("flight-details"); %>
<body>
<form action="FinalUpdateServlet" method="get">
Enter Flight Name:<input type="text" name="t1" value=<%=flight.getFlightName() %>> <br>
Enter Flight Source:<input type="text" name="t2" value=<%=flight.getSource() %>><br>
Enter Flight Destination:<input type="text" name="t3" value=<%=flight.getDestination() %>><br>
Enter Flight Time:<input type="text" name="t4" value=<%=flight.getFlyTime() %>><br>
Enter Flight Price:<input type="text" name="t5" value=<%=flight.getFlightPrice() %>><br>
<input type="submit" value="UpdateFlight">
</form>
</body>
</html>
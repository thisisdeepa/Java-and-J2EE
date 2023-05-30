<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Ambiance Hall Booking System</h1><br>
	<form action="BookHall" method="get">
		Booking Id : <input type="text" name="Id"/><br>
		Hall : 
		<select name="Hall">
			<option>AUDI 1</option>
			<option>AUDI 2</option>
			<option>AUDI 3</option>
			<option>AUDI 4</option>
		</select><br>
		Event  : <input type="text" name="event" /><br>
		Name  : <input type="text" name="name" /><br>
		From (Date) : <input type="text" name="from" /><br>
		To(Date) : <input type="text" name="to" /><br>
		Theme : 
		<select name="Theme"><br>
			<option>Christmas</option>
			<option>Animal Celebration</option>
			<option>Polka Party</option>
		</select><br>
		<input type="submit"/><br>
	</form>
</body>
</html>
<html>
<head>
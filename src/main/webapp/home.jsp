<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN CONSOLE</title>
</head>
<body>
	<h3>ADMIN CONSOLE</h3>

	<div>
		<p>Add Customer
		<form action="/addCustomer">
			<p>
				<input type="text" name="name"> Name<br>
			<p>
				<input type="text" name="password"> Password <br> <input
					type="submit">
		</form>
	</div>

	<div>
		<p>Add Company
		<form action="/addCompany">
			<p>
				<input type="text" name="email">Email <br>
			<p>
				<input type="text" name="name">Name <br>
			<p>
				<input type="text" name="password">Password <br> <input
					type="submit">
		</form>
	</div>

	<div>
		<p>Add Coupon
		<form action="/addCoupon">
			<p>
				<input type="text" name="title"> title<br>
			<p>
				<input type="text" name="message"> message<br>
			<p>
				<input type="text" name="price">price<br>
			<p>
				<input type="text" name="amount">amount<br>
			<p>
				<input type="text" name="start_date">start date<br>
			<p>
				<input type="text" name="end_date">start date<br>
			<p>
				<input type="text" name="type">type<br>
			<p>

				<input type="text" name="status"> status <br> <input
					type="submit">
		</form>
	</div>

	<div>
		<p>delete customer
		<form action="/dcustomer/">
			<p>
				<input type="text"> id<br> <input type="submit">
		</form>
	</div>
</body>
</html>
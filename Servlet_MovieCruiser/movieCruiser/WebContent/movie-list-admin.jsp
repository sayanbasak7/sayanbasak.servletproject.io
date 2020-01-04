<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="topnav">
		<div class="home">Movie Cruiser</div>
		<img src="image/c.JPG"> <a href="ShowMovieListAdmin">Movies</a>
	</div>

	<h1 class="hed-mla">Movies</h1>
	<table class="tbl">
		<tr>
			<th><h4>Title</h4></th>
			<th class="currency"><h4>BoxOffice</h4></th>
			<th><h4>Active</h4></th>
			<th><h4>Date of launch</h4></th>
			<th><h4>Genre</h4></th>
			<th><h4>Has Teaser</h4></th>
			<th><h4>Action</h4></th>
		</tr>

		<c:forEach items="${moviesList}" var="movies">

			<tr>
				<td>${movies.title}</td>

				<td class="currency">$<fmt:formatNumber value="${movies.gross}" /></td>

				<td><c:if test="${movies.active}">Yes</c:if> <c:if
						test="${!movies.active}">No</c:if></td>

				<td><fmt:formatDate type="date" pattern="dd/MM/yyyy"
						value="${movies.dateOfLaunch}" /></td>

				<td>${movies.genre}</td>

				<td><c:if test="${movies.hasTeaser }">Yes</c:if> <c:if
						test="${!movies.hasTeaser}">No</c:if></td>

				<td><a href="ShowEditMovie?id=${movies.id}">Edit</a></td>
			</tr>
		</c:forEach>

	</table>

	<div class="footer">
		<h3>Copyright@2019</h3>
	</div>
</body>
</html>
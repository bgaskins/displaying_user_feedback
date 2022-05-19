<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter User Feedback</title>
</head>
<body>
<form:form action="/test_form" method="post" commandName="testUser">
  <label for="user">User:</label><br>
  <input type="text" id="user" name="user" placeholder="Name"><br>
  <label for="review">Review:</label><br>
  <input type="text" id="review" name="review" placeholder="Feedback"><br><br>
  <input type="submit" value="Submit">
  <label for="rating">Rating:</label><br>
  <input type="range" name="rating" id="rating" min="0" max="10" value="5" class="slider">
</form:form> 
</body>
</html>
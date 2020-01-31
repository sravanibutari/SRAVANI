<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processLogin" modelAttribute="user">
Email Address<form:input path="email"/><br/>
Password<form:password path="password" /><br/>

  <form> 
    <label>Country</label>
    <select class="form-control" name="country name">
      <option value="Unknown">Select...</option>
      <option value="India">India</option>
      <option value="China">China</option>
      <option value="Australia">Australia</option>
      <option value="Bangladesh">Bangladesh</option>
      <option value="England">England</option>
    </select>
 </form>

<input type="submit" value="login" />
</form:form>
</body>
</html>
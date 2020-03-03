<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<table border="1">
 <tr>
<td><h2>cdtype</h2></td>
 </tr>
</table>

 
 <form action="home" method="post">
  <div class="form-group">
    <label >CDtype Title</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label>CDType</label>
    <select class="form-group" name="cdtype">
      <option value="Unknown">Select...</option>
      <option value="Internatioanal edition">International edition</option>
      <option value="Special Edition">Special Edition</option>
      
      
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">cdtype</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="CDType" name="CDType">
  </div>
 <input type="submit"/> 
 <input type="reset"/> 
</form>
</body>
</html>
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
<form action="processForm" method="post">
  <div class="form-group">
    <label >League Title</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label>League Season</label>
    <select class="form-control" name="season">
      <option value="Unknown">Select...</option>
      <option value="Summer">Summer</option>
      <option value="Winter">Winter</option>
      <option value="Autumn">Autumn</option>
      
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">League Year</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="year" name="year">
  </div>
 <input type="submit"/> 
 <input type="reset"/> 
</form>
</body>
</html>
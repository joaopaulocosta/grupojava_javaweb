<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	  <style type="text/css">
	    <%@ include file="../bootstrap/css/bootstrap.css"%>
	   
	  </style>
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	  <script type="text/javascript">
	  	
	  	<%@ include file="../bootstrap/js/script.js"%>
	  </script>  
</head>
<body>
	<h2 class="text-center">Novo Usuário</h2>
	<div class="col-sm-3">
	</div>
	<div class="col-sm-6">
		<form class="form-signin" action="${pageContext.request.contextPath}/novoUsuario" method="post">
			<div class="form-group row">
			  <label for="example-text-input" class="col-2 col-form-label">Nome</label>
			  <div class="col-10">
			    <input class="form-control" type="text" name="name" id="example-text-input">
			  </div>
			</div>
			<div class="form-group row">
			  <label for="example-email-input" class="col-2 col-form-label">Email</label>
			  <div class="col-10">
			    <input class="form-control" type="email" name="email"  id="example-email-input">
			  </div>
			</div>
			<div class="form-group row">
			  <label for="example-password-input" class="col-2 col-form-label">Password</label>
			  <div class="col-10">
			    <input class="form-control" type="password" name="password"  id="example-password-input">
			  </div>
			</div>
			<div class="form-group row">
		    	<button type="submit" class="btn btn-primary">Cadastrar</button>
		    </div>
	    </form>
</div>
	</div>
</body>
</html>
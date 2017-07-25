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
	<h2 class="text-center">Usuários</h2>

	<div class="col-sm-2">
	</div>
	<div class="col-sm-8">
		<table class="table">
		  <thead >
		    <tr>
		      <th>Id</th>
		      <th>Nome</th>
		      <th>Email</th>
		    </tr>
		  </thead>
		  <tbody>
			  <c:forEach var="usuario" items="${usuarios}">
			  		<tr>
				      <th scope="row">${usuario.id}</th>
				      <td>${usuario.name}</td>
				      <td>${usuario.email}</td>
				    </tr> 
			   </c:forEach>
		  </tbody>
		</table>
	</div>
	<div class="col-sm-4">
	</div>
	<div class="col-sm-2">
		<a href="${pageContext.request.contextPath}/jsp/novoUsuario.jsp">
			<button type="button" class="btn btn-success">
				Novo Usuário
			</button>
		</a>
	</div>
	<div class="col-sm-2">
		<a href="${pageContext.request.contextPath}/">
			<button type="button" class="btn btn-danger">
				Sair
			</button>
		</a>
	</div>
</body>
</html>
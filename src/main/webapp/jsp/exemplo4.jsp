<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var ="cidades" >Belo Horizonte, Lavras, Rio de Janeiro, São Paulo </c:set>
<html>
<body>
	<h2>Selecione a cidade</h2>
	<form>
		<label for="cidades">Cidades:</label>
		<select name="cidades">		
			<c:forEach var="cidade" items="${cidades}"> 
				<option>${cidade}</option>
			</c:forEach>
		</select>	
	</form>
</body>
</html>
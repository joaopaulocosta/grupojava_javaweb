<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%! String[] cidades = {"Belo Horizonte","Lavras", "Rio de Janeiro", "São Paulo"}; %>
<html>
<body>
	<h2>Selecione a cidade</h2>
	<form>
		<label for="cidades">Cidades:</label>
		<select name="cidades">
			<%for(String cidade: cidades){%>
				<option><%= cidade %></option>
			<%} %>
		</select>
	</form>
</body>
</html>
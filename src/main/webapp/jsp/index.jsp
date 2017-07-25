<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		  <style type="text/css">
		    <%@ include file="../bootstrap/css/bootstrap.css"%>
		    <%@ include file="../bootstrap/css/style.css"%>
		  </style>
		  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		  <script type="text/javascript">
		  	
		  	<%@ include file="../bootstrap/js/script.js"%>
		  </script>  
	</head>
	<body>
		 <div class="container">
	        <div class="card card-container">
	            <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
	            <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
	            <p id="profile-name" class="profile-name-card"></p>
	            <form class="form-signin" action="${pageContext.request.contextPath}/autenticacao" method="post">
	                <span id="reauth-email" class="reauth-email"></span>
	                <input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required autofocus>
	                <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>	     
	                <c:if test="${not empty(param.resp) && param.resp == 'rejeitado' }">
	                	<div class="alert alert-danger" role="alert">Usuário ou senha inválidos, tente novamente!</div>
	                </c:if>
	                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Enter</button>
	            </form><!-- /form -->
	        </div><!-- /card-container -->
	    </div><!-- /container -->
	</body>
</html>
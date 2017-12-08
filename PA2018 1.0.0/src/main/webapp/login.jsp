<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	
	<link href="css/bootstrap-3.3.7.min.css" rel="stylesheet">
	<link href="css/login-styles.css" rel="stylesheet">
	<script src="js/bootstrap-3.3.7.min.js"></script>
</head>
<body id="loginBody">
	<div class="container">
		<div class="card card-container">
			<img id="profile-img" class="profile-img-card"
				src="Smith.PNG" />
			<p id="profile-name" class="profile-name-card"></p>
			<%-- Manejo de mensajes --%>
			<s:if test="hasActionMessages()">
				<div class="alert alert-success fade in">
					<a href="#" class="close" data-dismiss="alert">×</a> 
			      	<strong><s:actionmessage/></strong>
			   	</div>
			</s:if>
			
			<s:if test="hasActionErrors()">
   				<div class="alert alert-warning fade in">
					<a href="#" class="close" data-dismiss="alert">×</a> 
      				<strong><s:actionerror/></strong>
   				</div>
			</s:if>
			<form action="<s:url action="login" namespace="/"/>" method="POST" class="form-signin">
				<span id="reauth-email" class="reauth-email"></span>
				 <input type="usuario" id="usuario" name="login.usuario" class="form-control" placeholder="usuario" required autofocus> 
				 <input type="password" id="inputPassword" name="login.password" class="form-control" placeholder="Contraseña" required>
				<button class="btn btn-lg btn-primary btn-block btn-signin"
					type="submit">Iniciar sesión</button>
			</form>
			
		</div>
	</div>
</body>
</html>

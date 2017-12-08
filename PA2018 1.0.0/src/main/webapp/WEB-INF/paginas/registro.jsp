<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<link href="css/login-styles.css" rel="stylesheet">
	<link href="css/bootstrap-3.3.7.min.css" rel="stylesheet">
	<script src="js/bootstrap-3.3.7.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="card card-container">
			<h3>Ingresa tus datos</h3>
			<s:form action="registro" namespace="/socios" method="POST" class="form-signin">
				<span id="reauth-email" class="reauth-email"></span>
				<s:fielderror/>
				<s:textfield name="usuario.usuario" class="form-control" placeholder="Usuario"></s:textfield>
				<s:textfield name="usuario.nombre" class="form-control" placeholder="Nombre" ></s:textfield>
				<s:textfield name="usuario.apPaterno" class="form-control" placeholder="Apellido paterno"></s:textfield>
				<s:textfield name="usuario.apMaterno" class="form-control" placeholder="Apellido materno" ></s:textfield>
				<s:password name="usuario.password" class="form-control" placeholder="Contraseña"></s:password>
				<select name="usuario.tipo">
				 <option value="Admin">Administrador</option>
				 <option value="Usuario">Usuario</option>
				</select>
				<button class="btn btn-lg btn-primary btn-block btn-signin"
					type="submit">Crear cuenta</button>
			</s:form>			
		</div>
	</div>
</body>
</html>

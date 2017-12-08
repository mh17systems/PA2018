<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<head>
			<link href="../css/login-styles.css" rel="stylesheet">
			<link href="../css/bootstrap-3.3.7.min.css" rel="stylesheet">
			<script src="../js/bootstrap-3.3.7.min.js"></script>
			<script src="../js/jquery-2.2.4.js"></script>
		</head>
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
	</head>
	
 	<body id="loginBody">
    	<div class="container">
      		<nav class="navbar navbar-default">
        		<div class="container-fluid">
          			<div class="wrap">
						<span class="decor"></span>
							<nav>
  								<ul class="primary">
    								<li><a href="<s:url action="showMenuFolios" namespace="/socios"/>">Inicio</a></li>
    								<li><a href="<s:url action="createTicket" namespace="/socios"/>">Crear Folio</a></li>
    								<li><a href="<s:url action="showCambioPasswdForm" namespace="/socios"/>">Cambio contraseña</a></li>
    								<li><a href="<s:url action="logout" namespace="/socios"/>">Cerrar Sesi&oacute;n</a></li>
    								<c:if test="${ sessionScope.tipo == 'Admin' }">
              							<li><a href="<s:url action="showRegisterForm" namespace="/socios"/>">Agregar Usuario</a></li>
              						</c:if>
  								</ul>
							</nav>
						</div>
        			</div>
     			 </nav>
      <tiles:insertAttribute name="body" />
	</div> 
</body>
</html>
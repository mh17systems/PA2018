<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
	
	<link href="css/bootstrap-3.3.7.min.css" rel="stylesheet">
	<link href="css/login-styles.css" rel="stylesheet">
	<script src="js/bootstrap-3.3.7.min.js"></script>
</head>
<body id="loginBody">
	
			<p id="profile-name" class="profile-name-card"></p>
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
			
			<h4>Bienvenido ${sessionScope.nombreCompleto}, usted tiene los siguientes folios abiertos:</h4>
			<form action="<s:url action="showDetail" />" method="POST" class="form-signin">
			<table id="tabFolios">
			<tr class="rowFolios">
  					<th id="celTabFolios"></th>
  					<th id="celTabFolios"></th>
  					<th id="celTabFolios">
  					
  					<select name="folio.idRelacion">
  					<c:forEach items="${folios}" var="folio">
				 		<option value="${folio.idFolio}">${folio.idFolio}</option>
					</c:forEach> 
					</select>
  					</th>
  					<th id="celTabFolios"><button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Detalles</button></th>
  					<th id="celTabFolios"></th>
  					<th id="celTabFolios"></th>
  				</tr>
				<c:forEach items="${folios}" var="folio">
  				<tr class="rowFolios">
  					<th id="celTabFolios">Id de Folio</th>
  					<th id="celTabFolios">Fecha de Folio</th>
  					<th id="celTabFolios">Emisor</th>
  					<th id="celTabFolios">Receptor</th>
  					<th id="celTabFolios">Titulo</th>
  					<th id="celTabFolios">Descripción</th>
  				</tr>
  				<tr class="rowFolios">
     				<td id="celTabFolios">${folio.idFolio}</td>
     				<td id="celTabFolios">${folio.fecha}</td>
     				<td id="celTabFolios">${folio.idEmisor}</td>
     				<td id="celTabFolios">${folio.idReceptor}</td>
     				<td id="celTabFolios">${folio.titulo}</td>
     				<td id="celTabFolios">${folio.detalles}</td>
  				</tr>
				</c:forEach> 

				</table>
			</form>
</body>
</html>




			
				
			

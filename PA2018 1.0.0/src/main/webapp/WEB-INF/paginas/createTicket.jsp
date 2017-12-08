<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="card card-container">
	<h3>Crear Nuevo Folio</h3>
	<s:form action="registroFolio" namespace="/socios" method="POST" class="form-signin">
		<span id="reauth-email" class="reauth-email"></span>
		<s:fielderror/>
		<select name="folio.idEmisor" id="bloqueado">
				 <option value="${sessionScope.usuario}">${sessionScope.usuario}</option>
		</select>
		Destinatario:
		<select name="folio.idReceptor">
			<c:forEach items="${usuarios}" var="usuario">
				 <option value="${usuario.nombre}">${usuario.nombre}</option>
			</c:forEach> 
		</select>
		<s:textfield name="folio.titulo" class="form-control" placeholder="Título" ></s:textfield>
		<s:textfield name="folio.detalles" class="form-control" placeholder="Detalles" ></s:textfield>
		<button type="submit" class="btn btn-lg btn-primary btn-block btn-signin">Crear Folio</button>
	</s:form>			
	
	
</div><!-- /card-container -->
<%@page import="es.indra.categorias.beans.Categoria"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>

<% 
List<Categoria> todas = (List<Categoria>) request.getAttribute("listadoGeneral");
for (Categoria cats: todas) {
%>
	<tr>
		<td><%= cats.getId() %>  </td>
		<td><%= cats.getNombre() %>  </td>
	</tr>

<%	
}
%>
</table>

</body>
</html>
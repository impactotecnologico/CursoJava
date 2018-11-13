<%
	session.setAttribute("usuario", null);
	for(Cookie cs : request.getCookies()){
		if (cs.getName().equals("lang")) {
			Cookie c = new Cookie("lang",null);
			c.setMaxAge(0);
			response.addCookie(c);
		}
	}
%>
<%@ include file="header.jsp" %>


<%@ include file="formulario.jsp" %>


<%@ include file="footer.jsp" %>
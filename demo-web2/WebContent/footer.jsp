


<%

	Cookie cs[] = request.getCookies();
	for (Cookie c: cs) {
		System.out.println(c.getName() + ":" + c.getValue());
		if (c.getName().equals("lang") && c.getValue() != null) out.println("idioma: " + c.getValue());
	}

%>
</body>
</html>
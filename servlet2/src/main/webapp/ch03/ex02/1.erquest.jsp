<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<ul>
	<li><%= request.getRequestURL() %>
	<li><%= request.getProtocol() %>
	<li><%= request.getServerName() %>
	<li><%= request.getContextPath() %>
	<li><%= request.getQueryString() %>
	<li><%= request.getMethod() %>
	
</ul>
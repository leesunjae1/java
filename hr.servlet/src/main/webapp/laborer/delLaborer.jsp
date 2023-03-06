<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='service.LaborerService' %>
<%@ page import='service.LaborerServiceImpl' %>
<%!
	LaborerService laborerService = new LaborerServiceImpl();
%>
<%
	String laborerId = request.getParameter("laborerId");
	laborerService.delLaborer(Integer.parseInt(laborerId));
%>
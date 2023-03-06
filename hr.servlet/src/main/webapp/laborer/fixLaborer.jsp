<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='service.LaborerService' %>
<%@ page import='service.LaborerServiceImpl' %>
<%@ page import='domain.Laborer' %>
<%@ page import='java.time.LocalDate'%>
<%@ page import='java.time.format.DateTimeFormatter'%>
<%!
	LaborerService laborerService = new LaborerServiceImpl();
%>
<%
	String laborerId = request.getParameter("laborerId");
	String laborerName = request.getParameter("laborerName");
	String hireDate = request.getParameter("hireDate");
	
	laborerService.fixLaborer(new Laborer(
			Integer.parseInt(laborerId),
			laborerName,
			LocalDate.parse(hireDate, DateTimeFormatter.ISO_DATE)));
%>
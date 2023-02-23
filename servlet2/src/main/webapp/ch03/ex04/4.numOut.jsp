<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%
	String numStr = request.getParameter("num");

	try {
		int num = Integer.parseInt(numStr);
%>
	<%= num * 2 %>
	<a href= '4.numIn.jsp'>back</a>
<%
	} catch(NumberFormatException e) {
%>	
	<c:redirect url='4.numIn.jsp?msg=input number.'/>
<%
	}
%>	
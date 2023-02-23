<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form action='loginProc.jsp'>
	아이디: <input type='text' name='java'/>
	패스워드: <input type='password' name='java'/>
	<input type='submit'/>
</form>

<%
	String msg = request.getParameter("msg");
%>

<%= msg != null ? msg : "" %>

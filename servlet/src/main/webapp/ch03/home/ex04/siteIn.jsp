<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form action='siteProc.jsp'>
	<input type='radio' name='site'value='daum'/> daum
	<input type='radio' name='site' value='naver'/> naver
	<input type='submit'/>
</form>
<%
	String msg = request.getParameter("msg");
%>
<%= msg != null ? msg : "" %>

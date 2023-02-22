<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
A
<% // url이 1.b.jsp로 바뀐다
	response.sendRedirect("1.b.jsp");
%>
<!-- 포워드는 클라이언트가 안끼어들고
 리다이렉트는 클라이언트가 끼어든다 -->
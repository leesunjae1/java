<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
A   <!-- forward = A가 쓴걸 그대로 B로 넘긴다(덮어쓰기), A와B는 같다  -->
<%
	RequestDispatcher dispatcher = request.getRequestDispatcher("1.b.jsp");
	dispatcher.forward(request, response);
%>
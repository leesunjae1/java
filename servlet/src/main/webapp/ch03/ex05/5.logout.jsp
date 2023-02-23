<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<a href='5.main.jsp'>main</a>
<%
	session.invalidate(); // 섹션객체는 invalidate를 만나면 죽는다, 
						//로그아웃버튼을 누르면 실행시킨다
%>
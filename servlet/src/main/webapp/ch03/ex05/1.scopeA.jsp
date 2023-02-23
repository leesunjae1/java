<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<% 
	pageContext.setAttribute("one", "페이지"); //현 페이지 작동 동안
	request.setAttribute("two", "리퀘스트"); // 클라이언트에게 리스판스를 받는 동안, 많이사용한다
	session.setAttribute("three", "세션"); //논리적인 연결 동안
	application.setAttribute("four","애플리케이션"); //앱이 작동하는 동안
%>

<c:redirect url='1.scopeB.jsp'/>
<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%
	pageContext.setAttribute("username", "최한석");
%>
${username} <br>
${hello} <br>
${empty hello} <br> <!-- hello가 null값인지 확인 -->
${empty username ? "무명" : username} <br>
<%-- 아래 조건문을 완성하세요. --%>
${!empty username ? username: "무명"} <br>

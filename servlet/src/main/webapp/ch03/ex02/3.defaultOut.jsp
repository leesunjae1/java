<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<% 
	String text = request.getParameter("text");
	String number = request.getParameter("number");
	String date = request.getParameter("date");
	String checkbox = request.getParameter("checkbox");
	String radio = request.getParameter("radio");
	
	String text2 = request.getParameter("text2");
	String number2 = request.getParameter("numbe2r");
	String date2 = request.getParameter("date2");
	String checkbox2 = request.getParameter("checkbox2");
	String radio2 = request.getParameter("radio2");
%>

<%= text %> <%= text2 %><br>
<%= number %> <%= number2 %><br>
<%= date %> <%= date2 %><br>
<%= checkbox %> <%= checkbox2 %><br>
<%= radio %> <%= radio2 %>


<%-- 
checkbox,radio 기본값이 없어서 null이 출력된다
checkbox,radio 파라미터로 쓰고싶으면 checked를 이용한다
--%>
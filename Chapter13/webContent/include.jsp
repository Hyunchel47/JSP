<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
   request.setCharacterEncoding("utf-8");
   String name = request.getParameter("name");
   String imgName = request.getParameter("imgName");
%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>include.jsp : 조현철</title>
	</head>
	<body>
		안녕하세요. JSP 쇼핑몰 시작 부분입니다. <br>
		<jsp:include page="duke_image.jsp">
			<jsp:param value="듀크" name="name"/>
			<jsp:param value="duke.png" name="imgName"/>
		</jsp:include>
		
		
		
		<br>
		JSP 쇼핑몰 끝 부분입니다.
	</body>
</html>
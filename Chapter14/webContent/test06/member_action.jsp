<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, sec02.ex01.*"
    pageEncoding="UTF-8" 
    isELIgnored="false" %>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<jsp:useBean id="m" class="sec02.ex01.MemberBean" />
		<jsp:setProperty name="m" property="*" />
		
		<%
			MemberDAO memDAO = new MemberDAO();
			// 회원 정보 추가.
			memDAO.addMember(m);
			// 회원 정보 조회.
			List memberList = memDAO.listMembers();
			// 조회한 회원 정보를 request에 바인딩.
			request.setAttribute("memberList", memberList);
		%>
	</head>
	
	<body>
		<jsp:forward page="memberList.jsp" />
	</body>
</html>
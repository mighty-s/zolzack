<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%-- set defaultVO --%>
<c:set var="vo" value="${defaultVO}"/>

<html>
<head>
	<meta charset="UTF-8">
	<title>REST-API HOME</title>
</head>
<body>
	<h1> 이곳은 REST API 서버 주소입니다. </h1>
	<P> 당신이 접속한 시간 : ${serverTime} </P>
	<p> 당신이 접속한 IP : ${vo.remoteAddr}   </p>
	<p> 사용환경 : ${vo.remoteURI}    </p>
	<p> 사용환경 : ${vo.remoteMethod} </p>
	
	<ul>
		<li>스프링 5.14</li>
		<li>Tomcat 8</li>
		<li>Nginx 10</li>
		<li>기타 등등</li>
	</ul>
</body>
</html>
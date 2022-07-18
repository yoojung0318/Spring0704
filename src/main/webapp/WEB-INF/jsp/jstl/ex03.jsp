<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 포멧 라이브러리</title>
</head>
<body>
	<c:set var="number" value="123456789"/>
	
	<h2>숫자 포멧</h2>
	
	<h4><fmt:formatNumber value="${number }"/></h4>
	<h4><fmt:formatNumber value="${number }" type="number" groupingUsed="false"/></h4>

	<h2>통화 표현</h2>
	<h4>원: <fmt:formatNumber value="${number}" type="currency" /></h4>
	<h4>달러: <fmt:formatNumber value="${number}" type="currency" currencySymbol="$" /></h4>


	<h2> 비율</h2>
	<h4> 100 % : <fmtLformatNumber value="1" type="percent" /></h4>
	<h4> 45 % : <fmtLformatNumber value="0.45" type="percent" /></h4>
	
	<h2>포맷 결과 저장</h2>
	<fmt:formatNumber value="0.24" type="percent" var="percent"/>
	
	<h4> ${percent }</h4>
	
	
	<h2> 패턴 </h2>
	
	<h4> 3.14 </h4>
	<h4> <fmt:formatNumber value="3.14" pattern="0.0000" /> </h4>
	<!--  표시할 소수점 자리수 지정 (반올림)-->
	<h4> <fmt:formatNumber value="3.14" pattern="#.####" /> </h4>
	<h4> <fmt:formatNumber value="3.141952" pattern="#.####" /> </h4>
	
	
	<h2> 날짜표현하기 </h2>
	<h4> <fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" /></h4>
		 <fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" var="today" />
	<h4>변수로 출력 :  ${today }</h4>
	
	<h2>문자열 date 객체로 변환</h2>
	<%-- 2022년 07월  18일 20시 16분 31초 --%>
	<%--날짜 정보가 문자열 형태로 전달 됐을때, 포맷을 바꾸고 싶을 때 --%>	 
	<fmt:parseDate value="${today }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" />
	
	<h4> <fmt:formatDate value="${date }" pattern="yyyy/MM/dd hh:mm:ss" /> </h4>
	

</body>
</html>
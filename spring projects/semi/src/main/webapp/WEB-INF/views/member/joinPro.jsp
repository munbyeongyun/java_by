<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>���ԿϷ�</h1>
<c:choose>
	<c:when test="${(chk == true)}">
		<script type="text/javascript">
			alert("ȸ�������� �Ϸ�Ǿ����ϴ�.")
			location.href="/semi";
		</script>
	</c:when>
	<c:otherwise>
		<script type="text/javascript">
			alert("ȸ�������� �����߽��ϴ�.")
			location.href="/semi";
		</script>
	</c:otherwise>
</c:choose>
</body>
</html>
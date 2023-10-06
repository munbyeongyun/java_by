<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>메타독</title>


</head>
<body>
	<!-- Navigation-->
	<!-- header1 -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand" href="#!">Casuals</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
					<li class="nav-item"><a class="nav-link" href="<c:url value='/'/>">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="<c:url value='/about'/>">About</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdown" href="#"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#!">NEAT</a></li>
							<li><hr class="dropdown-divider" /></li>
							<li><a class="dropdown-item" href="#!">Hood T-shirt</a></li>
							<li><a class="dropdown-item" href="#!">JACKET</a></li>
						</ul>
					</li>
				</ul>
				<!-- <form class="d-flex"> -->
				<!-- 로그인 전 -->
				<c:if test="${SessionScope.id==null}">
					<!-- Button trigger modal -->
					<button type="button" class="btn btn-primary" data-toggle="modal"
						data-target="#login">로그인</button>
					<!-- Modal -->
					<div class="modal fade" id="login" tabindex="-1" role="dialog"
						aria-labelledby="loginLabel" aria-hidden="true">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<!-- Modal Header -->
								<div class="modal-header">
									<h5 class="modal-title" id="loginLabel">로그인/회원가입</h5>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>

								<!-- Modal Body -->
								<div class="modal-body">
									<form action="" class="was-validated">
										<div class="form-group">
											<label for="user_id">아이디 </label> <input type="text"
												class="form-control" id="user_id" placeholder="아이디를 입력하세요"
												name="user_id" required>
											<div class="valid-feedback">확인</div>
											<div class="invalid-feedback">아이디를 입력해주세요</div>
										</div>
										<div class="form-group">
											<label for="user_pw">비밀번호 </label> <input type="password"
												class="form-control" id="user_pw" placeholder="비밀번호를 입력하세요"
												name="user_pw" required>
											<div class="valid-feedback">확인</div>
											<div class="invalid-feedback">비밀번호를 입력해주세요</div>
										</div>
										<button type="submit" class="btn btn-primary"
											style="margin-left: 50%;">로그인</button>
										<button type="button" class="btn btn-secondary" onclick="location.href='<c:url value='/member/joinForm' />'">회원가입</button>
									</form>
								</div>
								<!-- Modal footer -->
								<div class="modal-footer">
									<button type="button" class="btn btn-danger"
										data-dismiss="modal">취소</button>
								</div>
							</div>
						</div>
					</div>
				</c:if>
				<!-- 로그인 후 -->
				<c:if test="${SessionScope.id!=null}">
						ㅇㅇㅇ님 반갑습니다.
						<!-- 일반사용자 -->
					<c:choose>

						<c:when test="${SessionScope.adminId==null}">
							<button class="btn btn-outline-dark" type="submit">
								<i class="bi-cart-fill me-1"></i> Cart <span
									class="badge bg-dark text-white ms-1 rounded-pill">0</span>
							</button>

							<!-- Example single danger button -->
							<div class="btn-group">
								<button type="button" class="btn btn-danger dropdown-toggle"
									data-bs-toggle="dropdown" aria-expanded="false">마이페이지</button>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="#">주문목록</a></li>
									<li><a class="dropdown-item" href="#">찜한상품</a></li>
									<li><a class="dropdown-item" href="#">최근본상품</a></li>
									<li><hr class="dropdown-divider"></li>
									<li><a class="dropdown-item" href="#">회원정보변경</a></li>
									<li><a class="dropdown-item" href="#">1:1문의</a></li>
									<li><a class="dropdown-item" href="#">로그아웃</a></li>
								</ul>
							</div>
						</c:when>
						<c:otherwise>
							<div class="btn-group">
								<button type="button" class="btn btn-danger dropdown-toggle"
									data-bs-toggle="dropdown" aria-expanded="false">관리자페이지</button>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="#">주문목록</a></li>
									<li><a class="dropdown-item" href="#">찜한상품</a></li>
									<li><a class="dropdown-item" href="#">최근본상품</a></li>
									<li><hr class="dropdown-divider"></li>
									<li><a class="dropdown-item" href="#">회원정보변경</a></li>
									<li><a class="dropdown-item" href="#">1:1문의</a></li>
									<li><a class="dropdown-item" href="#">로그아웃</a></li>
								</ul>
							</div>
						</c:otherwise>
					</c:choose>
				</c:if>
				<!-- 		</form> -->
			</div>
		</div>
	</nav>
	<!-- header1 end -->
	<!-- header2 -->
	<!-- Header-->
	<header class="bg-dark py-5" style = "background-image:url(https://cdn.imweb.me/thumbnail/20191008/580c8b89ced59.jpg); background-color:#dddddd; background-repeat : no-repeat; background-size : cover; background-position : 50% 50%;">
		<div class="container px-4 px-lg-5 my-5">
			<div class="text-center text-white">
				<h1 class="display-4 fw-bolder">
					<span style="font-size: 36px;">2023. SEPT.</span> <br>
					<span style="font-size: 76px;">NEW ARRIVAL</span> <br>
					<span style="font-size: 26px;">CHECK THIS NOW.</span> <br>
				</h1>
			</div>
		</div>
	</header>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container px-4 px-lg-5">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
					<li class="nav-item"></li>
					<li class="nav-item"><a class="nav-link" href="#!">전체상품</a></li>
					<li class="nav-item"><a class="nav-link" href="#!">베스트</a></li>
					<li class="nav-item"><a class="nav-link" href="#!">남성의류</a></li>
					<li class="nav-item"><a class="nav-link" href="#!">신발</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>
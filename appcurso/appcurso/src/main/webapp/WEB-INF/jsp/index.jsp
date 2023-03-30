<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript" src="https://livejs.com/live.js"></script>
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<title>App Curso</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/template/menu.jsp"></c:import>
	<main>
		<section class="banner">
			<aside class="titulo">
				<h2>Bem vindo ao mundo de aprendizagem</h2>
				<p>Desenvolsa seu conhecimento através de cursos online.</p>

			</aside>
			<figure>
				<img src="image/logo.png" alt="Logo App Cursos"
					title="Logo App Cursos" class="img-banner">
			</figure>

		</section>


	</main>
	<c:import url="/WEB-INF/jsp/template/footer.jsp"></c:import>
</body>
</html>
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
		<h2>Bem vindo aos cursos de Banco de Dados!</h2>


		<p>
			Para cadastrar um novo curso <a href="/cadastro-banco-dados">acesse
				aqui</a>
		</p>

		<p>
			Para visualizar os cursos já cadastrados <a href="/lista-banco-dados">acesse
				aqui.</a>
		</p>


	</main>
	<c:import url="/WEB-INF/jsp/template/footer.jsp"></c:import>
</body>
</html>
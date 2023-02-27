<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Cadastro Agile</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/template/menu.jsp"></c:import>
	<main>
		<form class="form-cadastro" method="post" action="/cliente/incluir"
			autocomplete="on">
			<fieldset>
				<legend>Cadastro Agile</legend>
				<p>
					<label for="nome">Nome do curso:</label> <input type="text"
						class="form-input-nome" id="nome" name="nome"
						value="Thalita Policarpo" placeholder="Nome completo" required>
				</p>
				<p>
					<label for="cpf">CPF:</label> <input type="text"
						class="form-input-cpf" id="cpf" name="cpf"
						value="Thalita Policarpo" placeholder="insira seu CPF" required>
				</p>

				<p>
					<label for="idade">Idade:</label> <input type="number"
						class="form-input-idade" id="idade" name="idade" value="29"
						placeholder="insira sua idade" required>
				</p>

			</fieldset>
			<article class="box-buttons">
				<input type="reset" class="btn-limpar" value="Limpar &#128465; ">
				<input type="submit" class="btn-enviar" value="Enviar &#9993;">
			</article>
		</form>
	</main>

	<c:import url="/WEB-INF/jsp/template/footer.jsp"></c:import>

</body>
</html>
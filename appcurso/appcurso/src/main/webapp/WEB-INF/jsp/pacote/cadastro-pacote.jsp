<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Cadastro Pacote</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/template/menu.jsp"></c:import>
	<main>
		<form class="form-cadastro" method="post" action="/pacote/incluir"
			autocomplete="on">
			<fieldset>
				<legend>Cadastro de Pacote</legend>
				
				<p>
					<label for="descricao">Descrição:</label> <input type="text"
						class="form-input-metodologia" id="descricao" name="descricao"
						value="Breve descrição" placeholder="insira uma descrição" required>
				</p>
				
				<p>
					<label for="mobile">Mobile:</label>
				</p>
				<p>
					<input type="radio" class="form-radio-presencial" id="mobile"
						name="mobile" value=true> Sim <input type="radio"
						class="form-radio-presencial" id="mobile" name="mobile"
						value=false checked> Não
				</p>
<!-- 				<p>
					<label for="data">Data:</label> <input type="number"
						class="form-input-duracao" id="data" name="data" value="25/02/2023"
						placeholder="informe a data" required>
				</p> -->

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
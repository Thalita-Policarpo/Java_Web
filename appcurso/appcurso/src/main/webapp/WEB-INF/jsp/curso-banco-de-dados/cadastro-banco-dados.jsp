<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Cadastro Banco de Dados</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/template/menu.jsp"></c:import>
	<main>
		<form class="form-cadastro" method="post"
			action="/banco-de-dados/incluir" autocomplete="on">
			<fieldset>
				<legend>Cadastro Banco de Dados</legend>

				<c:import url="/WEB-INF/jsp/curso/cadastro.jsp"></c:import>

				<p>

					<label for="tipo">Tipo:</label> <input type="text"
						class="form-input-metodologia" id="tipo" name="tipo" value="SQL"
						placeholder="insira a metodologia" required>
				</p>
				
				<p>
					<label for="relacional">Banco relacional:</label>
				</p>
				<p>
					<input type="radio" class="form-radio-presencial" id="relacional"
						name="relacional" value=true> Sim <input type="radio"
						class="form-radio-presencial" id="relacional" name="relacional"
						value=false checked> Não
				</p>

				<p>
					<label for="exigencia">Exigencia:</label>
				</p>
				<p>
					<input type="radio" class="form-radio-presencial" id="exigencia"
						name="exigencia" value=true> Requer conhecimento prévio <input
						type="radio" class="form-radio-presencial" id="exigencia"
						name="exigencia" value=false checked> Não requer
					conhecimento prévio
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
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
		<form class="form-cadastro" method="post" action="/banco-de-dados/incluir"
			autocomplete="on">
			<fieldset>
				<legend>Cadastro Banco de Dados</legend>
				<p>
					<label for="nomeCurso">Nome do curso:</label> <input type="text"
						class="form-input-nomeCurso" id="nomeCurso" name="nomeCurso"
						value="Banco de Dados" placeholder="Nome do curso" required>
				</p>
				<p>
					<label for="valor">Valor do Curso R$:</label> <input type="number"
						class="form-input-valor" id="valor" name="valor" value=250
						placeholder="Valor do curso R$" required>
				</p>
				<p>

					<label for="tipo">Tipo:</label> <input type="text"
						class="form-input-metodologia" id="tipo" name="tipo"
						value="SQL" placeholder="insira a metodologia" required>
				</p>

				<p>
					<label for="exigencia">Exigencia:</label>
				</p>
				<p>
					<input type="radio" class="form-radio-presencial" id="exigencia"
						name="exigencia" value=true> Requer conhecimento prévio <input
						type="radio" class="form-radio-presencial" id="exigencia"
						name="exigencia" value=false checked> Não requer conhecimento prévio
				</p>
				<p>
					<label for="relacional">Banco relacional:</label>
				</p>
				<p>
					<input type="radio" class="form-radio-presencial" id="relacional"
						name="relacional" value=true> Sim <input
						type="radio" class="form-radio-presencial" id="relacional"
						name="relacional" value=false checked> Não
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
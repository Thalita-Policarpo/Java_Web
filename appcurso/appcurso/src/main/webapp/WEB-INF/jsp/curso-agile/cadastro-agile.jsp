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
		<form class="form-cadastro" method="post" action="/agile/incluir"
			autocomplete="on">
			<fieldset>
				<legend>Cadastro Agile</legend>
				
				<c:import url="/WEB-INF/jsp/curso/cadastro.jsp"></c:import>
				
				<p>

					<label for="metodologia">Metodologia:</label> <input type="text"
						class="form-input-metodologia" id="metodologia" name="metodologia"
						value="Agile" placeholder="insira a metodologia" required>
				</p>
				<p>
					<label for="duracao">Meses de duração</label> <input type="number"
						class="form-input-duracao" id="duracao" name="duracao" value="3"
						placeholder="de 1 a 6 meses" required>
				</p>
				<p>
					<label for="presencial">Modelo:</label>
				</p>
				<p>
					<input type="radio" class="form-radio-presencial" id="presencial"
						name="presencial" value=true> Presencial <input
						type="radio" class="form-radio-presencial" id="presencial"
						name="presencial" value=false checked> Online
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
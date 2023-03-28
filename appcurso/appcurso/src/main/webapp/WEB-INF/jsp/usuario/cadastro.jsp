<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Cadastro de Usuários</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/template/menu.jsp"></c:import>
	<main>
		<form class="form-cadastro" method="post" action="/usuario/incluir"
			autocomplete="on">
			<fieldset>
				<legend>Cadastro de usuário</legend>
				<p>
					<label for="nome">Nome:</label> <input type="text"
						class="form-input-nome" id="nome" name="nome" value="Thalita Policarpo"
						placeholder="Nome completo" required minlength="5"
						autocomplete="name">
				</p>
				<p>
					<label for="nascimento">Data de nascimento:</label> <input
						type="date" class="form-date-nascimento" id="nascimento" name="nascimento"
						required value="1993-12-11">
				</p>
				<article class="checked">
					<p>
						<label for="genero">Gênero:</label> <br>
					</p>
					<section class="form-radio-genero">
						<input type="radio" id="genero" name="genero" value="Masculino">
						Masculino <br> 
						<input type="radio" id="genero" name="genero"
							value="Feminino" checked> Feminino
					</section>

				</article>
				<p>
					<label for="email">E-mail:</label> 
					<input type="email"
						class="form-input-email" id="email" name="email"
						value="thalita_policarpo@outlook.com"
						placeholder="exemplo@exmail.com.br"
						pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required
						autocomplete="email">
				</p>
				<p>
					<label for="senha">Senha:</label> <input type="password"
						class="form-input-senha" id="senha"name="senha" value="123456"
						placeholder="Digite sua senha (mínimo 8 letras)" required
						minlength="6" maxlength="10" autocomplete="new-password">
				</p>
				
				<c:import url="/WEB-INF/jsp/endereco/cadastro.jsp"></c:import>
			
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
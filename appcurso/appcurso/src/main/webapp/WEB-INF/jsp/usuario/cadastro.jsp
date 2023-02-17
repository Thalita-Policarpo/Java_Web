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
	<main>
		<c:import url="/WEB-INF/jsp/template/menu.jsp"></c:import>
		<form class="form-cadastro" method="post" action="/usuario/incluir"
			autocomplete="on">
			<fieldset>
				<legend>Cadastro de usuário</legend>
				<p>
					<label for="nome">Nome:</label> <input type="text"
						class="form-input-nome" name="nome" value="Thalita Policarpo"
						placeholder="Nome completo" required minlength="5"
						autocomplete="name">
				</p>
				<p>
					<label for="nascimento">Data de nascimento:</label> <input
						type="date" class="form-date-nascimento" name="nascimento"
						required value="1993-12-11">
				</p>
				<article class="checked">
					<p>
						<label for="genero">Gênero:</label> <br>
					</p>
					<section class="form-radio-genero">
						<input type="radio" name="genero" value="Masculino">
						Masculino <br> <input type="radio" name="genero"
							value="Feminino" checked> Feminino
					</section>

					<p>
						<label for="tipoUsuario">Usuário:</label><br>
					</p>
					<section class="form-radio-tipoUsuario">
						<input type="radio" name="tipoUsuario" value="Professor" checked>
						Professor <br> <input type="radio" name="tipoUsuario"
							value="Aluno"> Aluno
					</section>

					<p>
						<label for="interesses">Interesses:</label><br>
					</p>
					<section class="form-check-interesses">
						<input type="checkbox" name="interesses" value="Agile" checked>
						Agile <br> <input type="checkbox" name="interesses"
							value="Banco de Dados"> Banco de dados <br> <input
							type="checkbox" name="interesses" value="Programação" checked>
						Programação
					</section>

				</article>
				<p>
					<label for="email">E-mail:</label> <input type="email"
						class="form-input-email" name="email"
						value="thalita_policarpo@outlook.com"
						placeholder="exemplo@exmail.com.br"
						pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required
						autocomplete="email">
				</p>
				<p>
					<label for="senha">Senha:</label> <input type="password"
						class="form-input-senha" name="senha" value="123456"
						placeholder="Digite sua senha (mínimo 8 letras)" required
						minlength="6" maxlength="10" autocomplete="new-password">
				</p>
				<p>
					<label for="confirmarSenha">Confirme sua senha:</label> <input
						type="password" class="form-input-senha" name="confirmarSenha"
						value="123456" placeholder="Digite novamente sua senha" required
						maxlength="10" autocomplete="new-password">
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
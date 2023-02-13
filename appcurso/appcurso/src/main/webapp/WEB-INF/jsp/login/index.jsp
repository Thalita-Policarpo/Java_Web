<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script type="text/javascript" src="https://livejs.com/live.js"></script>
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<title>Document</title>
</head>
<body>
	<main>
		<section class="forms-login-cadastro">

			<!--   Formul�rio de Cadastro    -->
			<article>
				<form class="form-cadastro" method="post" action="/usuario/incluir" autocomplete="on" target="tela">
					<fieldset>
						<legend>Cadastrar novo Usu�rio</legend>
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
								<label for="genero">G�nero:</label> <br>
							</p>
							<section class="form-radio-genero">
								<input type="radio" name="genero" value="Masculino">
								Masculino <br> <input type="radio" name="genero"
									value="Feminino" checked> Feminino
							</section>

							<p>
								<label for="tipoUsuario">Usu�rio:</label><br>
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
									type="checkbox" name="interesses" value="Programa��o" checked>
								Programa��o
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
								placeholder="Digite sua senha (m�nimo 8 letras)" required
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
						<input type="submit" class="btn-enviar"
							value="Cadastrar &#128221;">
					</article>
				</form>
			</article>

			<!--   Texto de alternativa    -->
			<article>
				<h2>J� � cadastrado?</h2>
				<p class="paragrafo-opcao">&#10149;</p>
			</article>

			<!--   Formul�rio de Login    -->
			<article>
				<form action="/home" method="post" class="form-login" target="tela">
					<fieldset>
						<legend>Acesse sua conta</legend>
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
								placeholder="Digite sua senha (m�nimo 8 letras)" required
								minlength="6" maxlength="10" autocomplete="new-password">
						</p>
					</fieldset>
					<article class="box-buttons">
						<input type="reset" class="btn-limpar" value="Limpar &#128465; ">
						<input type="submit" class="btn-enviar" value="Entrar &#10159;">
					</article>
				</form>
			</article>


		</section>
	</main>
</body>
</html>
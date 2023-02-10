<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Usuários</title>

<style type="text/css">

body {
    font-family: Arial, Helvetica, sans-serif;
    background-color: rgba(235, 233, 233, 0.616);
    margin: 0px;
    line-height: 1em;
    align-items: center;
}

#container{
    margin: auto;
    width: 960px;
    background-color: white;
    border-radius: 0px 0px 10px 10px;
    box-shadow: 4px 4px 9px 0px rgba(0, 0, 0, 0.384);
    position: relative;
}

header {
    margin: auto;
    border-radius: 8px 8px 0px 0px;
}

nav  figure  img {
    margin: 0;
    padding: 0;
    width: 50px;
    height: 50px;
}

nav figure{
    margin: 0;
    padding: 0;
}

nav {
    width: 100%;
    height: 85px;
    display: inline-flex;
    justify-content: space-around;
    align-items: center;
    background-color: #0064A7;
    padding: 0;
    box-shadow: 2px 2px 4px 0px #082640a8;
}

nav  ul  li{
    display: inline-flex;
    flex-direction: row;
}

nav  ul  li  a{
    text-decoration: none;
    color: white;
    font-weight: bold;
    margin-right: 1.2em;
}

nav a:hover{
    text-decoration: underline;
}

.form-busca{
    align-items: center;
    background-color:white;
    border:solid 1px #061F39;
    padding: 0;
    border-radius:10px;
    width:40%;
}

.form-input-busca{
    align-items: center;
    float:left;
    background-color:transparent;
    padding-left:5px;
    font-style:italic;
    font-size:16px;
    border:none;
    height:36px;
    width:86%;
}

.button-busca{
    width: 30px;
    height: 30px;
    padding: 8px;
    background: transparent;
    border: none;
}


.button-busca:hover{
    font-size: 1em;
}

figcaption {
    padding: 0 0.5em;
}

.cadastro {
    padding: 20px;
}

.cadastro p{
    color: #562a1f;
    font-family:'Poppins', sans-serif;
    font-size: 1em;
    text-align: left;
    padding: 0.5px;
}

.form-input-nome, .form-date-nascimento, .form-input-email, .form-input-senha{
    height: 40px;
    padding: 0px 10px;
    font-family: 'Poppins', sans-serif;
    font-weight: normal;
    width: 100%;
    border: solid 0.5px;
    border-radius: 08px;
    margin: 10px 0px;
}

.box-buttons{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
}


.form-input-nome:hover, .form-date-nascimento:hover, .form-input-email:hover, .form-input-senha:hover{
    background-color:rgba(183, 241, 245, 0.288);
}
fieldset{
    padding: 10px 45px;
    text-align: left;
    border: 3px dashed #051c36b0;
    margin: 15px;
}
legend{
    padding: 10px;
    color: #051C36;
    font-weight: bold;
    font-family: 'Changa', sans-serif;
    font-size: 1.2em;
}
.btn-enviar{
    background-color: #0064A7;
    font-size: 1em;
    color: white;
    border: none;
    border-radius: 10px 0px;
    min-width: 200px;
    max-width: 40%;
    padding: 5px;
    margin: 5px 15px;
    
}
.btn-enviar:hover{
    text-decoration: underline;
}
.btn-enviar:active{
    background-color: rgb(65, 182, 91);
    font-size: 1.1em;
}

.btn-limpar{
    background-color:#051c36e3;
    font-size: 1em;
    color: white;
    border: none;
    border-radius: 0px 10px;
    min-width: 100px;
    max-width: 15%;
    padding: 5px;
    margin: 5px 15px;
    
}

.btn-limpar:hover{
    text-decoration: underline;
}
.btn-limpar:active{
    background-color: #049DBF;
    font-size: 1.1em;
}

footer {
    clear: both;
    background-color: #0064A7;
    color: white;
    padding: 4px;
    margin: 0px;
    margin-top: 10px;
}
footer > p {
    margin: 0px;
    font-size: 0.7em;
    font-weight: bold;
    color: white;
}
</style>
</head>
<body>
	<div id="container"> 
	<header>
            <nav>
                <figure>
                    <img src="image/figure.png" alt="logo da App Cursos" title="logo da App Cursos">
                </figure>
                <ul>
                    <li><a href="/" title="HOME">HOME</a></li>
                    <li><a href="/lista" title="LISTA">LISTA</a></li>
                    <li><a href="/usuario" title="CADASTRO">CADASTRO</a></li>
                </ul>

                <form action="" class="form-busca">
                    <input type="text" class="form-input-busca" placeholder="Pesquisar"/>
                    <input type="submit" class="button-busca" value="&#x1F50D;">
                </form>
                <button class="entrar">Entrar</button>
            </nav>
        </header>
		<main>
			<form class="cadastro" method="post" action="/usuario/incluir" autocomplete="on">
				<fieldset>
					<legend>Cadastro de usuário</legend>
					<p>
						<label for="nome">Nome:</label>
						<input type="text" class="form-input-nome" name="nome" value="Thalita Policarpo" placeholder="Nome completo" required minlength="5" autocomplete="name">
					</p>
                    <p>
                        <label for="nascimento">Data de nascimento:</label>
                        <input type="date" class="form-date-nascimento" name="nascimento" required value="">
                    </p>
                    <article class="checked">
                        <p>
                            <label for="genero">Gênero:</label> <br>
                    
                            <input type="radio" class="form-radio-genero" name="genero" value="Masculino" > Masculino <br>
                            <input type="radio" class="form-radio-genero" name="genero" value="Feminino"  checked> Feminino
                        </p>

                        <p>
                            <label for="tipoUsuario">Usuário:</label><br>
                            <input type="radio" class="form-radio-tipoUsuario" name="tipoUsuario" value="Professor" checked> Professor <br>
                            <input type="radio" class="form-radio-tipoUsuario" name="tipoUsuario" value="Aluno"> Aluno
                        </p>

                        <p>
                            <label for="interesses">Interesses:</label><br>
                            <input type="checkbox" class="form-check-interesses" name="interesses" value="Agile"  checked> Agile <br>
                            <input type="checkbox" class="form-check-interesses" name="interesses" value="Banco de Dados" > Banco de dados <br>
                            <input type="checkbox" class="form-check-interesses" name="interesses" value="Programação" checked> Programação
                        </p>

                    </article>
                    <p>
                        <label for="email">E-mail:</label>
                        <input type="email" class="form-input-email" name="email" value="thalita_policarpo@outlook.com" placeholder="exemplo@exmail.com.br" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required autocomplete="email">
                    </p>
                    <p>
                        <label for="senha">Senha:</label>
                        <input type="password" class="form-input-senha" name="senha" value="123456" placeholder="Digite sua senha (mínimo 8 letras)" required minlength="6" maxlength="10" autocomplete="new-password" >
                    </p>
                    <p>
                        <label for="confirmarSenha">Confirme sua senha:</label>
                        <input type="password" class="form-input-senha" name="confirmarSenha" value="123456" placeholder="Digite novamente sua senha" required maxlength="10" autocomplete="new-password" >
                    </p>
				</fieldset>
                        <article class="box-buttons">
                            <input type="reset"  class="btn-limpar" value="Limpar &#128465; ">
                            <input type="submit" class="btn-enviar" value="Enviar &#9993;">
                        </article>
			</form>
		</main>
        <footer>
            <p>
                Copyright
            </p>
        </footer>
	</div>
</body>
</html>
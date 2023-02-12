<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/estilo.css" >
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Cadastro de Usuários</title>

</head>
<body>
	<div id="container"> 
	<header>
            <nav>
                <figure>
                    <img src="image/figure.png" alt="logo da App Cursos" title="logo da App Cursos" class="menu-logo">
                </figure>
                <ul>
                    <li><a href="/home" title="HOME">HOME</a></li>
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
<form class="form-lista-usuarios" method="get" action="/usuario" autocomplete="on">
            <div class="box-table-cadastrados">
                <fieldset>
                    <legend>Lista de usuários</legend>

                    <table class="table-cadastrados">
                        <thead>
                            <tr>
                                <th>Nome</th>
                                <th>Nascimento</th>
                                <th>Gênero</th>
                                <th>Tipo de Usuário</th>
                                <th>Interesses</th>
                                <th>E-mail</th>
                                <th>Senha</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Thalita Policarpo</td>
                                <td>11/12/1993</td>
                                <td>Feminino</td>
                                <td>Aluno</td>
                                <td>Banco de dados, Programação</td>
                                <td>thalita.fsilva@al.infnet.edu.br</td>
                                <td>123456</td>
                            </tr>
                            <tr>
                                <td>Thalita Policarpo</td>
                                <td>11/12/1993</td>
                                <td>Feminino</td>
                                <td>Aluno</td>
                                <td>Banco de dados, Programação</td>
                                <td>thalita.fsilva@al.infnet.edu.br</td>
                                <td>123456</td>
                            </tr>
                            <tr>
                                <td>Thalita Policarpo</td>
                                <td>11/12/1993</td>
                                <td>Feminino</td>
                                <td>Aluno</td>
                                <td>Banco de dados, Programação</td>
                                <td>thalita.fsilva@al.infnet.edu.br</td>
                                <td>123456</td>
                            </tr>
                            <tr>
                                <td>Thalita Policarpo</td>
                                <td>11/12/1993</td>
                                <td>Feminino</td>
                                <td>Aluno</td>
                                <td>Banco de dados, Programação</td>
                                <td>thalita.fsilva@al.infnet.edu.br</td>
                                <td>123456</td>
                            </tr>
                            <tr>
                                <td>Thalita Policarpo</td>
                                <td>11/12/1993</td>
                                <td>Feminino</td>
                                <td>Aluno</td>
                                <td>Banco de dados, Programação</td>
                                <td>thalita.fsilva@al.infnet.edu.br</td>
                                <td>123456</td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </div>
            <article class="box-buttons">
                <input type="submit" class="btn-enviar" value="Novo &#10011;">
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
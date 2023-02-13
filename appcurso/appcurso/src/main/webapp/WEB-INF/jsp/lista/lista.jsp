<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/estilo.css" >
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Usuários Cadastrados</title>

</head>
<body>
	<main>
		<form class="form-lista-usuarios" method="get" action="/usuario" autocomplete="on" target="tela">
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
</body>
</html>
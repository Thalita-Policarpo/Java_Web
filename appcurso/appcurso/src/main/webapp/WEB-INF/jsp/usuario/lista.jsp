<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Usuários Cadastrados</title>

</head>
<body>
	<main>
		<c:if test="${not empty mensagem}">
			<div class="alert-success">
				<p>
					<strong>Atenção!</strong> ${mensagem}
				</p>
			</div>
		</c:if>
			
			<form class="form-lista-usuarios" method="get" action="/usuario"
				autocomplete="on" target="tela">

			<c:if test="${empty usuarios}">
				<h5>Não existem usuários cadastrados</h5>
			</c:if>

			<c:if test="${not empty usuarios}">
				<h5>Quantidade de usuários cadastrados: ${usuarios.size()}!</h5>

				<div class="box-table-cadastrados">

					<fieldset>
						<legend>Lista de usuários</legend>

						<table class="table-cadastrados">
							<thead>
								<tr>
									<th>ID</th>
									<th>Nome</th>
									<th>Nascimento</th>
									<th>Gênero</th>
									<th>Tipo de Usuário</th>
									<th>Interesses</th>
									<th>E-mail</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="u" items="${usuarios}">
									<tr>
										<td>${u.id}</td>
										<td>${u.nome}</td>
										<td>${u.nascimento}</td>
										<td>${u.genero}</td>
										<td>${u.tipoUsuario}</td>
										<td>${u.interesses}</td>
										<td>${u.email}</td>
										<td><a href="/usuario/${u.id}/excluir">Excluir
												&#10060;</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</fieldset>
				</div>
			</c:if>
			<article class="box-buttons">
			<input type="submit" class="btn-enviar" value="Novo &#10011;">
		</article>
		</form>
	</main>
</body>
</html>
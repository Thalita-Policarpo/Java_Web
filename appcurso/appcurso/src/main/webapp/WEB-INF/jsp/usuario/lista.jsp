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
	<c:import url="/WEB-INF/jsp/template/menu.jsp"></c:import>
	<main>

		<c:if test="${not empty mensagem}">
			<div class="alert-success">
				<p>
					<strong>Atenção!</strong> ${mensagem}
				</p>
			</div>
		</c:if>


		<c:if test="${empty usuarios}">
			<h5>Não existem usuários cadastrados</h5>
		</c:if>

		<c:if test="${not empty usuarios}">
			<h5>Quantidade de usuários cadastrados: ${usuarios.size()}!</h5>

			<div class="box-table-cadastrados">
	<fieldset>
	<legend>Lista de Usuários</legend>
				<table class="table-cadastrados">
					<thead>
						<tr>
							<th>ID</th>
							<th>Nome</th>
							<th>Nascimento</th>
							<th>Gênero</th>
							<th>E-mail</th>
							<th>Clientes</th>							
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="u" items="${usuarios}">
							<tr>
								<td>${u.id}</td>
								<td>${u.nome}</td>
								<td>${u.nascimento}</td>
								<td>${u.genero}</td>
								<td>${u.email}</td>
								<td>${u.clientes.size()}</td>
								<td><a href="/usuario/${u.id}/excluir">Excluir &#10060;</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
	</fieldset>
			</div>
		</c:if>
	</main>
	<c:import url="/WEB-INF/jsp/template/footer.jsp"></c:import>
</body>
</html>
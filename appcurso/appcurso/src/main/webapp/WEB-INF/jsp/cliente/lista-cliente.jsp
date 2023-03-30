<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Clientes Cadastrados</title>

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


		<c:if test="${empty clientes}">
			<h5>Não existem clientes cadastrados</h5>
		</c:if>

		<c:if test="${not empty clientes}">
			<h5>Quantidade de clientes cadastrados: ${clientes.size()}!</h5>

			<div class="box-table-cadastrados">
				<fieldset>
					<legend>Lista de Clientes</legend>
					<table class="table-cadastrados">
						<thead>
							<tr>
								<th>ID</th>
								<th>Nome</th>
								<th>CPF</th>
								<th>Idade</th>
								<th>Usuário</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${clientes}">
								<tr>
									<td>${c.id}</td>
									<td>${c.nome}</td>
									<td>${c.cpf}</td>
									<td>${c.idade}</td>
									<td>${c.usuario.nome}</td>
									<td><a href="/cliente/${c.id}/excluir">Excluir
											&#10060;</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</fieldset>
			</div>
		</c:if>
		<form class="form-cadastro" method="get" action="/cadastro-cliente"	autocomplete="on">
			<input type="submit" class="btn-enviar" value="Novo &#10011;">
		</form>
	</main>
	<c:import url="/WEB-INF/jsp/template/footer.jsp"></c:import>
</body>
</html>
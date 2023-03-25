<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Lista do Pacote</title>

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


		<c:if test="${empty pacotes}">
			<h5>Não existem pacotes cadastrados</h5>
		</c:if>

		<c:if test="${not empty pacotes}">
			<h5>Quantidade de pacotes cadastrados: ${pacotes.size()}!</h5>

			<div class="box-table-cadastrados">
				<fieldset>
					<legend>Lista do Pacote</legend>
					<table class="table-cadastrados">
						<thead>
							<tr>
								<th>ID</th>
								<th>Descrição</th>
								<th>Mobile</th>
								<th>Data</th>
								<th>Cliente</th>								
								<th>Cursos</th>								
								<th> </th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="p" items="${pacotes}">
								<tr>
									<td>${p.id}</td>
									<td>${p.descricao}</td>
									<td>${p.mobile}</td>
									<td>${p.data}</td>
									<td>${p.cliente.nome}</td>
									<td>${p.cursos.size()}</td>
									<td><a href="/pacote/${p.id}/excluir">Excluir
											&#10060;</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</fieldset>
			</div>
		</c:if>
		<form class="form-cadastro" method="get" action="/cadastro-pacote"
			autocomplete="on">
			<input type="submit" class="btn-enviar" value="Novo &#10011;">
		</form>
	</main>
	<c:import url="/WEB-INF/jsp/template/footer.jsp"></c:import>
</body>
</html>
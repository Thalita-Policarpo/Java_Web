<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript" src="https://livejs.com/live.js"></script>
<link rel="stylesheet" type="text/css" href="css/estilo.css">
<title>App Curso</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/template/menu.jsp"></c:import>
	<main>
		<h2>Bem vindo aos cursos de Banco de Dados!</h2>


		<p>
			Para cadastrar um novo curso <a href="/cadastro-banco-dados">acesse aqui</a>
		</p>
		
<c:if test="${not empty mensagem}">
			<div class="alert-success">
				<p>
					<strong>Atenção!</strong> ${mensagem}
				</p>
			</div>
		</c:if>


		<c:if test="${empty bancoDeDados}">
			<h5>Não existem Cursos cadastrados</h5>
		</c:if>

		<c:if test="${not empty bancoDeDados}">
			<h5>Quantidade de cursos cadastrados: ${bancoDeDados.size()}!</h5>

			<div class="box-table-cadastrados">
				<fieldset>
					<legend>Lista de Cursos</legend>
					<table class="table-cadastrados">
						<thead>
							<tr>
								<th>ID</th>
								<th>Nome do curso</th>
								<th>Tipo</th>
								<th>Exigência</th>
								<th colspan="2">Relacional</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="b" items="${bancoDeDados}">
								<tr>
									<td>${b.id}</td>
									<td>${b.nomeCurso}</td>
									<td>${b.tipo}</td>
									<td>${b.exigencia}</td>
									<td>${b.relacional}</td>
									<td><a href="/bancoDeDados/${a.id}/excluir">Excluir
											&#10060;</a></td>
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
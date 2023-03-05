<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Lista dos cursos Agile cadastrados</title>

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


		<c:if test="${empty agiles}">
			<h5>Não existem cursos de Agile cadastrados</h5>
		</c:if>

		<c:if test="${not empty agiles}">
			<h5>Quantidade de cursos cadastrados: ${agiles.size()}!</h5>

			<div class="box-table-cadastrados">
				<fieldset>
					<legend>Lista de Cursos Agile</legend>
					<table class="table-cadastrados">
						<thead>
							<tr>
								<th>ID</th>
								<th>Nome do curso</th>
								<th>Metodologia</th>
								<th>Duração</th>
								<th>Presencial</th>								
								<th> </th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="a" items="${agiles}">
								<tr>
									<td>${a.id}</td>
									<td>${a.nomeCurso}</td>
									<td>${a.metodologia}</td>
									<td>${a.duracao}</td>
									<td>${a.presencial}</td>
									<td><a href="/agile/${a.id}/excluir">Excluir
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
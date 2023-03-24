<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Lista dos cursos cadastrados</title>

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


		<c:if test="${empty cursos}">
			<h5>Não existem cursos cadastrados</h5>
		</c:if>

		<c:if test="${not empty cursos}">
			<h5>Quantidade de cursos cadastrados: ${cursos.size()}!</h5>

			<div class="box-table-cadastrados">
				<fieldset>
					<legend>Lista de Cursos</legend>
					<table class="table-cadastrados">
						<thead>
							<tr>
								<th>ID</th>
								<th>Descrição</th>
								<th>Nome do curso</th>						
								<th>Valor</th>						
								<th> </th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${cursos}">
								<tr>
									<td>${c.id}</td>
									<td>${c.descricao}</td>
									<td>${c.nomeCurso}</td>
									<td>${c.valor}</td>
									<td><a href="/curso/${c.id}/excluir">Excluir
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
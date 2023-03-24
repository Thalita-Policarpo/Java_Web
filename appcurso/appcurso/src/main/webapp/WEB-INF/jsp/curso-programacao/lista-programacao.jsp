<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="css/estilo.css">
<script type="text/javascript" src="https://livejs.com/live.js"></script>

<title>Lista dos cursos de Programação cadastrados</title>

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


		<c:if test="${empty cursosProgramacao}">
			<h5>Não existem cursos de Programação cadastrados</h5>
		</c:if>

		<c:if test="${not empty cursosProgramacao}">
			<h5>Quantidade de cursos cadastrados:
				${cursosProgramacao.size()}!</h5>

			<div class="box-table-cadastrados">
				<fieldset>
					<legend>Lista de Cursos de Programação</legend>
					<table class="table-cadastrados">
						<thead>
							<tr>
								<th>ID</th>
								<th>Nome do curso</th>
								<th>Linguagem</th>
								<th>Instituicao</th>
								<th>Duracao</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="p" items="${cursosProgramacao}">
								<tr>
									<td>${p.id}</td>
									<td>${p.nomeCurso}</td>
									<td>${p.linguagem}</td>
									<td>${p.instituicao}</td>
									<td>${p.duracao}</td>
									<td><a href="/cursosProgramacao/${p.id}/excluir">Excluir
											&#10060;</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</fieldset>
			</div>
		</c:if>
		<form class="form-cadastro" method="get"
			action="/cadastro-programacao" autocomplete="on">
			<input type="submit" class="btn-enviar" value="Novo &#10011;">
		</form>
	</main>
	<c:import url="/WEB-INF/jsp/template/footer.jsp"></c:import>
</body>
</html>
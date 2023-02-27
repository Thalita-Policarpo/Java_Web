<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<nav>

	<ul>
		<li>
			<figure>
				<img src="image/figure.png" alt="logo da App Cursos"
					title="logo da App Cursos" class="menu-logo">
			</figure>
		</li>
		<li><a href="/home">Home</a></li>
		<c:if test="${not empty usuario}">
			<li><a href="/lista">Usuario</a></li>
			<li><a href="">Cliente</a></li>
			<li><a href="">Pacote</a></li>
			<li><a href="">Curso</a></li>
			<li><a href="/home-agile">Agile</a></li>
			<li><a href="/home-banco-dados">Banco de dados</a></li>
			<li><a href="/curso-programacao">Programação</a></li>
		</c:if>
	</ul>

	<ul>
		<c:if test="${empty usuario}">
			<li><a href="/usuario" class="btn-menu">Cadastre-se</a></li>
			<li><a href="/login" class="btn-menu">Entrar</a></li>
		</c:if>
		<c:if test="${not empty usuario}">
			<li>Olá, ${usuario.nome}!</li>
			<li><a href="/logout" class="btn-menu">Sair</a></li>
		</c:if>

	</ul>

</nav>
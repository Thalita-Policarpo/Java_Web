<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<header>
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
				<li><a href="/lista-cliente">Cliente</a></li>
				<li><a href="/home-pacote">Pacote</a></li>
				<li><a href="/lista-curso">Curso</a></li>
				<li><a href="/lista-agile">Agile</a></li>
				<li><a href="/lista-banco-dados">Banco de dados</a></li>
				<li><a href="/lista-programacao">Programação</a></li>
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
</header>

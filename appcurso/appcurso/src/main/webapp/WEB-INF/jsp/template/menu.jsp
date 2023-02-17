<%@ page language="java"  contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<nav>
			<figure>
				<img src="image/figure.png" alt="logo da App Cursos"
					title="logo da App Cursos" class="menu-logo">
			</figure>
			<ul>
				<li><a href="/home" >Home</a></li>
				<li><a href="/lista" >Usuario</a></li>
				<li><a href="" >Cliente</a></li>
				<li><a href="" >Pacote</a></li>
				<li><a href="" >Curso</a></li>
				<li><a href="" >Agile</a></li>
				<li><a href="" >Banco de dados</a></li>
				<li><a href="" >Programação</a></li>
			</ul>

			<form action="/usuario" method="get">
				<input type="submit" value="Cadastre-se" class="btn-sair">
			</form>
			<form action="/sair">
				<input type="submit" value="Sair &#10149;" class="btn-sair">
			</form>

		</nav>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Usuárioe</title>
</head>
<body>
	<div claas="Container"> 
	<form action="/usuario/incluir" method="post">
		<div>
			<label>Nome:</label>
			<input type="text" name="nome">
		</div>
		
		<div>
			<label>E-mail:</label>
			<input type="email" name="email">
		</div>
		
		
		<div>
			<label>Senha:</label>
			<input type="password" name="senha">
		</div>
		
		<button type="submit">cadastrar</button>
	</form>
	
	</div>
</body>
</html>
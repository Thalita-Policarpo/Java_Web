<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script type="text/javascript" src="https://livejs.com/live.js"></script>
	<link rel="stylesheet" type="text/css" href="css/estilo.css" >
    <title>Document</title>
</head>
<body>
	<div id="container">
        <header>
            <nav>
                <figure>
                    <img src="image/figure.png" alt="logo da App Cursos" title="logo da App Cursos" class="menu-logo">
                </figure>
                <ul>
                    <li><a href="/home" title="HOME" target="tela">HOME</a></li>
                    <li><a href="/lista" title="SOBRE N�S" target="tela">LISTA</a></li>
                    <li><a href="/usuario" title="CADASTRO" target="tela">CADASTRO</a></li>
                </ul>

                <div class="form-busca">
                    <form action="">
                        <input type="search" class="form-input-busca" placeholder="Pesquisar" />
                        <input type="submit" class="button-busca" value="&#x1F50D;">
                    </form>
                </div>
                <button class="entrar">Entrar</button>
            </nav>
        </header>
        <main>
            <iframe src="/home" frameborder="0" name="tela" id="tela">
                navegador n�o compativel com iframe!
            </iframe>
        </main>
        <footer>
            <p>AppCrusos</p>
        </footer>
    </div>
</body>
</html>
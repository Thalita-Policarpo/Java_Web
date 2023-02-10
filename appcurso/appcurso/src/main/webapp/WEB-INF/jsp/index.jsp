<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>App Curso</title>
   <style type="text/css">

body {
    font-family: Arial, Helvetica, sans-serif;
    background-color: rgba(235, 233, 233, 0.616);
    margin: 0px;
    line-height: 1em;
    align-items: center;
}

#container{
    margin: auto;
    max-width: 960px;
    background-color: white;
    border-radius: 0px 0px 10px 10px;
    box-shadow: 4px 4px 9px 0px rgba(0, 0, 0, 0.384);
    position: relative;
}

header {
    margin: auto;
    border-radius: 8px 8px 0px 0px;
}

nav  figure  img {
    margin: 0;
    padding: 0;
    width: 50px;
    height: 50px;
}

nav figure{
    margin: 0;
    padding: 0;
}

nav {
    width: 100%;
    height: 85px;
    display: inline-flex;
    justify-content: space-around;
    align-items: center;
    background-color: #0064A7;
    padding: 0;
    box-shadow: 2px 2px 4px 0px #082640a8;
}

nav  ul  li{
    display: inline-flex;
    flex-direction: row;
}

nav  ul  li  a{
    text-decoration: none;
    color: white;
    font-weight: bold;
    margin-right: 1.2em;
}

nav a:hover{
    text-decoration: underline;
}

.form-busca{
    align-items: center;
    background-color:white;
    border:solid 1px #061F39;
    padding: 0;
    border-radius:10px;
    width:40%;
}

.form-input-busca{
    align-items: center;
    float:left;
    background-color:transparent;
    padding-left:5px;
    font-style:italic;
    font-size:16px;
    border:none;
    height:36px;
    width:86%;
}

.button-busca{
    width: 30px;
    height: 30px;
    padding: 8px;
    background: transparent;
    border: none;
}


.button-busca:hover{
    font-size: 1em;
}

main img {
    display: block;
    margin: auto;
    padding: .5em;
    min-width: 100%;
    max-width: 100%;
}

.banner{
    display: inline-flex;
    align-items: flex-start;
    padding: 15px 35px;
    width: 100%;
    flex: none;
    order: 0;
    align-self: stretch;
    flex-grow: 0;
}

.titulo{
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    padding: 0px;
    gap: 15px;

    width: 45%;

    flex: none;
    order: 0;
    flex-grow: 1;
}

h1{
    font-family: 'Poppins', sans-serif;
    color: #562a1f;
    font-size: 1.4em;
    padding: 10px;
    display: none;
}   
main h2{
    text-align: left;
    font-family: 'Poppins', sans-serif;
    color: #562a1f;
    font-size: 1.3em;
    padding: 1em;
}
p{
    text-align: justify;
    color: black;
    font-size: 1em;
    margin: 20px 15px;
}      

footer {
    clear: both;
    background-color: #0064A7;
    color: white;
    padding: 4px;
    margin: 0px;
    margin-top: 10px;
}
footer > p {
    margin: 0px;
    font-size: 0.7em;
    font-weight: bold;
    color: white;
}


 </style>
</head>
<body>
	<div id="container">
        <header>
            <nav>
                <figure>
                    <img src="image/figure.png" alt="logo da App Cursos" title="logo da App Cursos">
                </figure>
                <ul>
                    <li><a href="/" title="HOME">HOME</a></li>
                    <li><a href="/lista" title="LISTA">LISTA</a></li>
                    <li><a href="/usuario" title="CADASTRO">CADASTRO</a></li>
                </ul>

                <form action="" class="form-busca">
                    <input type="text" class="form-input-busca" placeholder="Pesquisar"/>
                    <input type="submit" class="button-busca" value="&#x1F50D;">
                </form>
                <button class="entrar">Entrar</button>
            </nav>
        </header>
        <main>
            <section  class="banner">
                <aside class="titulo">
                    <h2>Bem vindo ao mundo de aprendizagem</h2>
                    <p>Desenvolsa seu conhecimento através de cursos online, gratuítos e atualizados.</p>
                </aside>
                <figure>
                    <img src="image/logo.png" alt="Logo App Cursos" title="Logo App Cursos">
                </figure>

            </section>
        </main>
        <footer>
            <p>
                Copyright
            </p>
        </footer>
    </div>
</body>
</html>
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
    <main>
        <form action="/home" method="get" class="form-login">
            <fieldset>
                <legend>Acesse sua conta</legend>
                <p>
                    <label for="email">E-mail:</label>
                    <input type="email" class="form-input-email" name="email" value="thalita_policarpo@outlook.com"
                        placeholder="exemplo@exmail.com.br" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required
                        autocomplete="email">
                </p>
                <p>
                    <label for="senha">Senha:</label>
                    <input type="password" class="form-input-senha" name="senha" value="123456"
                        placeholder="Digite sua senha (m�nimo 8 letras)" required minlength="6" maxlength="10"
                        autocomplete="new-password">
                </p>
            </fieldset>
            <article class="box-buttons">
                <input type="reset" class="btn-limpar" value="Limpar &#128465; ">
                <input type="submit" class="btn-enviar" value="Entrar &#x1F6AA;">
            </article>
        </form>
    </main>
</body>
</html>
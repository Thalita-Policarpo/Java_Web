<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<p>
	<label for="cep">CEP:</label> <input type="text"
		class="form-input-nomeCurso" id="cep" name="cep"
		value="${endereco.cep}" placeholder="CEP" required>
</p>
<p>
	<label for="logradouro">Logradouro:</label> <input type="text"
		class="form-input-nomeCurso" id="logradouro" name="logradouro"
		value="${endereco.logradouro}" placeholder="Logradouro" required>
</p>
<p>
	<label for="complemento">Complemento:</label> <input type="text"
		class="form-input-nomeCurso" id="complemento" name="complemento"
		value="${endereco.complemento}" placeholder="complemento">
</p>
<p>
	<label for="bairro">Bairro:</label> <input type="text"
		class="form-input-nomeCurso" id="bairro" name="bairro"
		value="${endereco.bairro}" placeholder="bairro" required>
</p>
<p>
	<label for="localidade">localidade:</label> <input type="text"
		class="form-input-nomeCurso" id="localidade" name="localidade"
		value="${endereco.localidade}" placeholder="localidade" required>
</p>
<p>
	<label for="uf">UF:</label> <input type="text"
		class="form-input-nomeCurso" id="uf" name="uf"
		value="${endereco.uf}" placeholder="uf" required>
</p>


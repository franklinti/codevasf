<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Regsitro</title>
</head>
<body>
<div id="cabecalho">

	<div>
		<fieldset>
		<legend>Cadastro de Registros</legend>
	   <div align=right>
		Versão 1.0
		</div>
		<form method="post" action="PlanejamentoServlet">
			<table border="0" >
			<tr><td><label>Id:</label></td>
				<td><input name="id" value="${plano.id}" pattern="[1-9]{1,4}"  autofocus="autofocus"placeholder="12345" /></td>
			</tr>
			<tr><td><label>Item:</label></td>
				<td><input	name="item"  placeholder="item"value="${plano.item}" pattern="[1-9]{1,4}"  autofocus="autofocus"placeholder="12345"/></td>			
			</tr>
			<tr><td><label>Sede:</label></td>
				<td><input	name="sede"  placeholder="Sede"value="${plano.sede}"/></td>	
			</tr>
			<tr>
				<td><label>Superintendencia:</label></td>
				<td><input	name="superintendencia"  placeholder="Superintendencia"value="${plano.superintendencia}"/></td>			
			</tr>
			<tr>
				<td><label>Requisitante:</label></td>
				<td><input	name="requisitante"  placeholder="Requisitante"value="${plano.requisitante}"/></td>			
			</tr>
			<tr>
				<td><label>Descricao_do_objeto:</label></td>
				<td><input	name="descricaodoobjeto"  placeholder="Descricaodoobjeto"value="${plano.descricaodoobjeto}"/></td>			
			</tr>
			<tr>
				<td><label>Quantidade_estimada:</label></td>
				<td><input	name="quantidadeestimada"  placeholder="Quantidade_estimada"value="${plano.quantidadeestimada}" pattern="[1-9]{1,4}"  autofocus="autofocus"placeholder="12345"/></td>			
			</tr>
			<tr>
				<td><label>Valor_estimado:</label></td>
				<td><input	name="valorestimado"  placeholder="Valor_estimado"value="${plano.valorestimado}" pattern="[1-9]{1,4}"  autofocus="autofocus"placeholder="12345"/></td>			
			</tr>
			<tr>
				<td><label>data de Inicio:</label></td>
				<td><input type="date" name="data_inicio" value="${plano.datainicio}" placeholder="01/01/2020" /></td>
			</tr>
			<tr>
				<td><label>data Fim:</label></td>
				<td><input type="date" name="data_fim" value="${plano.datafim}" placeholder="01/01/2020" /></td>
			</tr>
			<tr>
				<td><label>Total_de_dias:</label></td>
				<td><input	name="totaldedias"  placeholder="Total_de_dias"value="${plano.totaldedias}" pattern="[1-9]{1,4}"  autofocus="autofocus"placeholder="12345"/></td>			
			</tr>
			<tr>
				<td><label>Justificativaobjetivoestrategicoapoiadoresaquisica:</label></td>
				<td><textarea name="justificativa_objetivo_estrategico_apoiadores_pela_aquisicao" placeholder="justificativa_objetivo_estrategico_apoiadores_pela_aquisicao" rows="10"cols="30"value="${plano.justificativaobjetivoestrategicoapoiadoresaquisicao}"></textarea></td> 		
			</tr>
			<tr>
				<td><label>Programaacaosuportadopelaaquisicao:</label></td>
				<td><input	name="programaacaosuportadoaquisicao"  placeholder="Programa_acao_suportado_pela_aquisicao"value="${plano.programaacaosuportadoaquisicao}"/></td>			
			</tr>
			<tr>
				<td><label>Valor_total:</label></td>
				<td><input	name="valortotal"  placeholder="Valor_total"value="${plano.valortotal}" pattern="[1-9]{1,4}"  autofocus="autofocus"placeholder="12345"/></td>			
			</tr>
			
			<!--  
			<tr>
				<td><label>Escolha uma Opção:</label> </td>
				<td>
				
					<select name="opcao" class="select">
						<option value="Incluir">Incluir</option>
						<option value="Alterar">Alterar</option>
						<option value="Excluir">Excluir</option>
						<option value="Consultar">Consultar</option>
					</select><br />
				</td>
			</tr>
			<tr>-->
				<td>
				</td>
				
				<td>
				<!-- <input type="checkbox" id="opcao" name="opcao" value="Incluir"> -->
				<input class="button"type="submit" name="opcao" value="Enviar">
				<input class="button" type="reset" value="Limpar"> <br /></td>
			</tr>
			</table>
		</form>
		
			
		</fieldset>
	</div>
	
	<div style="clear: both">&nbsp</div>

	<div id="rodape">
	<p align="center">&copy;2020 All rights Reserved &nbsp;&bull;&nbsp;CODEVASF</p>
	</div>
		
</body>
</html>
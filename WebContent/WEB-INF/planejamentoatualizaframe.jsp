<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<link rel="stylesheet" href="assets/css/licitacao.css" />
<title>Planejamento</title>

</head>
<body>
<div class="container">
  <div class="row">
      <div id="flip-container">
            <div id="flip-card">
                <div id="signin" class="face">
                    <form class="form-signin" role="form" method="post" action="Planejamento">
                       <div class="container" align="left"> 
                        <h3><c:out value="${atualiza}"></c:out><hr width="97%" align="left"> </h3>
                       </div>
                       <div style="margin-left:60%; margin-top: -50px; color: black; width: 60% "  >
                        <c:url  value="Planejamento?action=Menu" var="urlmenu"/>
               
                       <!--  <a style="margin-left: 8%;" href="#">Versao 1.0<c:out value="${mensagem}"/></a> -->
                       </div>
                       <br>
                        <br>
                    <div class="entry-group">
	                    	<form method="post" action="Planejamento">
			<table border="0" >
			<c:forEach var="plano" items="${listaConsulta}">
			
			<tr><td><label>Id:</label></td>	
			<td><c:out value="${plano.id}"/></td>
			</tr>	
				<tr><td><label >Item:</label></td>
				<td><input type="text"	name="item"  value="<c:out value="${plano.item}"/>"/></td>			
			</tr>
			<tr><td><label>Sede:</label>&nbsp&nbsp&nbsp&nbsp&nbsp </td>
								<td>
								    <input  type="text"  list="sedes" name="sede" value="<c:out value="${plano.sede}"/>"/>
									<datalist id="sedes">
										<option value="SEDE"/>
										<option value="1ª Superintendencia Regional">
										<option value="2ª Superintendencia Regional">
										<option value="3ª Superintendencia Regional">
										<option value="4ª Superintendencia Regional">
										<option value="5ª Superintendencia Regional">
										<option value="6ª Superintendencia Regional">
										<option value="7ª Superintendencia Regional">
										<option value="8ª Superintendencia Regional">
									</datalist>
								</td>
							</tr>
			<tr>
				<td><label>Requisitante:</label></td>
				<td>
				<input  type="text"  list="requisitantes" name="requisitante" value="<c:out value="${plano.requisitante}"/>"/>
					<datalist id="requisitantes">
							<option value="GRA">
							<option value="GRG">
							<option value="GRD">
							<option value="GRI">
							<option value="GRR">			
					</datalist>	
				</td>			
			</tr>
			<tr>
				<td><label>Descricao do objeto:</label></td>
				<td><input type="text" 	name="descricaodoobjeto"  value="<c:out value="${plano.descricaodoobjeto}"/>"/></td>			
			</tr>
			<tr>
				<td><label>Quantidade estimada:</label></td>
				<td><input type="text"	name="quantidadeestimada" value="<c:out value="${plano.quantidadeestimada}"/>"/></td>			
			</tr>
			<tr>
				<td><label>Valor estimado:</label></td>
				<td><input type="text"	name="valorestimado"  value="<c:out value="${plano.valorestimado}"/>"/></td>			
			</tr>
			<tr>
				<td><label>data de Inicio:</label></td>
				<td><input  type="date" name="datainicio"value="<c:out value="${plano.datainicio}"/>"/></td>
			</tr>
			<tr>
				<td><label>data Fim:</label></td>
				<td><input  type="date" name="datafim" value="<c:out value="${plano.datafim}"/>"/></td>
			</tr>
			<tr>
				<td><label>Total de dias:</label></td>
				<td><input type="text"	name="totaldedias"  value="<c:out value="${plano.totaldedias}"/>"/></td>			
			</tr>
			<tr>
				<td><label>Justificativa do objetivo <br/>estrategico de apoiadores <br/> da aquisicao:</label></td>
				<td><input type="text" style="height: 50px" name="justificativaaquisicao" value="${plano.justificativaaquisicao}"/></textarea></td> 		
			</tr>
			<tr>
				<td><label>Programaacao<br>suportadopela<br>aquisicao:</label></td>
				<td><input type="text"	name="programasuportado" value="<c:out value="${plano.programasuportado}"/>"/></td>			
			</tr>
			<tr>
				<td><label>Valortotal:</label></td>
				<td><input type="text"	name="valortotal" value="<c:out value="${plano.valortotal}"/>" autofocus="autofocus"/></td>			
	       </tr>
			</c:forEach> 
			<tr>
			<td></td>
			<td>
			<button class="btn" type="submit" name="action" value="Atualizarframe">Atualizar</button>
			</td></tr>
		    </table>
		  </form> 
					<hr>
                    </div>
                    </form>
                </div>
            </div>
        </div> <!-- /container -->
  </div>
</div>	
<div>
	<!-- 
	<div style="clear: both">&nbsp</div>

	<div id="rodape">
	<p align="center">&copy;2020 All rights Reserved &nbsp;&bull;&nbsp;CODEVASF</p>
	</div>
		 -->
</body>
</html>
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
<title>Licitacao</title>

</head>
<body>
<div class="container">
  <div class="row">
      <div id="flip-container">
            <div id="flip-card">
                <div id="signin" class="face">
                    <form class="form-signin" role="form" method="post" action="Licitacao">
                     <div class="container" align="left"> 
                        <h3><c:out value="${atualiza}"></c:out><hr width="97%" align="left"> </h3>
                       </div>
                       <div style="margin-left:60%; margin-top: -50px; color: black; width: 60% "  >
                        <c:url  value="Licitacao?action=Menu" var="urlmenu"/>
                        
                        <!-- <a style="margin-left: 8%;" href="#">Versao 1.0<c:out value="${mensagem}"/></a>  -->
                       </div>
                        <br><br>
                    <div class="entry-group">
	                    	<form method="post" action="Licitacao">
			<table border="0" >
			<c:forEach var="licitacao" items="${listaConsulta}">
			
			<tr><td><label>Id:</label></td>	
			<td><c:out value="${licitacao.id}"/></td>
			</tr>	
				<tr><td><label >Item:</label></td>
				<td><input type="text"	name="item" pattern="[1,2,3,4,5,6,7,8,9,0]{0,3}" placeholder="Insira numero" value="<c:out value="${licitacao.item}"/>"/></td>			
			</tr>
			<tr><td><label>Sede:</label>&nbsp&nbsp&nbsp&nbsp&nbsp </td>
								<td>
								    <input type="text"  list="sedes" name="sede" value="<c:out value="${licitacao.sede}"/>"/>
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
				<td><label>Area:</label></td>
				<td>
				<input type="text"  list="areas" name="area" value="<c:out value="${licitacao.area}"/>"/>
				<datalist id="areas">
						<option value="AA">
						<option value="AE">
						<option value="AD">
						<option value="AI">
						<option value="AR">
						</datalist>	
				</td>
			</tr>
			<tr>
				<td><label>Unidade:</label></td>
				<td><input  type="text"	name="unidade"  value="<c:out value="${licitacao.unidade}"/>"/></td>			
			</tr>
			<tr>
				<td><label>Estado:</label></td>
				<td><input 	type="text" list="estados" name="estado" value="<c:out value="${licitacao.estado}"/>"/>
				 <datalist id="estados">
										<option value="AC"/>
										<option value="AL">
										<option value="AM">
										<option value="AP">
										<option value="BA">
										<option value="CE">
										<option value="DF">
										<option value="ES">
										<option value="GO">
										<option value="MA">
										<option value="MG">
										<option value="MS">
										<option value="MT">
										<option value="PA">
										<option value="PB">
										<option value="PE">
										<option value="PI">
										<option value="PR">
										<option value="RJ">
										<option value="RN">
										<option value="RO">
										<option value="RR">
										<option value="RS">
										<option value="SC">
										<option value="SE">
										<option value="SP">
										<option value="TO">
									</datalist>
				</td>			
			</tr>
			<tr>
				<td><label>Processo SRD:</label></td>
				<td><input type="text"	name="processosrd"  value="<c:out value="${licitacao.processosrd}"/>"/></td>			
			</tr>
			<tr>
				<td><label>Nome Analista:</label></td>
				<td><input  type="text" list="nomeanalistas" name="nomeanalista" value="<c:out value="${licitacao.nomeanalista}"/>"/>
				<datalist id="nomeanalistas">
										<option value="Daniel">
										<option value="Robson">
										<option value="Luciana">
										<option value="Edite">
									</datalist>
				</td>
			</tr>
			<tr>
				<td><label>Modalidade:</label></td>
				<td><input  type="text" list="modalidades" name="modalidade" value="<c:out value="${licitacao.modalidade}"/>"/>
				<datalist id="modalidades">
										<option value="Licitacao Eletronica">
										<option value="SRP">
										<option value="RDC">
									</datalist>
				
				</td>
			</tr>
			<tr>
				<td><label>Objeto:</label></td>
				<td><input type="text" 	name="objeto"  value="<c:out value="${licitacao.objeto}"/>"/></td>			
			</tr>
			<tr>
				<td><label>Tipo:</label></td>
				<td><input type="text"  name="tipo" value="${licitacao.tipo}"/></textarea></td> 		
			</tr>
			<tr>
				<td><label>Autorizacao:</label></td>
				<td><input type="text" 	name="autorizacao" value="<c:out value="${licitacao.autorizacao}"/>"/></td>			
			</tr>
			<tr>
				<td><label>Valor Estimado Maximo Codevasf:</label></td>
				<td><input type="text" 	name="valorestimadomaxcvasf" value="<c:out value="${licitacao.valorestimadomaxcvasf}"/>" autofocus="autofocus"/></td>			
	       </tr>
	       <tr>
								<td><label>Valor Adjudicacao:</label></td>
								<td><input type="text" 	name="valoradjudicado" value="<c:out value="${licitacao.valoradjudicado}"/>" placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Emenda Parlamentar:</label></td>
								<td>
								<input type="text"  list="emendas" name="emendaparlamentar" value="<c:out value="${licitacao.emendaparlamentar}"/>" placeholder="" />
								<datalist id="emendas">
										<option value="SIM">
										<option value="NAO">
									</datalist>
								</td>			
							</tr>
							<tr>
								<td><label>Prazo de Execucao:</label></td>
								<td><input type="text" 	name="prazodeexecucao" value="<c:out value="${licitacao.prazodeexecucao}"/>"  placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Data Sessao:</label></td>
								<td><input type="date" 	name="datasessao" value="<c:out value="${licitacao.datasessao}"/>"  placeholder="01/01/2020" /></td>			
							</tr>
							<tr>
								<td><label>Situacao:</label></td>
								<td><input type="text"	name="situacao" value="<c:out value="${licitacao.situacao}"/>" placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Valor Total:</label></td>
								<td><input type="text" 	name="valortotal" value="<c:out value="${licitacao.valortotal}"/>"  placeholder="" /><br></td>			
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
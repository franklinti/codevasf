<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 

 
<title>Lista de Licitacoes</title>
<style>
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
  
}

th, td {
  text-align: left;
  padding: 2px;
}

tr:nth-child(even){background-color: #f2f2f2}

.btn {
  border: none;
  padding: 12px 16px;
  font-size: 16px;
  cursor: pointer;
}

/* Darker background on mouse-over */
.btn:hover {
  background-color: orange;
}

/*Accordion*/
.accordion {
  background-color: #eee;
  color: #444;
  cursor: pointer;
  padding: 18px;
  width: 100%;
  border: none;
  text-align: left;
  outline: none;
  font-size: 15px;
  transition: 0.4s;
}

.active, .accordion:hover {
  background-color: #ccc;
}

.accordion:after {
  content: '\002B';
  color: #777;
  font-weight: bold;
  float: right;
  margin-left: 5px;
}

.active:after {
  content: "\2212";
}

.panel {
  padding: 0 18px;
  background-color: white;
  max-height: 0;
  overflow: hidden;
  transition: max-height 0.2s ease-out;
}
</style>
</head>
<body>
       <h3>Lista de Licitacoes Cadastrados </h3>
            <div style="margin-left: 80%; margin-top: -30px;" >
            <c:url  value="Planejamento?action=Menu" var="urlmenu"/>
            <a  href="${urlmenu}">Menu</a>
            </div>
            <hr>
	<h4 align="left">Total de Licitacoes:
	<c:if test="${fn:length(listaLicitacao) > 0}">
	Existe ${fn:length(listaLicitacao)} licitacao!
	</c:if></h4>

		<c:forEach var="licitacao" items="${listaLicitacao}">
			<button class="accordion">Licitacao - <c:out value="${licitacao.item}"/> <c:out value="${at}" /></button>
            <div class="panel">
            <div  style="overflow-x:auto;">
            <table border="1" >
			<tr>
				<td>Id</td>
				<td>Item</td>
				<td>Sede</td>
				<td>Area</td>
				<td>Unidade</td>
				<td>Estado</td>
				<td>Processo SRD</td>
				<td>Nome Analista</td>
				<td>Modalidade</td> 
				<td>Objeto</td>
				<td>Tipo</td>
			    <td>Autorizacao</td>
			    <td>Valor Estimado maximo codevasf</td>
			    <td>Valor Adjudicado</td>
			    <td>Emenda Parlamentar</td>
			    <td>Prazo de Execucao</td>
			    <td>Data Sessao</td>
			    <td>Situacao</td>
			    <td>Valor Total</td>
			    <td>Comandos</td>	
			
			</tr>
				<tr>
					<td><c:out value="${licitacao.id}"/></td>
					<td><c:out value="${licitacao.item}"/></td>
					<td><c:out value="${licitacao.sede}"/>
					<c:if test="${empty licitacao.sede}">Sede nao informado</c:if>
					</td>
				    <td><c:out value="${licitacao.area}"/>
				    <c:if test="${empty licitacao.area}">Area nao informado</c:if>
				    </td>
					<td><c:out value="${licitacao.unidade}"/>
					<c:if test="${empty licitacao.unidade}">Unidade nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.estado}"/>
					<c:if test="${empty licitacao.estado}">Estado nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.processosrd}"/>
					<c:if test="${empty licitacao.processosrd}">Processosrd nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.nomeanalista}"/>
					<c:if test="${empty licitacao.nomeanalista}">Nome analista nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.modalidade}"/>
					<c:if test="${empty licitacao.modalidade}">Modalidade nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.objeto}"/>
					<c:if test="${empty licitacao.objeto}">Objeto nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.tipo}"/>
					<c:if test="${empty licitacao.tipo}">Tipo nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.autorizacao}"/>
					<c:if test="${empty licitacao.autorizacao}">Autorizacao nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.valorestimadomaxcvasf}"/>
					<c:if test="${empty licitacao.valorestimadomaxcvasf}">Valor estimado maximo codevasf nao informado</c:if>
					</td>
	                <td><c:out value="${licitacao.valoradjudicado}"/>
					<c:if test="${empty licitacao.valoradjudicado}">Valor estimado maximo codevasf nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.emendaparlamentar}"/>
					<c:if test="${empty licitacao.emendaparlamentar}">Valor estimado maximo codevasf nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.prazodeexecucao}"/>
					<c:if test="${empty licitacao.prazodeexecucao}">Valor estimado maximo codevasf nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.datasessao}"/>
					<c:if test="${empty licitacao.datasessao}">Valor estimado maximo codevasf nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.situacao}"/>
					<c:if test="${empty licitacao.situacao}">Valor estimado maximo codevasf nao informado</c:if>
					</td>
					<td><c:out value="${licitacao.valortotal}"/>
					<c:if test="${empty licitacao.valortotal}">Valor estimado maximo codevasf nao informado</c:if>
					</td>
	
				    <td>
				     <a type="submit" href="Licitacao?action=Excluir&id=${licitacao.id}"><button class="btn"><i class="fa fa-trash"></i></button></a>
				     <a type="submit" href="Licitacao?action=Editar&id=${licitacao.id}"><button class="btn"><i class="fa fa-pencil"></i></button></a>
				   </td>
				</tr>
		</table>
		</div>
            </div>
       </c:forEach>
		
		

<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight) {
      panel.style.maxHeight = null;
    } else {
      panel.style.maxHeight = panel.scrollHeight + "px";
    } 
  });
}
</script>
	
</body>
</html>
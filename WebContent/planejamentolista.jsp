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

 
<title>Lista de Planos</title>
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
       <h3>Lista de Planos Cadastrados </h3>
            <div style="margin-left: 80%; margin-top: -30px;" >
            <c:url  value="Planejamento?action=Menu" var="urlmenu"/>
            <a  href="${urlmenu}">Menu</a>
            </div>
            <hr>
	<h4 align="left">Total de Planos:
	<c:if test="${fn:length(listaPlano) > 0}">
	Existe ${fn:length(listaPlano)} planos!
	</c:if></h4>

		<c:forEach var="plano" items="${listaPlano}">
			<button class="accordion">Plano - <c:out value="${plano.item}"/> <c:out value="${at}" /></button>
            <div class="panel">
            <div  style="overflow-x:auto;">
            <table border="1" >
			<tr>
				<td>Id</td>
				<td>Item</td>
				<td>Sede</td>
				<td>Requisitante</td>
				<td>Descricao do objeto</td>
				<td>Quantidade estimada</td>
				<td>Valor estimado</td>
				<td>Data inicio</td>
				<td>Data Fim</td> 
				<td>Total de dias</td>
				<td>Justificativa objetivo estrategico apoiadores pela aquisicao</td>
			    <td>Programa acao suportado pela aquisicao</td>
			    <td>Valor total</td>
			    <td>Comandos</td>	
			
			</tr>
				<tr>
					<td><c:out value="${plano.id}"/></td>
					<td><c:out value="${plano.item}"/></td>
					<td><c:out value="${plano.sede}"/>
					<c:if test="${empty plano.sede}">Sede nao informado</c:if>
					</td>
				    <td><c:out value="${plano.requisitante}"/>
				    <c:if test="${empty plano.requisitante}">Requisitante nao informado</c:if>
				    </td>
					<td><c:out value="${plano.descricaodoobjeto}"/>
					<c:if test="${empty plano.descricaodoobjeto}">Descricao nao informado</c:if>
					</td>
					<td><c:out value="${plano.quantidadeestimada}"/>
					<c:if test="${empty plano.quantidadeestimada}">Quantidade estimada nao informado</c:if>
					</td>
					<td><c:out value="${plano.valorestimado}"/>
					<c:if test="${empty plano.valorestimado}">Valor estimado nao informado</c:if>
					</td>
					<td><c:out value="${plano.datainicio}"/>
					<c:if test="${empty plano.datainicio}">Data inicio nao informado</c:if>
					</td>
					<td><c:out value="${plano.datafim}"/>
					<c:if test="${empty plano.datafim}">Data final nao informado</c:if>
					</td>
					<td><c:out value="${plano.totaldedias}"/>
					<c:if test="${empty plano.totaldedias}">Total dias nao informado</c:if>
					</td>
					<td><c:out value="${plano.justificativaaquisicao}"/>
					<c:if test="${empty plano.justificativaaquisicao}">Justificactivanao informado</c:if>
					</td>
					<td><c:out value="${plano.programasuportado}"/>
					<c:if test="${empty plano.programasuportado}">Programa nao informado</c:if>
					</td>
					<td><c:out value="${plano.valortotal}"/>
					<c:if test="${empty plano.valortotal}">Valor total nao informado</c:if>
					</td>
	
				    <td>
				     <a type="submit" href="Planejamento?action=Excluir&id=${plano.id}"><button class="btn"><i class="fa fa-trash"></i></button></a>
				     <a type="submit" href="Planejamento?action=Editar&id=${plano.id}"><button class="btn"><i class="fa fa-pencil"></i></button></a>
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Resgistros</title>
</head>
<body>
<div align="center">
		<P>Total de Regisgtros:
		<c:if test="${fn:length(listaPlano) > 0}">
   		Existe ${fn:length(listaPlano)} planos!
   		<a href="planejamento.jsp">Voltar</a>
 		</c:if><br> 	</P>
		<table border="1" align= "left">
			<tr>
				<td>Id</td>
				<td>Item</td>
				<td>Sede</td>
				<td>Superintendencia</td>
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
			<!-- na minha var insiro a variável que armazenou os dados  do chamado retorno do metodo items insiro nome do método -->
			<c:forEach var="plano" items="${listaPlano}">
				<tr>
					<td><c:out value="${plano.id}"/></td>
					<td>${plano.item}</td>
					<td>${plano.sede}</td>
					<td>${plano.superintendencia}</td>
				    <td>${plano.requisitante}</td>
					<td>${plano.descricaodoobjeto}</td>
					<td>${plano.quantidadeestimada}</td>
					<td>${plano.valorestimado}</td>
					<td><fmt:formatDate pattern="yyyy-MMM-dd" value="${plano.datainicio}"/></td>
					<td>${plano.datafim}</td>
					<td>${plano.totaldedias}</td>
					<td>${plano.justificativaobjetivoestrategicoapoiadoresaquisicao}</td>
					<td>${plano.programaacaosuportadoaquisicao}</td>
					<td>${plano.valortotal}</td>
					
					 <td><a href="PlanejamentoServlet?opcao=Excluir&id=<c:out value="${plano.id}"/>">Excluir</a></td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
       
	
	
</body>
<!--
					
					
						
					
					
					
					
					
					-->
</html>
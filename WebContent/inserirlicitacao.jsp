<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="assets/css/msnlicitacao.css" />
 <title>Mensagem Cadastro</title>
<style type="text/css">

</style> 
</head>
<body>

                <div class="container">
                    <form  role="form" method="post" action="LicitacaoServlet">
                        <h3 >Mensagem! </h3>
                        <hr>
                        <p href="#" align="left">Versao 1.0</p>
                         <div class="entry-group">
	                     <div>
							<h3 style="color: red"><c:out value="${mensagem}"/></h3>
							<hr>
							Item: <c:out value="${it}"/><c:if test="${empty it}">Item com valor 0</c:if><br>
							Sede: <c:out value="${se}"/><c:if test="${empty se}">Campo vazio</c:if><br>
							Area: <c:out value="${ar}"/><c:if test="${empty ar}">Campo vazio</c:if><br>
							Unidade: <c:out value="${un}"/><c:if test="${empty un}">Campo vazio</c:if><br>
							Estado: <c:out value="${es}"/><c:if test="${empty es}">Campo vazio</c:if><br>
							Processo SRD:<c:out value="${pr}"/><c:if test="${empty pr}">Campo vazio</c:if><br>
							Nome Analista:<c:out value="${na}"/><c:if test="${empty na}">Campo vazio</c:if><br>
							Modalidade:<c:out value="${mo}"/><c:if test="${empty mo}">Campo vazio</c:if><br>
							Objeto: <c:out value="${ob}"/><c:if test="${empty ob}">Campo vazio</c:if><br>
							Tipo: <c:out value="${ti}"/><c:if test="${empty ti}">Campo vazio</c:if><br>
							Autorizacao:<c:out value="${au}"/><c:if test="${empty au}">Campo vazio</c:if><br>
							Valor Estimado maximo codevasf: <c:out value="${ve}"/><c:if test="${empty ve}">Campo vazio</c:if><br>	
							Valor Adjudicado:<c:out value="${va}"/><c:if test="${empty va}">Campo vazio</c:if><br>	
							Emenda Parlamentar:<c:out value="${ep}"/><c:if test="${empty ep}">Campo vazio</c:if><br>	
							Prazo de execucao:<c:out value="${pe}"/><c:if test="${empty pe}">Campo vazio</c:if><br>	
							Data Sessao:<fmt:formatDate  value="${ds}" pattern="dd-MM-yyyy"/><c:if test="${empty ds}">Campo vazio</c:if><br>
							Situacao:<c:out value="${si}"/><c:if test="${empty si}">Campo vazio</c:if><br>	
							Valor Total:<c:out value="${vt}"/><c:if test="${empty vt}">Campo vazio</c:if><br>
							
							<hr>
					    </div>
                    </div>
                    </form>
                </div>
            </div>

</body>
</html>
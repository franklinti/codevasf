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
  <div class="row">
      <div id="flip-container">
            <div id="flip-card">
                <div id="signin" class="face">
                    <form class="form-signin" role="form" method="post" action="PlanejamentoServlet">
                        <h3 class="form-signin-heading">Mensagem! </h3>
                        <hr>
                        <p href="#" id="toSignup" align="left">Versao 1.0</p>
                    <div class="entry-group">
	                     <div>
							<h3 style="color: red"><c:out value="${mensagem}"/></h3>
							<hr>
							Item: <c:out value="${it}"/><c:if test="${empty it}">Item com valor 0</c:if><br>
							Sede: <c:out value="${se}"/><c:if test="${empty se}">Campo vazio</c:if><br>
							Requisitante: <c:out value="${re}"/><c:if test="${empty re}">Campo vazio</c:if><br>
							Descricao do objeto: <c:out value="${de}"/><c:if test="${empty de}">Campo vazio</c:if><br>
							Quantidade estimada: <c:out value="${qt}"/><c:if test="${empty qt}">Campo vazio</c:if><br>
							Valor estimado:<c:out value="${ve}"/><c:if test="${empty ve}">Campo vazio</c:if><br>
							Data inicio: <fmt:formatDate value="${di}" pattern="dd-MM-yyyy"/><c:if test="${empty di}">Campo vazio</c:if><br>
							Data Fim:<fmt:formatDate  value="${df}" pattern="dd-MM-yyyy"/><c:if test="${empty df}">Campo vazio</c:if><br>
							Total de dias: <c:out value="${td}"/><c:if test="${empty td}">Campo vazio</c:if><br>
							Justificativa: <c:out value="${ju}"/><c:if test="${empty ju}">Campo vazio</c:if><br>
							Programa:<c:out value="${pr}"/><c:if test="${empty pr}">Campo vazio</c:if><br>
							Valor Total: <c:out value="${vt}"/><c:if test="${empty vt}">Campo vazio</c:if><br>	
							<hr>
					    </div>
                    </div>
                    </form>
                </div>
            </div>
        </div> <!-- /container -->
  </div>
</div>

</body>
</html>
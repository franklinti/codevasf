<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="assets/css/msnlicitacao.css" />
<title>ExistePlano</title>

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
	                     <br><br><br>
							<h3 style="color: red">
							<c:out value="${msn}"/><br>
							<c:out value="${info}"/><br>
							</h3>
							<hr>
                    </div>
                    </form>
                </div>
            </div>
        </div> <!-- /container -->
  </div>
</div>	
</body>
</html>
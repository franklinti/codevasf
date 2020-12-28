<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>Menu</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-loading" align="center">
	<div align="center">
		<table >
			<tr>
			<td>
			<!-- Wrapper -->
			<div id="wrapper" >
				<!-- Main -->
					<section id="main">
						<header>
							<span class="avatar"><img src="img/plano.jpg" alt="" /></span>
							<h1>Planejamento</h1>
							<p>Garantir resultados.</p>
							 
							  Bem vindo, <c:out value="${mat}" />
							  <h6 style="color: red"><c:out value="${licencaplano}"/>
			                  <c:out value="${qtdplano}"/><br>
						      <c:out value="${contatoplano}"/>
						      </h6>
						</header>
						<hr />
						<h6>Escolha uma opcao?</h6>
						 
						<form method="post" action="Planejamento">
							<ul class="actions">
							<li><input class="button" type="submit" name="action" value="Novo Plano"></li>
							<li><input class="button"  type="submit" name="action" value="Listar"></li>
							</ul>
						</form>
					</section>
					
			</div>
			</td>
			<td>
	<!-- Licitacao
		    <!-- Wrapper -->
			<div id="wrapper">

				<!-- Main -->
					<section id="main">
						<header>
							<span class="avatar"><img src="img/licita.jpg" alt="" /></span>
							<h1>Licitacoes</h1>
							<p>Gerenciar processos.</p>
							  <!-- jSTL -->
							  Bem vindo, <c:out value="${mat}" />
							   <h6 style="color: red"><c:out value="${licencalicitacao}"/>
			                  <c:out value="${qtdlicitacao}"/><br>
						      <c:out value="${contatolicitacao}"/>
						      </h6>
						</header>
						<hr />
						<h6>Escolha uma opcao?</h6>
				        <form method="post" action="Licitacao">
							<ul class="actions">
				            <li><input class="button" type="submit" name="action" value="Nova Licitacao"></li>
							<li><input class="button"  type="submit" name="action" value="Listar"></li>
							</ul>
						</form>
						
					<!--  
						<footer>
							<ul class="icons">
								<li><a href="" class="fa-twitter">Twitter</a></li>
								<li><a href="" class="fa-instagram">Instagram</a></li>
								<li><a href="" class="fa-facebook">Facebook</a></li>
							</ul>
						</footer>
					-->
					</section>

				<!-- Footer
					<footer id="footer">
						<ul class="copyright">
							<li>&copy; Franklin</li>
							<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
						</ul>
					</footer>
                 -->
			</div>
			</td>
			<td>
		<!-- registro
			<!-- Wrapper -->
			<div id="wrapper">

				<!-- Main 
					<section id="main">
						<header>
							<span class="avatar"><img src="img/registro.jpg" alt="" /></span>
							<h1>Registros</h1>
							<p>Acompanhar  execucao.</p>
							 
							  Bem vindo, <c:out value="${mat}" />
							   <h6 style="color: red"><c:out value="${licencaregistro}"/>
			                  <c:out value="${qtdregistro}"/><br>
						      <c:out value="${contatoregistro}"/>
						      </h6>
						</header>
						<hr />
						<h6>Escolha uma opcao?</h6>
						
							<ul class="actions">
				            <li><a href="registro.jsp" type="submit" class="button">Novo Registro</a></li>
							<li><a href="registrolista.jsp" type="submit" class="button">Listar</a></li>
							</ul>
						</form>
						
				
					</section>
                 -->
                 <!--
						<h2>Login</h2>
						 
						<form method="post" action="menu.jsp">
							<div class="field">
								<input type="text" name="matricula" id="matricula" placeholder="Matricula" />
							    </br>
							    <input type="text" name="senha" id="senha" placeholder="Senha" />
							</div>
							
							  
							<div class="field">
								<div class="select-wrapper">
									<select name="department" id="department">
										<option value="">Department</option>
										<option value="sales">Sales</option>
										<option value="tech">Tech Support</option>
										<option value="null">/dev/null</option>
									</select>
								</div>
							</div>
							<div class="field">
								<textarea name="message" id="message" placeholder="Message" rows="4"></textarea>
							</div>
							<div class="field">
								<input type="checkbox" id="human" name="human" /><label for="human">I'm a human</label>
							</div>
							<div class="field">
								<label>But are you a robot?</label>
								<input type="radio" id="robot_yes" name="robot" /><label for="robot_yes">Yes</label>
								<input type="radio" id="robot_no" name="robot" /><label for="robot_no">No</label>
							</div>
							-->
                 	<!--  
						<footer>
							<ul class="icons">
								<li><a href="" class="fa-twitter">Twitter</a></li>
								<li><a href="" class="fa-instagram">Instagram</a></li>
								<li><a href="" class="fa-facebook">Facebook</a></li>
							</ul>
						</footer
					-->
				<!-- Footer 
					<footer id="footer">
						<ul class="copyright">
							<li>&copy; Franklin</li>
							<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
						</ul>
					</footer
					-->

			</div>

		<!-- Scripts -->
			<!--[if lte IE 8]><script src="assets/js/respond.min.js"></script><![endif]-->
			<script>
				if ('addEventListener' in window) {
					window.addEventListener('load', function() { document.body.className = document.body.className.replace(/\bis-loading\b/, ''); });
					document.body.className += (navigator.userAgent.match(/(MSIE|rv:11\.0)/) ? ' is-ie' : '');
				}
			</script>
			</td>
			</tr>
		</table>
		</div>
	</body>

</html>

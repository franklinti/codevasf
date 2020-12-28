<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>Index</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	
	<body class="is-loading">
		<!-- Wrapper -->
			<div id="wrapper">
				<!-- Main -->
					<section id="main">
						<header>
							<span class="avatar"><img src="img/avatar1.jpg" alt="" /></span>
							<h1>Gestão</h1>
							<p>Bem vindo ao gestão</p>
						<h6 style="color: red">
						 <p><c:out value="${mensagem}"/><br>
						<c:out value="${mmat}"/><c:out value="${matricula}"/>
						<c:out value="${msenha}"/><c:out value="${senha}"/></p>
						<c:out value="${conta}"/></p>
						</h6>
						</header>
						<hr />
						<h5>Autenticar</h5>
						 <div class="field">
						    <form  action="ControllerServlet" method="post">
						
							<p><input type="text" name="matricula" placeholder="matricula"/> 
							<!--  <c:if test="${empty matricula}">Campo matricula e obrigatorio</c:if>-->
							</p>
							<p> <input type="password" name="senha" id="password" placeholder="password"/>
							<!--<c:if test="${empty matricula}"><b>Campo senha e obrigatorio</b></c:if>-->
							</p>
							    <ul class="actions">
							      <li><input class="button" type="submit" name="action" value="Entrar"></li>
							      <li><a href="CriarConta?action=CriarConta" class="button" type="submit">Criar Conta</a></li>
							   
							    </ul>
						</form>
						 <div><a href="#">Recuperar senha?</a></div>
						</div>
						
					</section>
                 
						
				<!-- Footer -->
					<footer id="footer">
						<ul class="copyright">
							<li>&copy; Franklin</li>
							<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
						</ul>
					</footer>

			</div>
			

		<!-- Scripts -->
			<!--[if lte IE 8]><script src="assets/js/respond.min.js"></script><![endif]-->
			<script>
				if ('addEventListener' in window) {
					window.addEventListener('load', function() { document.body.className = document.body.className.replace(/\bis-loading\b/, ''); });
					document.body.className += (navigator.userAgent.match(/(MSIE|rv:11\.0)/) ? ' is-ie' : '');
				}
			</script>
			

	</body>

</html>  
<!--  
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
							
							
						<hr />
					  
						<footer>
							<ul class="icons">
								<li><a href="" class="fa-twitter">Twitter</a></li>
								<li><a href="" class="fa-instagram">Instagram</a></li>
								<li><a href="" class="fa-facebook">Facebook</a></li>
							</ul>
						</footer>
					-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestao</title>
</head>
<style>
#pagina{
	width: 1080px;
	margin: 0 auto;
	background: #fffff;
	border-radius:10px;
	box-shadow: 0px 0px 10px #cccccc;
	position:relative;
}
body {
  font-family: Arial, Helvetica, sans-serif;
}

.navbar {
  overflow: hidden;
  background-color: #888;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: gray;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
</style>
<body>
		<h1 id="pagina"  align="center"><img align="left" height="60px"  src="img/Codevasf.jpg" title="link"></h1>
		
	
	<div id="pagina" >
		<div class ="navbar">
			<div class="dropdown">
			<Button class = "dropbtn">Planejamentos</Button>
			<div class="dropdown-content">
			<a href="planejamento.jsp" target="iframe_a" >Novo Plano</a>
			<a href="PlanejamentoServlet?opcao=Listar" target="iframe_a" >Relatório</a>
			</div>
		</div>
		<div class="dropdown">
			<Button class = "dropbtn">Licitacoes</Button>
			<div class="dropdown-content">
			<a href="planejamento.jsp" target="iframe_a" >Nova Licitacao</a>
			<a href="PlanejamentoServlet?opcao=Listar" target="iframe_a" >Relatório</a>
			</div>
		</div>
		<div class="dropdown">
			<Button class = "dropbtn">Registros</Button>
			<div class="dropdown-content">
			<a href="planejamento.jsp" target="iframe_a" >Nova Licitacao</a>
			<a href="PlanejamentoServlet?opcao=Listar" target="iframe_a" >Relatório</a>
			</div>
		</div>
		
	</div>
	  <div align="right">Hello, <%=session.getAttribute("matricula") %></div>
	<div id="pagina"class="dropdown">
	<iframe height="600px" width="100%" src="" name="iframe_a"></iframe>
	</div>


</body>
</html>
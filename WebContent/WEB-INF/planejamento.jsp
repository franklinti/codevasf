<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/">
<!--  <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">  -->
  <link rel="stylesheet" href="assets/css/licitacao.css" />
 <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Planejamento</title>

</head>

<body >
<div class="container">
  <div class="row">
      <div id="flip-container">
            <div id="flip-card">
                <div id="signin" class="face">
                    <form class="form-signin" role="form" method="post" action="Planejamento" target="iframe_b">
                        <div class="container" align="left"> 
                        <h3>Cadastro Planejamento<hr width="97%" align="left"> </h3>
                       </div>
                       <div style="margin-left:60%; margin-top: -50px; color: black; width: 60% "  >
                        <c:url  value="Planejamento?action=Menu" var="urlmenu"/>
                        <a  href="${urlmenu}">Menu</a>
                        <a style="margin-left: 8%;" href="#">Versao 1.0<c:out value="${mensagem}"/></a>
                       </div>
                  <br>
                        <div class="entry-group">
                       
                        <table border="0" align="left" >
                        
							<tr><td><label>Item:</label>&nbsp&nbsp&nbsp&nbsp</td>
								<td><input type="text" class="form-control" pattern="[1,2,3,4,5,6,7,8,9,0]{0,3}" name="item"  placeholder="Insira numero"/></td>						
							</tr>
							<tr><td><label>Sede:</label>&nbsp&nbsp&nbsp&nbsp&nbsp </td>
								<td>
								    <input type="text" class="form-control" list="sedes" name="sede" />
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
							<tr><td><label >Requisitante:</label></td>
								<td>
								    <input type="text" class="form-control" list="requisitantes" name="requisitante" />
									<datalist id="requisitantes">
										<option value="GRA">
										<option value="GRG">
										<option value="GRD">
										<option value="GRI">
										<option value="GRR">
									</datalist>
								</td>	
							</tr>
							<tr>
								<td><label>Descricao do objeto:</label></td>
								<td><input	type="text" class="form-control" name="descricaodoobjeto"  placeholder="Descreva o objeto" /></td>			
							</tr>
							<tr>
								<td><label>Quantidade estimada:</label></td>
								<td>
								<input	type="text" class="form-control" name="qtdestimada"  placeholder="Quantidade estimativa?"/>
								
								</td>			
							</tr>
							<tr>
								<td><label>Valor estimado:</label></td>
								<td>
								
								<input type="text"  class="form-control"	name="valorestimado"  placeholder="Qual o valor estimado?" />
								</td>			
							</tr>
							<tr>
								<td><label>data de Inicio:</label></td>
								<td><input type="date" class="form-control"  name="datainicio" placeholder="01/01/2020" /></td>
							</tr>
							<tr>
								<td><label>data Fim:</label></td>
								<td><input type="date" class="form-control" name="datafim" placeholder="01/01/2020" /></td>
							</tr>
							<tr>
								<td><label>Total de dias:</label></td>
								<td><input type="text" class="form-control"	name="totaldedias"  placeholder="Total de dias execucao?" /></td>			
							</tr>
							<tr>
								<td><label>Justificativa objetivo <br/>estrategico apoiador <br/> da aquisicao:</label></td>
								<td><input type="text" class="form-control" style="height: 50px" name="justificativaaquisicao" placeholder="Justificativa do objeto" /></td> 		
							</tr>
							<tr>
								<td><label>Programa acao<br/> suportado pela<br/>aquisicao:</label></td>
								<td><input type="text" class="form-control"	name="programasuportado"  placeholder="Nome do programa da acao?" /></td>			
							</tr>
							<tr>
								<td><label>Valor total:</label></td>
								<td>
								
								<input type="text" class="form-control"	name="valortotal"  placeholder="Valor total" /></td>			
							</tr>
							<!--  anexar arquivo
							<tr>
							<td><label>Anexar arquivo</label></td>
							<td><input type="file" id="arquivo" class="form-control"name="arquivo"  placeholder="Valor total" /></td>
							</tr>
							 -->
							    
							<tr>
							<td>
							<input  id="toSignup"class="btn" type="submit"  value="Consultar" > 
							</td>
								<td>
							    <input class="btn"  type="submit" name="action" value="Salvar" target="iframe_b">&nbsp
								<input class="btn" type="reset" value="Limpar">&nbsp
								</td>
							</tr>
						
							<!-- <tr><td> <a href="#" id="toRecover">Lost Password?</a></td></tr>	 -->
							</table>
							<table border="0" align="left">
							<tr>
							<td><iframe  class="frame" href=""  name="iframe_b"></iframe></td></tr>
							</table>
							
                        </div>
                    </form>
                </div>
                <div class="back face">
                    <div id="signup" class="hide">
	                        <form class="form-signin" role="form" method="post" action="Planejamento" target="iframe_c">
	                            <h3>Lista de Planos cadastrados</h3>
	                             <div style="margin-left: 80%; margin-top: -30px;" >
                                 <c:url  value="Planejamento?action=Menu" var="urlmenu"/>
                                 <a  href="${urlmenu}">Menu</a>
          
                                 </div>
	                            <hr>

	                            <div class="entry-group">
	                            
	                            <iframe  style="border: 0;" frameborder="0"   href="" name="iframe_c" height="530px" width="100%"></iframe>
	                        
	                            </div>
	                           <input style="margin-left: 8px; margin-left: 140px" class="btn" type="submit"  name="action" value="Carregar Lista" target="iframe_c">  
	                            </form>
	                            <div style="margin: -22px; margin-left: 20px" class="backToSignin" border="1">
	                            <a href="#" >Voltar Cadastro.</a>
	                            </div>
                      </div>
                       <!-- 
                      <div id="recover" class="hide">
                        <form class="form-signin" role="form">
                            <h3 class="form-signin-heading"> <h3><c:out value="${mensagem}"/></h3> <a href="#" id="flipToLogin">Back to Sign in</a></h3>
                            <div class="entry-group">
                               
								Inseri dado 
                            </div>
                        </form>
                        <a href="#" class="backToSignin">Back to login.</a>
                     </div>
                     -->    
                </div>
            </div>
        </div> <!-- /container -->
  </div>
</div>
<script type="text/javascript">
$(function(){
	  // Checking for CSS 3D transformation support
	    $.support.css3d = supportsCSS3D();
	  
	  var container = $('#flip-container');
	    $('#toRecover').on('click', function(e){
	        flipit($('#recover'), e);
	    });
	    $('#toSignup').on('click', function(e){
	        flipit($('#signup'), e);
	    });
	    $('.backToSignin').on('click', function(e){
	        flipit($(this).parent(), e);
	    });
	  
	  formContainer.find('form').submit(function(e){
	    // Preventing form submissions. If you implement
	    // a backend, you might want to remove this code
	    e.preventDefault();
	  });
	  function ctoggle(){
	        return container.toggleClass('flipped').delay(200);
	  }
	  function flipit(el, e){
	        $.when(ctoggle()).done(function(){
	            el.toggleClass('hide');
	            if(!$.support.css3d)
	              $('#signin').toggle();
	        });
	        e.preventDefault();
	  }
	  // A helper function that checks for the 
	  // support of the 3D CSS3 transformations.
	  function supportsCSS3D() {
	    var props = [
	      'perspectiveProperty', 'WebkitPerspective', 'MozPerspective'
	    ], testDom = document.createElement('a');
	      
	    for(var i=0; i<props.length; i++){
	      if(props[i] in testDom.style){
	        return true;
	      }
	    }
	    
	    return false;
	  }
	});


</script>	



<!-- 

				
			</table>
		</form>
	<div>
	
	</div>
	<div style="clear: both">&nbsp</div>
	<div id="rodape">
	<p align="center">&copy;2020 All rights Reserved &nbsp;&bull;&nbsp;CODEVASF</p>
	</div>
	-->	
</body>
</html>
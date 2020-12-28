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
<title>Licitacao</title>
</head>
<body >
<div class="container">
  <div class="row">
      <div id="flip-container">
            <div id="flip-card">
                <div id="signin" class="face">
                    <form class="form-signin" role="form" method="post" action="Licitacao" target="iframe_b">
                        <div class="container" align="left"> 
                        <h3>Cadastro Licitacao <hr width="97%" align="left"></h3>
                     
                        </div>
                       <div style="margin-left:60%; margin-top: -50px; color: black; width: 60% " >
                       <c:url  value="Licitacao?action=Menu" var="urlmenu"/>
                             <a  href="${urlmenu}">Menu</a>
                        <a  style="margin-left:8%; "href="#">Versao 1.0<c:out value="${mensagem}"/></a>
                       
                       </div>
                       <br>
                        <div class="entry-group">
                       
                        <table border="0" align="left" >
                        
							<tr><td><label>Item:</label>&nbsp&nbsp&nbsp&nbsp</td>
								<td><input type="text"  pattern="[1,2,3,4,5,6,7,8,9,0]{0,3}" name="item"  placeholder="Insira numero"/></td>						
							</tr>
							<tr><td><label>Sede:</label>&nbsp&nbsp&nbsp&nbsp&nbsp </td>
								<td>
								    <input type="text" list="sedes" name="sede" />
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
							<tr><td><label >Area:</label></td>
								<td>
								    <input type="text"  list="areas" name="area" />
									<datalist id="areas">
										<option value="AA">
										<option value="AE">
										<option value="AD">
										<option value="AI">
										<option value="AR">
									</datalist>
								</td>	
							</tr>
							<tr>
								<td><label>Unidade:</label></td>
								<td><input	type="text"  name="unidade"  placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Estado:</label></td>
								<td>
								<input	type="text"  list="estados" name="estado"  placeholder=""/>
								<datalist id="estados">
										<option value="AC"/>
										<option value="AL">
										<option value="AM">
										<option value="AP">
										<option value="BA">
										<option value="CE">
										<option value="DF">
										<option value="ES">
										<option value="GO">
										<option value="MA">
										<option value="MG">
										<option value="MS">
										<option value="MT">
										<option value="PA">
										<option value="PB">
										<option value="PE">
										<option value="PI">
										<option value="PR">
										<option value="RJ">
										<option value="RN">
										<option value="RO">
										<option value="RR">
										<option value="RS">
										<option value="SC">
										<option value="SE">
										<option value="SP">
										<option value="TO">
									</datalist>
								</td>			
							</tr>
							<tr>
								<td><label>Processo SRD:</label></td>
								<td>
								<input type="text"  name="processosrd"  placeholder="" />
								</td>			
							</tr>
							<tr>
								<td><label>Nome Analista:</label></td>
								<td>
								<input type="text"  list="nomeanalistas" name="nomeanalista" placeholder="" />
								<datalist id="nomeanalistas">
										<option value="Daniel">
										<option value="Robson">
										<option value="Luciana">
										<option value="Edite">
									</datalist>
								</td>
							</tr>
							<tr>
								<td><label>Modalidade:</label></td>
								<td>
								<input type="text"  list="modalidades" name="modalidade" placeholder="" />
								<datalist id="modalidades">
										<option value="Licitacao Eletronica">
										<option value="SRP">
										<option value="RDC">
									</datalist>
								</td>
							</tr>
							<tr>
								<td><label>Objeto:</label></td>
								<td><input type="text" 	name="objeto"  placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Tipo:</label></td>
								<td><input type="text"  name="tipo" placeholder="" /></td> 		
							</tr>
							<tr>
								<td><label>Autorizacao:</label></td>
								<td><input type="text" 	name="autorizacao"  placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Valor Estimado Maximo Codevasf:</label></td>
								<td>
								<input type="text" 	name="valorestimadomaxcvasf"  placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Valor Adjudicacao:</label></td>
								<td><input type="text" 	name="valoradjudicado"  placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Emenda Parlamentar:</label></td>
								<td>
								<input type="text"  list="emendas" name="emendaparlamentar"  placeholder="" />
								<datalist id="emendas">
										<option value="SIM">
										<option value="NAO">
									</datalist>
								</td>			
							</tr>
							<tr>
								<td><label>Prazo de Execucao:</label></td>
								<td><input type="text" 	name="prazodeexecucao"  placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Data Sessao:</label></td>
								<td><input type="Date" 	name="datasessao"  placeholder="01/01/2020" /></td>			
							</tr>
							<tr>
								<td><label>Situacao:</label></td>
								<td><input type="text"	name="situacao"  placeholder="" /></td>			
							</tr>
							<tr>
								<td><label>Valor Total:</label></td>
								<td><input type="text" 	name="valortotal"  placeholder="" /><br></td>			
							</tr>
							<!--  anexar arquivo
							<tr>
							
							<td><label>Anexar arquivo</label></td>
							<td><input type="file" id="arquivo" class="form-control"name="arquivo"  placeholder="Valor total" /></td>
							</tr>
							 -->
							   
							<tr>
							<td>
                             <input  id="toSignup"class="btn" type="submit"  value="Consultar"> 
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
							<td><iframe class="frame"  href=""  name="iframe_b" ></iframe></td></tr>
							</table>
							
                        </div>
                    </form>
                </div>
                <div class="back face">
                    <div id="signup" class="hide">
	                        <form class="form-signin" role="form" method="post" action="Licitacao" target="iframe_c">
	                            <h3>Lista de Licitacoes cadastrados</h3>
	                             <div style="margin-left: 80%; margin-top: -30px;" >
                                 <c:url  value="Licitacao?action=Menu" var="urlmenu"/>
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
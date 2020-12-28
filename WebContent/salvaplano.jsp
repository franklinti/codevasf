<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
   <link rel="stylesheet" href="assets/css/msnlicitacao.css" />
<title>Mensagem Cadastro</title>


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
							<hr>
								<h3 style="color: blue;"><c:out value="${salvo}"/></h3>
							<hr>
					    
                    </div>
                    </form>
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
</body>
</html>
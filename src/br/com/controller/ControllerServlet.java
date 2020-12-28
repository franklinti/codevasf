package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.business.ILogin;
import br.com.model.Login_;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {


	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String para = request.getParameter("login");
		String nomeClasse = "br.com.model.login."+ para;
		
		try {
			Class classe = Class.forName(nomeClasse);
			ILogin lo = (ILogin) classe.newInstance();
			lo.executa(request, response);
			
		} catch (Exception e) {
			throw new ServletException("Excecao",e);
		}
		
	}


}

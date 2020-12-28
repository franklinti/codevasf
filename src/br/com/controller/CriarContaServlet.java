package br.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.dao.LoginDao;
import br.com.model.Login;
import br.com.controller.PlanejamentoServlet;

@WebServlet("/CriarConta")
public class CriarContaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private Login login = new Login();
	private LoginDao dao = new LoginDao();
	 String action;
     String mensagem="";
     String mmat ="";
	 String msenha="";
    public CriarContaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		    action = request.getParameter("action");
			response.setContentType("text/html;charset=ISO-8859-1");
			try{
				if(action.equalsIgnoreCase("CriarConta")){
				RequestDispatcher form = request.getRequestDispatcher("/criarconta.jsp");
				form.forward(request,response);
				}
				if(action.equalsIgnoreCase("Cadastrar")){
				
				login.setMatricula(request.getParameter("matricula"));
				login.setSenha(request.getParameter("senha"));
				
				System.out.println(login.toString());
				
				if(login.getMatricula().toString().equals("")|| login.getSenha().toString().equals("")){
					mensagem="Favor,preencher campos!";
					mmat ="Matricula: ";
					msenha="Senha: ";
					request.setAttribute("mensagem", mensagem);
					request.setAttribute("mmat",mmat);
					request.setAttribute("msenha",msenha);
					request.setAttribute("matricula",login.getMatricula());
				    request.setAttribute("senha",login.getSenha());
				  
				    RequestDispatcher ln = request.getRequestDispatcher("/criarconta.jsp");
					ln.forward(request,response);
				}else if(login.getMatricula().toString().equals("null") || login.getSenha().toString().equals("null")){
					mensagem="Usuario e senha nao corresponde!";
					mmat ="Matricula: ";
					msenha="Senha: ";
					request.setAttribute("mensagem", mensagem);
					request.setAttribute("mmat",mmat);
					request.setAttribute("msenha",msenha);
					request.setAttribute("matricula",login.getMatricula());
				    request.setAttribute("senha",login.getSenha());
				    RequestDispatcher lnb = request.getRequestDispatcher("/criarconta.jsp");
					lnb.forward(request,response);
				}else{
					if(dao.existe(login)&& PlanejamentoServlet.licenseplano > 0){
						HttpSession session = request.getSession();
						session.setAttribute("mat", login.getMatricula());
						 RequestDispatcher lo  = request.getRequestDispatcher("/WEB-INF/menus.jsp");
						 lo.forward(request,response);	
					}else{
						mensagem="Usuario e senha nao corresponde!";
						mmat ="Matricula: ";
						msenha="Senha: ";
						request.setAttribute("mensagem", mensagem);
						request.setAttribute("mmat",mmat);
						request.setAttribute("msenha",msenha);
						request.setAttribute("matricula",login.getMatricula());
					    request.setAttribute("senha",login.getSenha());
					    RequestDispatcher le = request.getRequestDispatcher("/criarconta.jsp");
						le.forward(request,response);	
					}
				}
				}
				
			}catch(Exception e){
				mensagem="Verifique conexao com banco de dados!";
				request.setAttribute("mensagem", mensagem);
				RequestDispatcher ex = request.getRequestDispatcher("/errologin.jsp");
				ex.forward(request,response);
				
			}
			
	}
    
}


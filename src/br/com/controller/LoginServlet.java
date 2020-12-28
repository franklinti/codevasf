package br.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.dao.LoginDao;
import br.com.model.Login;
import br.com.business.ILogin;
import br.com.controller.PlanejamentoServlet;

@WebServlet("/Login")
public class LoginServlet implements ILogin {
	private static final long serialVersionUID = 1L;
	private int cont = 0;
	private Login login = new Login();
	private LoginDao dao = new LoginDao();
	 String action;
     String mensagem="";
     String mmat ="";
	 String msenha="";
	 String conta="";
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		// TODO Auto-generated method stub
		    int c = cont++;
		    System.out.println(cont);
		    action = request.getParameter("action");
			response.setContentType("text/html;charset=ISO-8859-1");
			try{
				
				if(action.equalsIgnoreCase("Entrar")){
				login.setMatricula(request.getParameter("matricula"));
				login.setSenha(request.getParameter("senha"));
				//System.out.println(login.toString() +""+ c);
				
				if(login.getMatricula().toString().equals("")|| login.getSenha().toString().equals("")){
					mensagem="Favor,preencher campos!";
					mmat ="Matricula: ";
					msenha="Senha: ";
					conta="Contador: ";
					request.setAttribute("mensagem", mensagem);
					request.setAttribute("mmat",mmat);
					request.setAttribute("msenha",msenha);
					request.setAttribute("matricula",login.getMatricula());
				    request.setAttribute("senha",login.getSenha());
				    request.setAttribute("conta", c);
				    RequestDispatcher ln = request.getRequestDispatcher("/index.jsp");
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
				    RequestDispatcher lnb = request.getRequestDispatcher("/index.jsp");
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
					    RequestDispatcher le = request.getRequestDispatcher("/index.jsp");
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
			*/
	}
	@Override
	public void inserir(Login login) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualiza(Login login) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Login login) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Login> lista() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean existe(Login login) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Login consulta(Login login) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("Exe logica");
		RequestDispatcher rd = req.getRequestDispatcher("/logica.jsp");
		rd.forward(req, res);
		
	}
    
}


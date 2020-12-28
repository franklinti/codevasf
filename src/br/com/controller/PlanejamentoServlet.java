package br.com.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.PlanejamentoDao;
import br.com.model.Planejamento;

@WebServlet("/Planejamento")
public class PlanejamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Planejamento plano;
    private  PlanejamentoDao dao;
    private  List<Planejamento> lista;
    String action;
	String mensagem = "";
	boolean verificaform;
	static int licenseplano = 100;
	int contplanos = 0;
	int result=0;
	public PlanejamentoServlet() {super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		action = request.getParameter("action");
		 System.out.println("Action button: " + action.toString());
		try{
			    switch(action){
			    case "Novo Plano":
			    	novoPlano(request,response);
			    	break;
			    case "Listar":
			    	listarplano(request,response);
			    	break;
			    case "Carregar Lista":
			    	carregarlistaframe(request,response);
			    	break;
			    case "Salvar":
			    	salvarplano(request,response);
			    	break;
			    case "Excluir":
					 excluirplano(request,response);
					  break;
			    case "Excluirframe":
					 excluirplanoframe(request,response);
					  break;
			    case "Editar":
			    	editarplano(request,response);
			    	break;
			    case "Editarframe":
			    	editarplanoframe(request,response);
			    	break;
			    case "Atualizar":
				      atualizarplano(request,response);
				      break; 
			    case "Atualizarframe":
				      atualizarplanoframe(request,response);
				      break;    
			    case "Menu":
			    	menu(request,response);
			    	break;
			    	default:
			    	//	listplano(request,response);
			    	break;
			    }
			   }catch(Exception e){
				   e.getMessage();
			   }
		
	}
	private void carregarlistaframe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		lista = new ArrayList<>();
		dao = new PlanejamentoDao();
		lista = dao.listar();
		request.setAttribute("listaPlano", lista);
		RequestDispatcher cp = request.getRequestDispatcher("/planejamentolistaframe.jsp");
	    cp.forward(request, response);
		
	}
	private void menu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher me = request.getRequestDispatcher("/WEB-INF/menus.jsp");
	    me.forward(request, response);	
	}
	protected void novoPlano(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
	   
		while(contplanos <= licenseplano){
			licenseplano = licenseplano -1;
			result = licenseplano;
			break;
		}
		if(licenseplano < 0){
			contplanos=0;
			mensagem="Favor, adicionar nova licenca!";
			String total = "Total licencas: " + contplanos;
			String a ="Contato: 8587726727- Franklin";
    		request.setAttribute("licencaplano", mensagem);
    		request.setAttribute("qtdplano", total);
    		request.setAttribute("contatoplano", a);
    		RequestDispatcher pns = request.getRequestDispatcher("/WEB-INF/menus.jsp");
    		pns.forward(request, response);
		}else
		{
		
		System.out.println("License Plano- Total: "+result);
		RequestDispatcher np = request.getRequestDispatcher("/WEB-INF/planejamento.jsp");
	    np.forward(request, response);
	    
		}
	}
	protected void listarplano(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{ 
		lista = new ArrayList<>();
		dao = new PlanejamentoDao();
		lista = dao.listar();
		request.setAttribute("listaPlano", lista);
		RequestDispatcher lp = request.getRequestDispatcher("/planejamentolista.jsp");
	    lp.forward(request, response);
	}
	protected void salvarplano(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
	    plano = new Planejamento();
	    dao = new PlanejamentoDao();
		try{
		plano.setItem(request.getParameter("item"));
		plano.setSede(request.getParameter("sede"));
		plano.setRequisitante(request.getParameter("requisitante"));
		plano.setDescricaodoobjeto(request.getParameter("descricaodoobjeto"));
		plano.setQuantidadeestimada(request.getParameter("qtdestimada"));
		plano.setValorestimado(request.getParameter("valorestimado"));
		Calendar ci = null;
		plano.setDatainicio(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datainicio").toString()));
		ci = Calendar.getInstance();
		ci.setTime(plano.getDatainicio());
		Calendar cf = null;
		plano.setDatafim(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datafim").toString()));
		cf = Calendar.getInstance();
		cf.setTime(plano.getDatafim());
		plano.setTotaldedias(request.getParameter("totaldedias"));
		plano.setJustificativaaquisicao(request.getParameter("justificativaaquisicao"));
		plano.setProgramasuportado(request.getParameter("programasuportado"));
		plano.setValortotal(request.getParameter("valortotal"));
		verificaform= true;
		}catch(ParseException e){
    		verificaform= true;
		}
		System.out.println(verificaform);
		if(verificaform)
		{
			for(int i=0; i < plano.toString().length(); i++)
			{
				if(plano.getItem().toString().equals("")|| plano.getSede().toString().equals("") || plano.getRequisitante().toString().equals("")
						|| plano.getDescricaodoobjeto().toString().equals("") || plano.getQuantidadeestimada().toString().equals("")
						|| plano.getValorestimado().toString().equals("") || plano.getDatainicio().toString().equals("") || plano.getDatafim().toString().equals("")
						|| plano.getTotaldedias().toString().equals("") || plano.getJustificativaaquisicao().toString().equals("")
						|| plano.getProgramasuportado().toString().equals("") || plano.getValortotal().toString().equals(""))
				{
					
					mensagem="Preencher o formulario!";
		    		request.setAttribute("mensagem", mensagem);
		    		request.setAttribute("it",plano.getItem());
		    		request.setAttribute("se",plano.getSede());
		    		request.setAttribute("re",plano.getRequisitante());
		    		request.setAttribute("de",plano.getDescricaodoobjeto());
		    		request.setAttribute("qt",plano.getQuantidadeestimada());
		    		request.setAttribute("ve",plano.getValorestimado());
		    		request.setAttribute("di",plano.getDatainicio());
		    		request.setAttribute("df",plano.getDatafim());
		    		request.setAttribute("td",plano.getTotaldedias());
		    		request.setAttribute("ju",plano.getJustificativaaquisicao());
		    		request.setAttribute("pr",plano.getProgramasuportado());
		    		request.setAttribute("vt",plano.getValortotal());
		    		RequestDispatcher pnsf = request.getRequestDispatcher("/inserirplano.jsp");
		    		pnsf.forward(request, response);
				}else if(plano.getItem().toString().equals("null")|| plano.getSede().toString().equals("null") || plano.getRequisitante().toString().equals("null")
						|| plano.getDescricaodoobjeto().toString().equals("null") || plano.getQuantidadeestimada().toString().equals("null")
						|| plano.getValorestimado().toString().equals("null") || plano.getDatainicio().toString().equals("null") || plano.getDatafim().toString().equals("null")
						|| plano.getTotaldedias().toString().equals("null") ||plano.getJustificativaaquisicao().toString().equals("null")
						|| plano.getProgramasuportado().toString().equals("null") || plano.getValortotal().toString().equals("null"))
				{	
					System.out.println(plano.getItem());
					mensagem="Preencher com campos validos!";
		    		request.setAttribute("mensagem", mensagem);
		    		request.setAttribute("it",plano.getItem());
		    		request.setAttribute("se",plano.getSede());
		    		request.setAttribute("re",plano.getRequisitante());
		    		request.setAttribute("de",plano.getDescricaodoobjeto());
		    		request.setAttribute("qt",plano.getQuantidadeestimada());
		    		request.setAttribute("ve",plano.getValorestimado());
		    		request.setAttribute("di",plano.getDatainicio());
		    		request.setAttribute("df",plano.getDatafim());
		    		request.setAttribute("td",plano.getTotaldedias());
		    		request.setAttribute("ju",plano.getJustificativaaquisicao());
		    		request.setAttribute("pr",plano.getProgramasuportado());
		    		request.setAttribute("vt",plano.getValortotal());
		    		RequestDispatcher pnsv = request.getRequestDispatcher("/inserirplano.jsp");
		    		pnsv.forward(request, response);
				
			    }else if(plano.getItem().toString().equals(null)|| plano.getSede().toString().equals(null) || plano.getRequisitante().toString().equals(null)
						|| plano.getDescricaodoobjeto().toString().equals(null) || plano.getQuantidadeestimada().toString().equals(null)
						|| plano.getValorestimado().toString().equals(null) || plano.getDatainicio().toString().equals(null) || plano.getDatafim().toString().equals(null)
						|| plano.getTotaldedias().toString().equals(null) ||plano.getJustificativaaquisicao().toString().equals(null)
						|| plano.getProgramasuportado().toString().equals(null) || plano.getValortotal().toString().equals(null))
				{	
			    	mensagem="Preencher com campos validos!";
		    		request.setAttribute("mensagem", mensagem);
		    		request.setAttribute("it",plano.getItem());
		    		request.setAttribute("se",plano.getSede());
		    		request.setAttribute("re",plano.getRequisitante());
		    		request.setAttribute("de",plano.getDescricaodoobjeto());
		    		request.setAttribute("qt",plano.getQuantidadeestimada());
		    		request.setAttribute("ve",plano.getValorestimado());
		    		request.setAttribute("di",plano.getDatainicio());
		    		request.setAttribute("df",plano.getDatafim());
		    		request.setAttribute("td",plano.getTotaldedias());
		    		request.setAttribute("ju",plano.getJustificativaaquisicao());
		    		request.setAttribute("pr",plano.getProgramasuportado());
		    		request.setAttribute("vt",plano.getValortotal());
		    		RequestDispatcher pnsc = request.getRequestDispatcher("/inserirplano.jsp");
		    		pnsc.forward(request, response);
			    }	
		}		
	   }
		   verificaform=false;
		System.out.println("Action verifica: "+verificaform);
		
		 if(verificaform == false){
			
			if(dao.existe(plano))
			{
				mensagem="Plano "+" N:"+plano.getItem()+" existente!";
				String info="Altere numero campo Item. ";
				request.setAttribute("msn", mensagem);
				request.setAttribute("info", info);
				RequestDispatcher ed = request.getRequestDispatcher("/existeplano.jsp");
				ed.forward(request, response);
				System.out.println("Action retorno servletexiste: "+plano.getItem());
			}else{
			     dao.salvar(plano);
				 mensagem="Plano "+" N:"+plano.getItem()+" salvo com sucesso!";
				 request.setAttribute("salvo", mensagem);
				 RequestDispatcher scs = request.getRequestDispatcher("/salvaplano.jsp");
			     scs.forward(request, response);
	
				 System.out.println("Action salvar plano: "+plano.getItem());
			}
		}
	}
		
	private void excluirplano(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		plano = new Planejamento();
		dao = new PlanejamentoDao();
		plano.setId(Integer.parseInt(request.getParameter("id"))); 
		dao.delete(plano);
		listarplano(request, response);
		
	}
	private void excluirplanoframe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		plano = new Planejamento();
		dao = new PlanejamentoDao();
		plano.setId(Integer.parseInt(request.getParameter("id"))); 
		dao.delete(plano);
		carregarlistaframe(request, response);
	}
	
	//NAO MEXER MAIS DAQUI PRA CIMA!!!!!!!!!!!!10-04-2020
	private void editarplano(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		plano = new Planejamento();
		dao = new PlanejamentoDao();
		plano.setId(Integer.parseInt(request.getParameter("id")));
    	List<Planejamento> consulta = new ArrayList<>();
        consulta = dao.consultar(plano);
    	System.out.println(consulta.toString());
    	mensagem="Atualizando planejamento";
    	request.setAttribute("listaConsulta", consulta);
    	request.setAttribute("atualiza", mensagem);
    	RequestDispatcher ed = request.getRequestDispatcher("/WEB-INF/planejamentoatualiza.jsp");
    	ed.forward(request, response);
		
	}
	private void editarplanoframe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		plano = new Planejamento();
		dao = new PlanejamentoDao();
		plano.setId(Integer.parseInt(request.getParameter("id")));
    	List<Planejamento> consulta = new ArrayList<>();
        consulta = dao.consultar(plano);
    	System.out.println(consulta.toString());
    	mensagem="Atualiza dados do planejamento";
    	request.setAttribute("listaConsulta", consulta);
    	request.setAttribute("atualiza", mensagem);
    	RequestDispatcher ed = request.getRequestDispatcher("/WEB-INF/planejamentoatualizaframe.jsp");
    	ed.forward(request, response);
		
	}
    private void atualizarplano(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//plano = new Planejamento();
    	//dao = new PlanejamentoDao();
    	try{
    	plano.setItem(request.getParameter("item"));
    	plano.setSede(request.getParameter("sede"));
		plano.setRequisitante(request.getParameter("requisitante"));
		plano.setDescricaodoobjeto(request.getParameter("descricaodoobjeto"));
		plano.setQuantidadeestimada(request.getParameter("quantidadeestimada"));
		plano.setValorestimado(request.getParameter("valorestimado"));
		Calendar ci = null;
		plano.setDatainicio(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datainicio")));
		ci = Calendar.getInstance();
		ci.setTime(plano.getDatainicio());
		Calendar cf = null;
		plano.setDatafim(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datafim")));
		cf = Calendar.getInstance();
		cf.setTime(plano.getDatafim());
		plano.setTotaldedias(request.getParameter("totaldedias"));
		plano.setJustificativaaquisicao(request.getParameter("justificativaaquisicao"));
		plano.setProgramasuportado(request.getParameter("programasuportado"));
		plano.setValortotal(request.getParameter("valortotal"));
		
    	}catch(ParseException e){
    		//mensagem="Preencher o formulario!";
    		//request.setAttribute("mensagem", mensagem);
    		e.getMessage();
    	}
		//System.out.println(plano.toString());
		if(dao.atualizar(plano)){
		listarplano(request, response);
		}else{
			System.out.println("Erro");
		}
	}	
    private void atualizarplanoframe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//plano = new Planejamento();
    	//dao = new PlanejamentoDao();
    	try{
    	plano.setItem(request.getParameter("item"));
    	plano.setSede(request.getParameter("sede"));
		plano.setRequisitante(request.getParameter("requisitante"));
		plano.setDescricaodoobjeto(request.getParameter("descricaodoobjeto"));
		plano.setQuantidadeestimada(request.getParameter("quantidadeestimada"));
		plano.setValorestimado(request.getParameter("valorestimado"));
		Calendar ci = null;
		plano.setDatainicio(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datainicio")));
		ci = Calendar.getInstance();
		ci.setTime(plano.getDatainicio());
		Calendar cf = null;
		plano.setDatafim(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datafim")));
		cf = Calendar.getInstance();
		cf.setTime(plano.getDatafim());
		plano.setTotaldedias(request.getParameter("totaldedias"));
		plano.setJustificativaaquisicao(request.getParameter("justificativaaquisicao"));
		plano.setProgramasuportado(request.getParameter("programasuportado"));
		plano.setValortotal(request.getParameter("valortotal"));
		
    	}catch(ParseException e){
    		//mensagem="Preencher o formulario!";
    		//request.setAttribute("mensagem", mensagem);
    		e.getMessage();
    	}
		//System.out.println(plano.toString());
		if(dao.atualizar(plano)){
		carregarlistaframe(request, response);
		}else{
			System.out.println("Erro");
		}
	}	
}




/*
	private void editarplano(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		plano.setId(Integer.parseInt(request.getParameter("id"))); 
		Planejamento existeplano = dao.consulta(plano);
		RequestDispatcher di = request.getRequestDispatcher("planejamento.jsp");
		request.setAttribute("id", existeplano);
		di.forward(request, response);
		
	}
	
	
	
	*/

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

import br.com.dao.LicitacaoDao;
import br.com.model.Licitacao;

@WebServlet("/Licitacao")
public class LicitacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Licitacao licitacao;
    private LicitacaoDao dao;
    private  List<Licitacao> lista;
    String action;
	String mensagem = "";
	boolean verificaform;
	static int licenselicitacao = 100;
	int contlicitacao = 0;
	int result=0;
	public LicitacaoServlet() {super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		action = request.getParameter("action");
		 System.out.println("Action button: " + action.toString());
		try{
			    switch(action){
			    case "Nova Licitacao":
			    	novoLicitacao(request,response);
			    	break;
			    case "Listar":
			    	listarlicitacao(request,response);
			    	break;
			    case "Carregar Lista":
			    	carregarlistaframe(request,response);
			    	break;
			    case "Salvar":
			    	salvarlicitacao(request,response);
			    	break;
			    case "Excluir":
					 excluirlicitacao(request,response);
					  break;
			    case "Excluirframe":
					 excluirlicitacaoframe(request,response);
					  break;
			    case "Editar":
			    	editarlicitacao(request,response);
			    	break;
			    case "Editarframe":
			    	editarlicitacaoframe(request,response);
			    	break;
			    case "Atualizar":
				      atualizarlicitacao(request,response);
				      break; 
			    case "Atualizarframe":
				      atualizarlicitacaoframe(request,response);
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
		dao = new LicitacaoDao();
		lista = dao.listar();
		request.setAttribute("listaLicitacao", lista);
		RequestDispatcher cp = request.getRequestDispatcher("/licitacaolistaframe.jsp");
	    cp.forward(request, response);
		
	}
	private void menu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher me = request.getRequestDispatcher("/WEB-INF/menus.jsp");
	    me.forward(request, response);	
	}
	protected void novoLicitacao(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
	   
		while(contlicitacao <= licenselicitacao){
			licenselicitacao = licenselicitacao -1;
			result = licenselicitacao;
			break;
		}
		if(licenselicitacao < 0){
			contlicitacao=0;
			mensagem="Favor, adicionar nova licenca!";
			String total = "Total licencas: " + contlicitacao;
			String a ="Contato: 8587726727- Franklin";
    		request.setAttribute("licencalicitacao", mensagem);
    		request.setAttribute("qtdlicitacao", total);
    		request.setAttribute("contatolicitacao", a);
    		RequestDispatcher pns = request.getRequestDispatcher("/WEB-INF/menus.jsp");
    		pns.forward(request, response);
		}else
		{
		
		System.out.println("License Licitacao - Total: "+result);
		RequestDispatcher np = request.getRequestDispatcher("/WEB-INF/licitacao.jsp");
	    np.forward(request, response);
	    
		}
	}
	protected void listarlicitacao(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{ 
		lista = new ArrayList<>();
		dao = new LicitacaoDao();
		lista = dao.listar();
		request.setAttribute("listaLicitacao", lista);
		RequestDispatcher lp = request.getRequestDispatcher("/licitacaolista.jsp");
	    lp.forward(request, response);
	}
	protected void salvarlicitacao(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
	    licitacao = new Licitacao();
	    dao = new LicitacaoDao();
		try{
		licitacao.setItem(request.getParameter("item"));
		licitacao.setSede(request.getParameter("sede"));
		licitacao.setArea(request.getParameter("area"));
		licitacao.setUnidade(request.getParameter("unidade"));
		licitacao.setEstado(request.getParameter("estado"));
		licitacao.setProcessosrd(request.getParameter("processosrd"));
		licitacao.setNomeanalista(request.getParameter("nomeanalista"));
		licitacao.setModalidade(request.getParameter("modalidade"));
		licitacao.setObjeto(request.getParameter("objeto"));
		licitacao.setTipo(request.getParameter("tipo"));
		licitacao.setAutorizacao(request.getParameter("autorizacao"));
		licitacao.setValorestimadomaxcvasf(request.getParameter("valorestimadomaxcvasf"));
		licitacao.setValoradjudicado(request.getParameter("valoradjudicado"));
		licitacao.setEmendaparlamentar(request.getParameter("emendaparlamentar"));
		licitacao.setPrazodeexecucao(request.getParameter("prazodeexecucao"));
		Calendar ds = null;
		licitacao.setDatasessao(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datasessao").toString()));
		ds = Calendar.getInstance();
		ds.setTime(licitacao.getDatasessao());
		licitacao.setSituacao(request.getParameter("situacao"));
		licitacao.setValortotal(request.getParameter("valortotal"));

		verificaform= true;
		}catch(Exception e){
    		verificaform= true;
		}

		System.out.println(verificaform);
		if(verificaform)
		{
			for(int i=0; i < licitacao.toString().length(); i++)
			{
				if(licitacao.getItem().toString().equals("") || licitacao.getSede().toString().equals("") || licitacao.getArea().toString().equals("")
						|| licitacao.getUnidade().toString().equals("") || licitacao.getEstado().toString().equals("")|| licitacao.getProcessosrd().toString().equals("") 
						|| licitacao.getNomeanalista().toString().equals("") || licitacao.getModalidade().toString().equals("")
						|| licitacao.getObjeto().toString().equals("") || licitacao.getTipo().toString().equals("")
						|| licitacao.getAutorizacao().toString().equals("") || licitacao.getValorestimadomaxcvasf().toString().equals("")
					    || licitacao.getValoradjudicado().toString().equals("") || licitacao.getEmendaparlamentar().toString().equals("")
					    || licitacao.getPrazodeexecucao().toString().equals("") || licitacao.getDatasessao().toString().equals("")
					    || licitacao.getSituacao().toString().equals("") || licitacao.getValortotal().toString().equals(""))
				{
					
					mensagem="Preencher o formulario!";
		    		request.setAttribute("mensagem", mensagem);
		    		mensagem(request, response);
		    		RequestDispatcher pnsf = request.getRequestDispatcher("/inserirlicitacao.jsp");
		    		pnsf.forward(request, response);
				}else if(licitacao.getItem().toString().equals("null") || licitacao.getSede().toString().equals("null") || licitacao.getArea().toString().equals("null")
						|| licitacao.getUnidade().toString().equals("null") || licitacao.getEstado().toString().equals("null")|| licitacao.getProcessosrd().toString().equals("null") 
						|| licitacao.getNomeanalista().toString().equals("null") || licitacao.getModalidade().toString().equals("null")
						|| licitacao.getObjeto().toString().equals("null") || licitacao.getTipo().toString().equals("null")
						|| licitacao.getAutorizacao().toString().equals("null") || licitacao.getValorestimadomaxcvasf().toString().equals("null")
					    || licitacao.getValoradjudicado().toString().equals("null") || licitacao.getEmendaparlamentar().toString().equals("null")
					    || licitacao.getPrazodeexecucao().toString().equals("null") || licitacao.getDatasessao().toString().equals("null")
					    || licitacao.getSituacao().toString().equals("null") || licitacao.getValortotal().toString().equals("null"))
				{	
					System.out.println(licitacao.getItem());
					mensagem="Preencher com campos validos!";
		    		request.setAttribute("mensagem", mensagem);
		    		mensagem(request, response);
		    		RequestDispatcher pnsv = request.getRequestDispatcher("/inserirlicitacao.jsp");
		    		pnsv.forward(request, response);
				
			    }else if(licitacao.getItem().toString().equals(null) || licitacao.getSede().toString().equals(null) || licitacao.getArea().toString().equals(null)
						|| licitacao.getUnidade().toString().equals(null) || licitacao.getEstado().toString().equals(null)|| licitacao.getProcessosrd().toString().equals(null) 
						|| licitacao.getNomeanalista().toString().equals(null) || licitacao.getModalidade().toString().equals(null)
						|| licitacao.getObjeto().toString().equals(null) || licitacao.getTipo().toString().equals(null)
						|| licitacao.getAutorizacao().toString().equals(null) || licitacao.getValorestimadomaxcvasf().toString().equals(null)
					    || licitacao.getValoradjudicado().toString().equals(null) || licitacao.getEmendaparlamentar().toString().equals(null)
					    || licitacao.getPrazodeexecucao().toString().equals(null) || licitacao.getDatasessao().toString().equals(null)
					    || licitacao.getSituacao().toString().equals(null) || licitacao.getValortotal().toString().equals(null))
				{	
			    	mensagem="Preencher com campos validos!";
		    		request.setAttribute("mensagem", mensagem);
		    	    mensagem(request, response);
		    		RequestDispatcher pnsc = request.getRequestDispatcher("/inserirlicitacao.jsp");
		    		pnsc.forward(request, response);
			    }	
		}		
	   }
		   verificaform=false;
		System.out.println("Action verifica: "+verificaform);
		
		 if(verificaform == false){
			
			if(dao.existe(licitacao))
			{
				mensagem="Licitacao "+" N:"+licitacao.getItem()+" existente!";
				String info="Altere numero campo Item. ";
				request.setAttribute("msn", mensagem);
				request.setAttribute("info", info);
				RequestDispatcher ed = request.getRequestDispatcher("/existelicitacao.jsp");
				ed.forward(request, response);
				System.out.println("Action retorno servletexiste: "+licitacao.getItem());
			}else{
			     dao.salvar(licitacao);
				 mensagem="Licitacao "+" N:"+licitacao.getItem()+" salvo com sucesso!";
				 request.setAttribute("salvo", mensagem);
				 RequestDispatcher scs = request.getRequestDispatcher("/salvalicitacao.jsp");
			     scs.forward(request, response);
	
				 System.out.println("Action salvar plano: "+licitacao.getItem());
			}
		}
		
	}
	public void mensagem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("it",licitacao.getItem());
		request.setAttribute("se",licitacao.getSede());
		request.setAttribute("ar",licitacao.getArea());
		request.setAttribute("un",licitacao.getUnidade());
		request.setAttribute("es",licitacao.getEstado());
		request.setAttribute("pr",licitacao.getProcessosrd());
		request.setAttribute("na",licitacao.getNomeanalista());
		request.setAttribute("mo",licitacao.getModalidade());
		request.setAttribute("ob",licitacao.getObjeto());
		request.setAttribute("ti",licitacao.getTipo());
		request.setAttribute("au",licitacao.getAutorizacao());
		request.setAttribute("ve",licitacao.getValorestimadomaxcvasf());
		request.setAttribute("va",licitacao.getValoradjudicado());
		request.setAttribute("em",licitacao.getEmendaparlamentar());
		request.setAttribute("pe",licitacao.getPrazodeexecucao());
		request.setAttribute("ds",licitacao.getDatasessao());
		request.setAttribute("si",licitacao.getSituacao());
		request.setAttribute("vt",licitacao.getValortotal());
	}	
	private void excluirlicitacao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		licitacao = new Licitacao();
		dao = new LicitacaoDao();
		licitacao.setId(Integer.parseInt(request.getParameter("id"))); 
		dao.delete(licitacao);
		listarlicitacao(request, response);
		
	}
	private void excluirlicitacaoframe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		licitacao = new Licitacao();
		dao = new LicitacaoDao();
		licitacao.setId(Integer.parseInt(request.getParameter("id"))); 
		dao.delete(licitacao);
		carregarlistaframe(request, response);
	}
	
	//NAO MEXER MAIS DAQUI PRA CIMA!!!!!!!!!!!!10-04-2020
	private void editarlicitacao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		licitacao = new Licitacao();
		dao = new LicitacaoDao();
		licitacao.setId(Integer.parseInt(request.getParameter("id")));
    	List<Licitacao> consulta = new ArrayList<>();
        consulta = dao.consultar(licitacao);
    	System.out.println(consulta.toString());
    	mensagem="Atualizando Licitacao";
    	request.setAttribute("listaConsulta", consulta);
    	request.setAttribute("atualiza", mensagem);
    	RequestDispatcher ed = request.getRequestDispatcher("/WEB-INF/licitacaoatualiza.jsp");
    	ed.forward(request, response);
		
	}
	private void editarlicitacaoframe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		licitacao = new Licitacao();
		dao = new LicitacaoDao();
		licitacao.setId(Integer.parseInt(request.getParameter("id")));
    	List<Licitacao> consulta = new ArrayList<>();
        consulta = dao.consultar(licitacao);
    	System.out.println(consulta.toString());
    	mensagem="Atualizando Licitacao";
    	request.setAttribute("listaConsulta", consulta);
    	request.setAttribute("atualiza", mensagem);
    	RequestDispatcher ed = request.getRequestDispatcher("/WEB-INF/licitacaoatualizaframe.jsp");
    	ed.forward(request, response);
		
	}
    private void atualizarlicitacao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//plano = new Planejamento();
    	//dao = new PlanejamentoDao();
    	try{
    		licitacao.setItem(request.getParameter("item"));
    		licitacao.setSede(request.getParameter("sede"));
    		licitacao.setArea(request.getParameter("area"));
    		licitacao.setUnidade(request.getParameter("unidade"));
    		licitacao.setEstado(request.getParameter("estado"));
    		licitacao.setProcessosrd(request.getParameter("processosrd"));
    		licitacao.setNomeanalista(request.getParameter("nomeanalista"));
    		licitacao.setModalidade(request.getParameter("modalidade"));
    		licitacao.setObjeto(request.getParameter("objeto"));
    		licitacao.setTipo(request.getParameter("tipo"));
    		licitacao.setAutorizacao(request.getParameter("autorizacao"));
    		licitacao.setValorestimadomaxcvasf(request.getParameter("valorestimadomaxcvasf"));
    		licitacao.setValoradjudicado(request.getParameter("valoradjudicado"));
    		licitacao.setEmendaparlamentar(request.getParameter("emendaparlamentar"));
    		licitacao.setPrazodeexecucao(request.getParameter("prazodeexecucao"));
    		Calendar ds = null;
    		licitacao.setDatasessao(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datasessao").toString()));
    		ds = Calendar.getInstance();
    		ds.setTime(licitacao.getDatasessao());
    		licitacao.setSituacao(request.getParameter("situacao"));
    		licitacao.setValortotal(request.getParameter("valortotal"));
    		
		System.out.println(licitacao.toString());
    	}catch(ParseException e){
    		//mensagem="Preencher o formulario!";
    		//request.setAttribute("mensagem", mensagem);
    		e.getMessage();
    	}
		//System.out.println(plano.toString());
		if(dao.atualizar(licitacao)){
		listarlicitacao(request, response);
		}else{
			System.out.println("Erro");
		}
	}	
    private void atualizarlicitacaoframe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//plano = new Planejamento();
    	//dao = new PlanejamentoDao();
    	try{
    		licitacao.setItem(request.getParameter("item"));
    		licitacao.setSede(request.getParameter("sede"));
    		licitacao.setArea(request.getParameter("area"));
    		licitacao.setUnidade(request.getParameter("unidade"));
    		licitacao.setEstado(request.getParameter("estado"));
    		licitacao.setProcessosrd(request.getParameter("processosrd"));
    		licitacao.setNomeanalista(request.getParameter("nomeanalista"));
    		licitacao.setModalidade(request.getParameter("modalidade"));
    		licitacao.setObjeto(request.getParameter("objeto"));
    		licitacao.setTipo(request.getParameter("tipo"));
    		licitacao.setAutorizacao(request.getParameter("autorizacao"));
    		licitacao.setValorestimadomaxcvasf(request.getParameter("valorestimadomaxcvasf"));
    		licitacao.setValoradjudicado(request.getParameter("valoradjudicado"));
    		licitacao.setEmendaparlamentar(request.getParameter("emendaparlamentar"));
    		licitacao.setPrazodeexecucao(request.getParameter("prazodeexecucao"));
    		Calendar ds = null;
    		licitacao.setDatasessao(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datasessao").toString()));
    		ds = Calendar.getInstance();
    		ds.setTime(licitacao.getDatasessao());
    		licitacao.setSituacao(request.getParameter("situacao"));
    		licitacao.setValortotal(request.getParameter("valortotal"));
    		System.out.println(licitacao.toString());
    		dao.atualizar(licitacao);
    	}catch(ParseException e){
    		//mensagem="Preencher o formulario!";
    		//request.setAttribute("mensagem", mensagem);
    		e.getMessage();
    	}
		//System.out.println(plano.toString());
		if(dao.atualizar(licitacao)){
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

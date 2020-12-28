package br.com.business;

import java.util.List;

import br.com.model.Licitacao;

public abstract interface ILicitacao {
	
	void salvar(Licitacao licitacao);
	void delete(Licitacao licitacao);
	List<Licitacao> listar();
	boolean existe(Licitacao licitacao);
	List<Licitacao>  consultar(Licitacao licitacao);
	boolean atualizar(Licitacao licitacao);
	
	

}



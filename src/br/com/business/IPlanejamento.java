package br.com.business;

import java.util.List;

import br.com.model.Planejamento;

public abstract interface IPlanejamento {
	
	void salvar(Planejamento plano);
	void delete(Planejamento plano);
	List<Planejamento> listar();
	boolean existe(Planejamento Plano);
	List<Planejamento>  consultar(Planejamento plano);
	boolean atualizar(Planejamento plano);
	
	

}



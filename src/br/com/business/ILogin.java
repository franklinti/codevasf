package br.com.business;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.Login;

public interface ILogin {

	void inserir(Login login);
	void atualiza(Login login);
	void delete(Login login);
	List<Login>lista();
	boolean existe(Login login);
	Login consulta(Login login);
	void executa(HttpServletRequest req, HttpServletResponse res)throws Exception;
	
}

package br.com.util;

import java.sql.Connection;
import java.sql.DriverManager;



public class Dao {

	public Connection getConexao(){
		Connection con = null;
		String user="postgres";
		String senha="admin";
		String nomeBancoDados="gestao";
		try{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+nomeBancoDados,user,senha);
		    
		}catch(Exception e){
			System.err.println("Status conexao :" + con);
		}
		return con;
		
	}
	 
}

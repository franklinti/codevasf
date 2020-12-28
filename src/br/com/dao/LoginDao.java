package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.business.ILogin;
import br.com.model.Login;
import br.com.util.Dao;

public class LoginDao extends Dao implements ILogin {

	static String inserirdado="INSERT INTO Login(matricula,senha)VALUES(?,?)";
	static String atualizadado="UPDATE Planejamento SET matricula = ?, senha= ? " + " WHERE matricula = ?";
	static String deletedado="DELETE FROM Login WHERE matricula = ?";
	static String existedado="SELECT matricula,senha FROM Login WHERE matricula =	? and senha = ?";
	static String listardado ="SELECT * FROM Login";
	static String consultadado="SELECT * FROM Login WHERE matricula =?";
	
	@Override
	public void inserir(Login login) {
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(inserirdado);
			pstm.setString(1, login.getMatricula());
			pstm.setString(2, login.getSenha());
			pstm.execute();
			pstm.close();
			con.close();
			System.out.print("Inserido");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualiza(Login login) {}

	@Override
	public void delete(Login login) {}

	@Override
	public List<Login> lista() {return null;
	}

	@Override
	public boolean existe(Login login) {
		boolean achou = false;
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(existedado);
			pstm.setString(1, login.getMatricula());
			pstm.setString(2, login.getSenha());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				achou = true;
			}else{
			  achou = false;
			  System.out.println("User nao cadastrado");
				//rs.findColumn(null);
			}
			pstm.close();
			rs.close();
			System.out.println(achou);
			con.close();
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Sql Exception");
		}
		
		return achou;
		
	}

	@Override
	public Login consulta(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}

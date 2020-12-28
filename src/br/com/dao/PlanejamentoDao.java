package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.business.IPlanejamento;
import br.com.model.Planejamento;
import br.com.util.Dao;
/**
 * 
 * @author Administrador
 * 
 */
public class PlanejamentoDao extends Dao implements IPlanejamento {
	
	//static String salvardado="INSERT INTO Planejamento(item)VALUES(?)";
	static String salvardado="INSERT INTO Planejamento(item,sede,requisitante,descricaodoobjeto,"
			+ "quantidadeestimada,valorestimado,datainicio,datafim,totaldedias,justificativaaquisicao,programasuportado,valortotal)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	static String listardado ="SELECT * FROM Planejamento";
	static String deletedado="DELETE FROM Planejamento WHERE id = ?";
	static String existedado="SELECT * FROM Planejamento WHERE item = ?";
	static String consultadado="SELECT * FROM Planejamento WHERE id = ?";
	static String atualizadado="UPDATE Planejamento SET item = ?, sede= ?, "
			+ "requisitante = ?, descricaodoobjeto = ?, quantidadeestimada = ?, valorestimado = ?, datainicio = ?, datafim= ?, totaldedias = ?,"
			+ "justificativaaquisicao = ?, programasuportado = ?,valortotal =?"+" WHERE id = ?";
	//static String atualizadado="UPDATE Planejamento SET  sede= ?"+" where id = ?";
	@Override
	public void salvar(Planejamento plano) {
		try{
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(salvardado);
			pstm.setString(1, plano.getItem());
			pstm.setString(2, plano.getSede());
			pstm.setString(3, plano.getRequisitante());
			pstm.setString(4, plano.getDescricaodoobjeto());
			pstm.setString(5,plano.getQuantidadeestimada());
			pstm.setString(6, plano.getValorestimado());
			pstm.setDate(7, new java.sql.Date (plano.getDatainicio().getTime()));
			pstm.setDate(8, new java.sql.Date(plano.getDatafim().getTime()));
			pstm.setString(9, plano.getTotaldedias());
			pstm.setString(10, plano.getJustificativaaquisicao());
			pstm.setString(11, plano.getProgramasuportado());
			pstm.setString(12, plano.getValortotal());
			pstm.execute();
			pstm.close();
			System.out.println("Action retorno sqlsalvar: "+salvardado.toString());
			con.close();
		}catch(Exception e){
			System.out.println("Action Erro sql salvar");
		}
	}
	@Override
	public List<Planejamento> listar() {
		List<Planejamento> lista = new ArrayList<>();
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(listardado);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				Planejamento listaplano = new Planejamento();
				listaplano.setId(rs.getInt("id"));
				listaplano.setItem(rs.getString("item"));
				listaplano.setSede(rs.getString("sede"));
				listaplano.setRequisitante(rs.getString("requisitante"));
				listaplano.setDescricaodoobjeto(rs.getString("descricaodoobjeto"));
				listaplano.setQuantidadeestimada(rs.getString("quantidadeestimada"));
				listaplano.setValorestimado(rs.getString("valorestimado"));
				listaplano.setDatainicio(new java.util.Date(rs.getDate("Datainicio").getTime()));
				listaplano.setDatafim(new java.util.Date(rs.getDate("Datafim").getTime()));
				listaplano.setTotaldedias(rs.getString("totaldedias"));
			    listaplano.setJustificativaaquisicao(rs.getString("justificativaaquisicao"));
				listaplano.setProgramasuportado(rs.getString("programasuportado"));
				listaplano.setValortotal(rs.getString("valortotal"));
				lista.add(listaplano);
			}
			rs.close();
			pstm.close();
			System.out.println("Action retorno sqllistar!"+ listardado.toString());
			con.close();
		} catch (Exception e) {
			System.out.println("Action Erro sql listar");
		}
		return lista;
	}
	@Override
	public boolean existe(Planejamento plano) {
		boolean achou = false;
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(existedado);
			pstm.setString(1, plano.getItem());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				achou = true;
				System.out.println("Action retorno sqlexiste "+existedado.toString());
			}
			pstm.close();
			con.close();
		} catch (Exception e) {
		   System.out.println("Action Erro sql existe");
		}
		
		return achou;
	}
	@Override
	public void delete(Planejamento plano) {
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(deletedado);
			pstm.setLong(1, plano.getId());
			pstm.execute();
			pstm.close();
			System.out.println("Action retorno sqlexiste "+deletedado.toString());
			con.close();
		} catch (Exception e) {
			System.out.println("Action Erro sql delete");
		}
	}
	@Override
	public boolean atualizar(Planejamento plano) {
		boolean atualiza = false;
		//verificar historico alteracoes no plano
		List<Planejamento> historico = new ArrayList<>();
		try {
			Connection con = getConexao();
			//remover campo item na atualizacao 
			PreparedStatement pstm = con.prepareStatement(atualizadado);
			pstm.setString(1, plano.getItem());
			pstm.setString(2, plano.getSede());
			pstm.setString(3, plano.getRequisitante());
			pstm.setString(4, plano.getDescricaodoobjeto());
			pstm.setString(5,plano.getQuantidadeestimada());
			pstm.setString(6, plano.getValorestimado());
			pstm.setDate(7, new java.sql.Date (plano.getDatainicio().getTime()));
			pstm.setDate(8, new java.sql.Date(plano.getDatafim().getTime()));
			pstm.setString(9, plano.getTotaldedias());
			pstm.setString(10, plano.getJustificativaaquisicao());
			pstm.setString(11, plano.getProgramasuportado());
			pstm.setString(12, plano.getValortotal());
			pstm.setLong(13, plano.getId());
			atualiza = true;
			historico.add(plano);
			
			pstm.executeUpdate();
			pstm.close();
		    System.out.println("Action retorno sqlatualiza: "+ atualizadado.toString());
		    System.out.println(historico.toString());
		    con.close();
		}catch (Exception e) {
			System.out.println("Action Erro sql atualiza");
		}
		return atualiza;
	}
	@Override
	public List<Planejamento> consultar(Planejamento plano) {
		List<Planejamento> consulta = new ArrayList<>();
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(consultadado);
			pstm.setLong(1, plano.getId());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				Planejamento consultaplano = new Planejamento();
				consultaplano.setId(rs.getInt("id"));
				consultaplano.setItem(rs.getString("item"));
				consultaplano.setSede(rs.getString("sede"));
				consultaplano.setRequisitante(rs.getString("requisitante"));
				consultaplano.setDescricaodoobjeto(rs.getString("descricaodoobjeto"));
				consultaplano.setQuantidadeestimada(rs.getString("quantidadeestimada"));
				consultaplano.setValorestimado(rs.getString("valorestimado"));
				consultaplano.setDatainicio(new java.sql.Date(rs.getDate("Datainicio").getTime()));
				consultaplano.setDatafim(new java.sql.Date(rs.getDate("Datafim").getTime()));
				consultaplano.setTotaldedias(rs.getString("totaldedias"));
			    consultaplano.setJustificativaaquisicao(rs.getString("justificativaaquisicao"));
				consultaplano.setProgramasuportado(rs.getString("programasuportado"));
				consultaplano.setValortotal(rs.getString("valortotal"));
				consulta.add(consultaplano);
			}
			pstm.close();
			System.out.println("Action retorno sqlconsulta: "+ consultadado.toString());
			con.close();
		} catch (Exception e) {
			System.out.println("Action Erro sql consulta");
		}
		///System.out.println(consulta.toString());
		return consulta;
		
	}
}

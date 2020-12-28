package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.business.ILicitacao;
import br.com.model.Licitacao;
import br.com.util.Dao;
/**
 * 
 * @author Administrador
 * 
 */
public class LicitacaoDao extends Dao implements ILicitacao{
	
	//static String salvardado="INSERT INTO Licitacao(item)VALUES(?)";
	static String salvardado="INSERT INTO Licitacao(item,sede,area,unidade,estado,"
			+ "processosrd,nomeanalista,modalidade,objeto,tipo,"
			+ "autorizacao,valorestimadomaxcvasf,valoradjudicado,emendaparlamentar,prazodeexecucao,datasessao,situacao,valortotal)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	static String listardado ="SELECT * FROM Licitacao";
	static String deletedado="DELETE FROM Licitacao WHERE id = ?";
	static String existedado="SELECT * FROM Licitacao WHERE item = ?";
	static String consultadado="SELECT * FROM Licitacao WHERE id = ?";
	static String atualizadado="UPDATE Licitacao SET item= ?, sede= ?,area= ?,unidade= ?,estado= ?,"
			+ "processosrd= ?,nomeanalista= ?,modalidade= ?, objeto= ?, tipo= ?,"
			+ " autorizacao= ?, valorestimadomaxcvasf = ?, valoradjudicado= ?, emendaparlamentar= ?,prazodeexecucao= ?, datasessao= ?,situacao= ?, valortotal= ?"+" WHERE id = ?";
	//static String atualizadado="UPDATE Planejamento SET  sede= ?"+" where id = ?";
	@Override
	public void salvar(Licitacao licitacao) {
		try{
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(salvardado);
			pstm.setString(1, licitacao.getItem());
			pstm.setString(2, licitacao.getSede());
			pstm.setString(3, licitacao.getArea());
			pstm.setString(4, licitacao.getUnidade());
			pstm.setString(5, licitacao.getEstado());
			pstm.setString(6, licitacao.getProcessosrd());
			pstm.setString(7, licitacao.getNomeanalista());
			pstm.setString(8, licitacao.getModalidade());
			pstm.setString(9, licitacao.getObjeto());
			pstm.setString(10, licitacao.getTipo());
			pstm.setString(11, licitacao.getAutorizacao());
			pstm.setString(12, licitacao.getValorestimadomaxcvasf());
			pstm.setString(13, licitacao.getValoradjudicado());
			pstm.setString(14, licitacao.getEmendaparlamentar());
			pstm.setString(15, licitacao.getPrazodeexecucao());
			pstm.setDate(16, new java.sql.Date(licitacao.getDatasessao().getTime()));
			pstm.setString(17, licitacao.getSituacao());
			pstm.setString(18, licitacao.getValortotal());
			pstm.execute();
			pstm.close();
			System.out.println("Action retorno sqlsalvar: "+salvardado.toString());
			con.close();
		}catch(Exception e){
			System.out.println("Action Erro sqllicitacao salvar");	
		}
	}
	@Override
	public List<Licitacao> listar() {
		List<Licitacao> lista = new ArrayList<>();
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(listardado);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				Licitacao listalicitacao = new Licitacao();
				listalicitacao.setId(rs.getInt("id"));
				listalicitacao.setItem(rs.getString("item"));
				listalicitacao.setSede(rs.getString("sede"));
				listalicitacao.setArea(rs.getString("area"));
				listalicitacao.setUnidade(rs.getString("unidade"));
				listalicitacao.setEstado(rs.getString("estado"));
				listalicitacao.setProcessosrd(rs.getString("processosrd"));
				listalicitacao.setNomeanalista(rs.getString("nomeanalista"));
				listalicitacao.setModalidade(rs.getString("modalidade"));
				listalicitacao.setObjeto(rs.getString("objeto"));
				listalicitacao.setTipo(rs.getString("tipo"));
				listalicitacao.setAutorizacao(rs.getString("autorizacao"));
				listalicitacao.setValorestimadomaxcvasf(rs.getString("valorestimadomaxcvasf"));
				listalicitacao.setValoradjudicado(rs.getString("valoradjudicado"));
				listalicitacao.setEmendaparlamentar(rs.getString("emendaparlamentar"));
				listalicitacao.setPrazodeexecucao(rs.getString("prazodeexecucao"));
				listalicitacao.setDatasessao(new java.util.Date(rs.getDate("datasessao").getTime()));
				listalicitacao.setSituacao(rs.getString("situacao"));
				listalicitacao.setValortotal(rs.getString("valortotal"));
				
				lista.add(listalicitacao);
				System.out.println(lista.toString());
			}
			rs.close();
			pstm.close();
			System.out.println("Action retorno sqllistar!"+ listardado.toString());
			con.close();
		} catch (Exception e) {
			System.out.println("Action Erro sqllicitacao listar");
		}
		return lista;
	}
	@Override
	public boolean existe(Licitacao licitacao) {
		boolean achou = false;
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(existedado);
			pstm.setString(1, licitacao.getItem());
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
	public void delete(Licitacao licitacao) {
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(deletedado);
			pstm.setLong(1, licitacao.getId());
			pstm.execute();
			pstm.close();
			System.out.println("Action retorno sqldelete "+deletedado.toString());
			con.close();
		} catch (Exception e) {
			System.out.println("Action Erro sql delete");
		}
	}
	@Override
	public boolean atualizar(Licitacao licitacao) {
		boolean atualiza = false;
		//verificar historico alteracoes no plano
	//	List<Licitacao> historico = new ArrayList<>();
		try {
			Connection con = getConexao();
			//remover campo item na atualizacao 
			PreparedStatement pstm = con.prepareStatement(atualizadado);
			pstm.setString(1, licitacao.getItem());
			pstm.setString(2, licitacao.getSede());
			pstm.setString(3, licitacao.getArea());
			pstm.setString(4, licitacao.getUnidade());
			pstm.setString(5, licitacao.getEstado());
			pstm.setString(6, licitacao.getProcessosrd());
			pstm.setString(7, licitacao.getNomeanalista());
			pstm.setString(8, licitacao.getModalidade());
			pstm.setString(9, licitacao.getObjeto());
			pstm.setString(10, licitacao.getTipo());
			pstm.setString(11, licitacao.getAutorizacao());
			pstm.setString(12, licitacao.getValorestimadomaxcvasf());
			pstm.setString(13, licitacao.getValoradjudicado());
			pstm.setString(14, licitacao.getEmendaparlamentar());
			pstm.setString(15, licitacao.getPrazodeexecucao());
			pstm.setDate(16, new java.sql.Date(licitacao.getDatasessao().getTime()));
			pstm.setString(17, licitacao.getSituacao());
			pstm.setString(18, licitacao.getValortotal());
			pstm.setLong(19, licitacao.getId());
			
			atualiza = true;
			//historico.add(licitacao);
			
			pstm.executeUpdate();
			pstm.close();
		    System.out.println("Action retorno sqlatualiza: "+ atualizadado.toString());
		   // System.out.println(historico.toString());
		    con.close();
		}catch (Exception e) {
			System.out.println("Action Erro sql atualiza");
		}
		return atualiza;
	}
	@Override
	public List<Licitacao> consultar(Licitacao licitacao) {
		List<Licitacao> consulta = new ArrayList<>();
		try {
			Connection con = getConexao();
			PreparedStatement pstm = con.prepareStatement(consultadado);
			pstm.setLong(1, licitacao.getId());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				Licitacao consultalicitacao = new Licitacao();
				consultalicitacao.setId(rs.getInt("id"));
				consultalicitacao.setItem(rs.getString("item"));
				consultalicitacao.setSede(rs.getString("sede"));
				consultalicitacao.setArea(rs.getString("area"));
				consultalicitacao.setUnidade(rs.getString("unidade"));
				consultalicitacao.setEstado(rs.getString("estado"));
				consultalicitacao.setProcessosrd(rs.getString("processosrd"));
				consultalicitacao.setNomeanalista(rs.getString("nomeanalista"));
				consultalicitacao.setModalidade(rs.getString("modalidade"));
				consultalicitacao.setObjeto(rs.getString("objeto"));
				consultalicitacao.setTipo(rs.getString("tipo"));
				consultalicitacao.setAutorizacao(rs.getString("autorizacao"));
				consultalicitacao.setValorestimadomaxcvasf(rs.getString("valorestimadomaxcvasf"));
				consultalicitacao.setValoradjudicado(rs.getString("valoradjudicado"));
				consultalicitacao.setEmendaparlamentar(rs.getString("emendaparlamentar"));
				consultalicitacao.setPrazodeexecucao(rs.getString("prazodeexecucao"));
				consultalicitacao.setDatasessao(new java.sql.Date(rs.getDate("datasessao").getTime()));
				consultalicitacao.setSituacao(rs.getString("situacao"));
				consultalicitacao.setValortotal(rs.getString("valortotal"));
				
				
				consulta.add(consultalicitacao);
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

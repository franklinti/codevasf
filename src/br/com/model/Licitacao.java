package br.com.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Licitacao")
@NamedQuery(name="Licitacao.findAll", query="SELECT l FROM Licitacao l")
public class Licitacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//@Column(name = "id", unique = true)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String item="";
	private String sede="";
	private String area="";
	private String unidade="";
	private String estado="";
	private String processosrd="";
	private String nomeanalista="";
	private String modalidade="";
	private String objeto="";
	private String tipo="";
	private String autorizacao="";
	private String valorestimadomaxcvasf="";
	private String valoradjudicado="";
	private String emendaparlamentar="";
	private String prazodeexecucao="";
	@Temporal(TemporalType.DATE)
	private Date datasessao;
	private String situacao="";
	private String valortotal="";
	public Licitacao() {
		super();
	}
	public Licitacao(int id, String item, String sede, String area, String unidade, String estado,
			String processosrd, String nomeanalista, String modalidade, String objeto, String tipo, String autorizacao,
			String valorestimadomaxcvasf, String valoradjudicado, String emendaparlamentar, String prazodeexecucao,
			Date datasessao, String situacao, String valortotal) {
		super();
		this.id = id;
		this.item = item;
		this.sede = sede;
		this.area = area;
		this.unidade = unidade;
		this.estado = estado;
		this.processosrd = processosrd;
		this.nomeanalista = nomeanalista;
		this.modalidade = modalidade;
		this.objeto = objeto;
		this.tipo = tipo;
		this.autorizacao = autorizacao;
		this.valorestimadomaxcvasf = valorestimadomaxcvasf;
		this.valoradjudicado = valoradjudicado;
		this.emendaparlamentar = emendaparlamentar;
		this.prazodeexecucao = prazodeexecucao;
		this.datasessao = datasessao;
		this.situacao = situacao;
		this.valortotal = valortotal;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getProcessosrd() {
		return processosrd;
	}
	public void setProcessosrd(String processosrd) {
		this.processosrd = processosrd;
	}
	public String getNomeanalista() {
		return nomeanalista;
	}
	public void setNomeanalista(String nomeanalista) {
		this.nomeanalista = nomeanalista;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public String getObjeto() {
		return objeto;
	}
	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAutorizacao() {
		return autorizacao;
	}
	public void setAutorizacao(String autorizacao) {
		this.autorizacao = autorizacao;
	}
	public String getValorestimadomaxcvasf() {
		return valorestimadomaxcvasf;
	}
	public void setValorestimadomaxcvasf(String valorestimadomaxcvasf) {
		this.valorestimadomaxcvasf = valorestimadomaxcvasf;
	}
	public String getValoradjudicado() {
		return valoradjudicado;
	}
	public void setValoradjudicado(String valoradjudicado) {
		this.valoradjudicado = valoradjudicado;
	}
	public String getEmendaparlamentar() {
		return emendaparlamentar;
	}
	public void setEmendaparlamentar(String emendaparlamentar) {
		this.emendaparlamentar = emendaparlamentar;
	}
	public String getPrazodeexecucao() {
		return prazodeexecucao;
	}
	public void setPrazodeexecucao(String prazodeexecucao) {
		this.prazodeexecucao = prazodeexecucao;
	}
	public Date getDatasessao() {
		return datasessao;
	}
	public void setDatasessao(Date datasessao) {
		this.datasessao = datasessao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getValortotal() {
		return valortotal;
	}
	public void setValortotal(String valortotal) {
		this.valortotal = valortotal;
	}
	@Override
	public String toString() {
		return "Licitacao [id=" + id + ", item=" + item + ", sede=" + sede + ", area=" + area + ", unidade=" + unidade + ", estado=" + estado + ", processo=" + processosrd
				+ ", nomeanalista=" + nomeanalista + ", modalidade=" + modalidade + ", objeto=" + objeto + ", tipo="
				+ tipo + ", autorizacao=" + autorizacao + ", valorestimadomaxcvasf=" + valorestimadomaxcvasf
				+ ", valoradjudicado=" + valoradjudicado + ", emendaparlamentar=" + emendaparlamentar
				+ ", prazodeexecucao=" + prazodeexecucao + ", datasessao=" + datasessao + ", situacao=" + situacao
				+ ", valortotal=" + valortotal + "]";
	}
	
	
	
	
	
	
}

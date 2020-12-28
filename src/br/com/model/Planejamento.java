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


//import com.oracle.webservices.internal.api.EnvelopeStyle;

@Entity
@Table(name="Planejamento")
@NamedQuery(name="Planejamento.findAll", query="SELECT p FROM Planejamento p")
public class Planejamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String item="";
	private String sede="";
	private String requisitante="";
	private String descricaodoobjeto="";
	private String quantidadeestimada="";
	private String valorestimado="";
	@Temporal(TemporalType.DATE)
	private Date datainicio;
	@Temporal(TemporalType.DATE)
	private Date datafim;
	private String totaldedias="";
	private String justificativaaquisicao="";
	private String programasuportado="";
	private String valortotal="";
	
	
	//private Date Data_inclusao_registro;
	public Planejamento(){ super();}
	public Planejamento(int id, String item, String sede, String requisitante,
			String descricaodoobjeto, String quantidadeestimada, String valorestimado, Date datainicio, Date datafim,
			String totaldedias, String justificativaaquisicao,
			String programasuportado, String valortotal) {
		super();
		this.id = id;
		this.item = item;
		this.sede = sede;
		this.requisitante = requisitante;
		this.descricaodoobjeto = descricaodoobjeto;
		this.quantidadeestimada = quantidadeestimada;
		this.valorestimado = valorestimado;
		this.datainicio = datainicio;
		this.datafim = datafim;
		this.totaldedias = totaldedias;
		this.justificativaaquisicao = justificativaaquisicao;
		this.programasuportado = programasuportado;
		this.valortotal = valortotal;
	}
	public Planejamento(Planejamento plano) {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public String setItem(String item) {
		return this.item = item;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getRequisitante() {
		return requisitante;
	}
	public void setRequisitante(String requisitante) {
		this.requisitante = requisitante;
	}
	public String getDescricaodoobjeto() {
		return descricaodoobjeto;
	}
	public void setDescricaodoobjeto(String descricaodoobjeto) {
		this.descricaodoobjeto = descricaodoobjeto;
	}
	public String getQuantidadeestimada() {
		return quantidadeestimada;
	}
	public void setQuantidadeestimada(String quantidadeestimada) {
		this.quantidadeestimada = quantidadeestimada;
	}
	public String getValorestimado() {
		return valorestimado;
	}
	public void setValorestimado(String valorestimado) {
		this.valorestimado = valorestimado;
	}
	public Date getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(Date date) {
		this.datainicio = date;
	}
	public Date getDatafim() {
		return datafim;
	}
	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}
	public String getTotaldedias() {
		return totaldedias;
	}
	public void setTotaldedias(String totaldedias) {
		this.totaldedias = totaldedias;
	}
	public String getJustificativaaquisicao() {
		return justificativaaquisicao;
	}
	public void setJustificativaaquisicao(
			String justificativaaquisicao) {
		this.justificativaaquisicao = justificativaaquisicao;
	}
	public String getProgramasuportado() {
		return programasuportado;
	}
	public void setProgramasuportado(String programasuportado) {
		this.programasuportado = programasuportado;
	}
	public String getValortotal() {
		return valortotal;
	}
	public void setValortotal(String valortotal) {
		this.valortotal = valortotal;
	}
	@Override
	public String toString() {
		return "Planejamento [id=" + id + ", item=" + item + ", sede=" + sede + ", requisitante=" + requisitante + ", descricaodoobjeto=" + descricaodoobjeto
				+ ", quantidadeestimada=" + quantidadeestimada + ", valorestimado=" + valorestimado + ", datainicio="
				+ datainicio + ", datafim=" + datafim + ", totaldedias=" + totaldedias + ", justificativaaquisicao="
				+ justificativaaquisicao + ", programasuportado=" + programasuportado + ", valortotal=" + valortotal
				+ "]";
	}
	
	
	

}

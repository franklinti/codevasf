package br.com.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Registro")
@NamedQuery(name="Registro.findAll", query="SELECT r FROM Registro r")
public class Registro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//@Column(name = "id", unique = true)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private int item;
	private String ataregistrodepreco;
	private String uasg;
	private String estado;
	private String processosrd;
	private String numeroedital;
	private String modalidade;
	private String descricaodoitem;
	private String quantidadefinalhomologada;
	private int valorunitariohomologado;
	private int valortotalhomologado;
	private int saldocontratracaoempenho;
	private String quantidademaximaadesoes;
	private int valortotalcodevasf;
	private int saldoadesao;
	private int valortotaladesao;
	private int valorcontratacaocapacidadetotal;
	@Temporal(TemporalType.DATE)
	private Calendar datavigenciaataregistropreco;
	
}

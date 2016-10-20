package br.edu.iftm.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="agenda")
public class Agenda implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idagenda")
	private Integer idagenda;
	
	@ManyToOne
	@JoinColumn(name = "idcliente")
	private Cliente idcliente;
	
	@ManyToOne
	@JoinColumn(name = "idservico")
	private Servico idservico;
	
	@Column(name="data_inicio")
	private Date data_inicio;
	
	@Column(name="data_fim")
	private Date data_fim;
	
	@Column(name="flag_email")
	private String flag_email;
	
	@Column(name="valor_desconto")
	private BigDecimal valor_desconto;
	
	@Column(name="valor_final")
	private BigDecimal valor_final;
	
	@Column(name="observacao")
	private String observacao;
	
	@Column(name="status")
	private String status;
	
	public Agenda(){
		super();
	}

	public Integer getIdagenda() {
		return idagenda;
	}

	public void setIdagenda(Integer idagenda) {
		this.idagenda = idagenda;
	}

	public Cliente getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Cliente idcliente) {
		this.idcliente = idcliente;
	}

	public Servico getIdservico() {
		return idservico;
	}

	public void setIdservico(Servico idservico) {
		this.idservico = idservico;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public String getFlag_email() {
		return flag_email;
	}

	public void setFlag_email(String flag_email) {
		this.flag_email = flag_email;
	}

	public BigDecimal getValor_desconto() {
		return valor_desconto;
	}

	public void setValor_desconto(BigDecimal valor_desconto) {
		this.valor_desconto = valor_desconto;
	}

	public BigDecimal getValor_final() {
		return valor_final;
	}

	public void setValor_final(BigDecimal valor_final) {
		this.valor_final = valor_final;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

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
@Table(name="contas_receber")
public class ContasReceber implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcontasreceber")
	private Integer idcontasreceber;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "idcliente")
	private Cliente idcliente;
	
	@Column(name="data_conta")
	private Date data_conta;
	
	@Column(name="data_vencimento")
	private Date data_vencimento;
	
	@Column(name="data_recebimento")
	private Date data_recebimento;
	
	@Column(name="valor_conta")
	private BigDecimal valor_conta;
	
	@Column(name="valor_juro")
	private BigDecimal valor_juro;
	
	@Column(name="valor_final")
	private BigDecimal valor_final;
	
	@Column(name="status")
	private String status;
	
	@Column(name="criado_em")
	private Date criado_em;
	
	@Column(name="criado_por")
	private String criado_por;
	
	@Column(name="alterado_em")
	private Date alterado_em;
	
	@Column(name="alterado_por")
	private String alterado_por;
	
	public ContasReceber(){
		super();
	}

	public Integer getIdcontasreceber() {
		return idcontasreceber;
	}

	public void setIdcontasreceber(Integer idcontasreceber) {
		this.idcontasreceber = idcontasreceber;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cliente getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Cliente idcliente) {
		this.idcliente = idcliente;
	}

	public Date getData_conta() {
		return data_conta;
	}

	public void setData_conta(Date data_conta) {
		this.data_conta = data_conta;
	}

	public Date getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(Date data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	public Date getData_recebimento() {
		return data_recebimento;
	}

	public void setData_recebimento(Date data_recebimento) {
		this.data_recebimento = data_recebimento;
	}

	public BigDecimal getValor_conta() {
		return valor_conta;
	}

	public void setValor_conta(BigDecimal valor_conta) {
		this.valor_conta = valor_conta;
	}

	public BigDecimal getValor_juro() {
		return valor_juro;
	}

	public void setValor_juro(BigDecimal valor_juro) {
		this.valor_juro = valor_juro;
	}

	public BigDecimal getValor_final() {
		return valor_final;
	}

	public void setValor_final(BigDecimal valor_final) {
		this.valor_final = valor_final;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCriado_em() {
		return criado_em;
	}

	public void setCriado_em(Date criado_em) {
		this.criado_em = criado_em;
	}

	public String getCriado_por() {
		return criado_por;
	}

	public void setCriado_por(String criado_por) {
		this.criado_por = criado_por;
	}

	public Date getAlterado_em() {
		return alterado_em;
	}

	public void setAlterado_em(Date alterado_em) {
		this.alterado_em = alterado_em;
	}

	public String getAlterado_por() {
		return alterado_por;
	}

	public void setAlterado_por(String alterado_por) {
		this.alterado_por = alterado_por;
	}
	
	

}

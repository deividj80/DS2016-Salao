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
@Table(name="compra")
public class Compra implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcompra")
	private Integer idcompra;
	
	@ManyToOne
	@JoinColumn(name = "idfornecedor")
	private Fornecedor idfornecedor;
		
	@Column(name="data_compra")
	private Date data_compra;
	
	@Column(name="valor_total")
	private BigDecimal valor_total;
	
	@Column(name="valor_frete")
	private BigDecimal valor_frete;
	
	@Column(name="valor_desconto")
	private BigDecimal valor_desconto;
	
	@Column(name="valor_final")
	private BigDecimal valor_final;
	
	@Column(name="forma_pagamento")
	private String forma_pagamento;
	
	@Column(name="observacao")
	private String observacao;
	
	@Column(name="status")
	private String status;
	
	public Compra(){
		super();
	}

	public Integer getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}

	public Fornecedor getIdfornecedor() {
		return idfornecedor;
	}

	public void setIdfornecedor(Fornecedor idfornecedor) {
		this.idfornecedor = idfornecedor;
	}

	public Date getData_compra() {
		return data_compra;
	}

	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}

	public BigDecimal getValor_total() {
		return valor_total;
	}

	public void setValor_total(BigDecimal valor_total) {
		this.valor_total = valor_total;
	}

	public BigDecimal getValor_frete() {
		return valor_frete;
	}

	public void setValor_frete(BigDecimal valor_frete) {
		this.valor_frete = valor_frete;
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

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
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

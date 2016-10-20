package br.edu.iftm.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name="compra_itens")
public class CompraItens implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcompraitens")
	private Integer idcompraitens;
	
	@ManyToOne
	@JoinColumn(name = "idproduto")
	private Produto idproduto;
	
	@ManyToOne
	@JoinColumn(name = "idcompra")
	private Compra idcompra;
	
	@Column(name="quantidade")
	private Integer quantidade;
	
	@Column(name="valor")
	private BigDecimal valor;
	
	@Column(name="desconto")
	private BigDecimal desconto;
	
	public CompraItens(){
		super();
	}

	public Integer getIdcompraitens() {
		return idcompraitens;
	}

	public void setIdcompraitens(Integer idcompraitens) {
		this.idcompraitens = idcompraitens;
	}

	public Produto getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Produto idproduto) {
		this.idproduto = idproduto;
	}

	public Compra getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(Compra idcompra) {
		this.idcompra = idcompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
	
	

}

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
@Table(name="produto")
public class Produto implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idproduto")
	private Integer idproduto;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "categoria")
	private Categoria categoria;
	
	@Column(name="quantidade_estoque")
	private Integer quantidade_estoque;
	
	@Column(name="valor_compra_medio")
	private BigDecimal valor_compra_medio;
	
	@Column(name="valor_venda")
	private BigDecimal valor_venda;
	
	@Column(name="status")
	private String status;
	
	@Column(name="criado_em")
	private Date criado_em;
	
	@Column(name="criado_por")
	private String criado_por;
	
	@Column(name="alterado_em")
	private Date  alterado_em;
	
	@Column(name="alterado_por")
	private String alterado_por;
	
	public Produto(){
		super();
	}

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Integer getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(Integer quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	public BigDecimal getValor_compra_medio() {
		return valor_compra_medio;
	}

	public void setValor_compra_medio(BigDecimal valor_compra_medio) {
		this.valor_compra_medio = valor_compra_medio;
	}

	public BigDecimal getValor_venda() {
		return valor_venda;
	}

	public void setValor_venda(BigDecimal valor_venda) {
		this.valor_venda = valor_venda;
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

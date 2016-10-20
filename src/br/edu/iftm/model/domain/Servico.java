package br.edu.iftm.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="servico")
public class Servico implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idservico")
	private Integer idservico;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="duracao")
	private Integer duracao;
	
	@Column(name="valor")
	private BigDecimal valor;
	
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
	
	public Servico(){
		super();
	}

	public Integer getIdservico() {
		return idservico;
	}

	public void setIdservico(Integer idservico) {
		this.idservico = idservico;
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

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
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

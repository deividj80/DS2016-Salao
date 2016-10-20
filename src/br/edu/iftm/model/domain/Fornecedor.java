package br.edu.iftm.model.domain;

import java.io.Serializable;
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
@Table(name="fornecedor")
public class Fornecedor implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idfornecedor")
	private Integer idfornecedor;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="razao_social")
	private String razao_social;
	
	@Column(name="cpf_cnpj")
	private String cpf_cnpj;
	
	@Column(name="rg_inscricao")
	private String rg_inscricao;
		
	@Column(name="telefone1")
	private String telefone1 ;
	
	@Column(name="telefone2")
	private String telefone2 ;

	@Column(name="telefone3")
	private String telefone3 ;
	
	@Column(name="email")
	private String email;
	
	@Column(name="site")
	private String site;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="complemento")
	private String complemento;
	
	@Column(name="observacao")
	private String observacao;
	
	@Column(name="criado_em")
	private Date criado_em;
	
	@Column(name="criado_por")
	private String criado_por;
	
	@Column(name="alterado_em")
	private Date alterado_em;
	
	@Column(name="alterado_por")
	private String alterado_por;
	
	public Fornecedor(){
		super();
	}

	public Integer getIdfornecedor() {
		return idfornecedor;
	}

	public void setIdfornecedor(Integer idfornecedor) {
		this.idfornecedor = idfornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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

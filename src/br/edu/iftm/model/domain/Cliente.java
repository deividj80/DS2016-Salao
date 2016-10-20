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
@Table(name="cliente")
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcliente")
	private Integer idcliente;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="data_nascimento")
	private Date data_nascimento;
	
	@Column(name="cpf_cnpj")
	private String cpf_cnpj;
	
	@Column(name="rg")
	private String rg ;
	
	@Column(name="telefone1")
	private String telefone1 ;
	
	@Column(name="telefone2")
	private String telefone2 ;

	@Column(name="telefone3")
	private String telefone3 ;
	
	@Column(name="email")
	private String email;
	
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
	
	public Cliente() {
		super();
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
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

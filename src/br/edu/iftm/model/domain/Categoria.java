package br.edu.iftm.model.domain;

import java.io.Serializable;

import javax.persistence.*;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcategoria")
	private Integer idcategoria;
	
	@Column(name="nome")
	private String nome;
	
	public Categoria(){
		
	}

	public Integer getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}

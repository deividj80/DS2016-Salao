package br.edu.iftm.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
	private Integer nome;
	
	public Categoria(){
		super();
	}

	public Integer getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public Integer getNome() {
		return nome;
	}

	public void setNome(Integer nome) {
		this.nome = nome;
	}
	
	
	
}

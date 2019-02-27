package com.lmb.pedidos.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MENU")
public class MenuModel {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="IMAGE_PATH", nullable = false)
	private String imagePath;
	
	@Column(name="", nullable = false)
	private String nome;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Column(name="PRECO", nullable = false)
	private Double preco;
	
	@ManyToOne
	@JoinColumn(name="ID_RESTAURANTE", nullable = false)
	private RestauranteModel restautanteId;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public RestauranteModel getRestautanteId() {
		return restautanteId;
	}
	
	public void setRestautanteId(RestauranteModel restautanteId) {
		this.restautanteId = restautanteId;
	}
	
}

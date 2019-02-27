package com.lmb.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="RESTAURANTE")
public class RestauranteModel {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NOME", nullable = false)
	private String nome;
	
	@Column(name="CATEGORIA", nullable = false)
	private String categoria;
	
	@Column(name="ENTREGA_ESTIMATIVA", nullable = false)
	private String entregaEstimativa;
	
	@Column(name="NOTA", nullable = false)
	private Double nota;
	
	@Column(name="IMAGE_PATH", nullable = false)
	private String imagePath;
	
	@Column(name="SOBRE")
	private String sobre;
	
	@Column(name="HORARIO_FUNCIONAMENTO", nullable = false)
	private String horaFuncinamento;
	
	@OneToMany(mappedBy = "RESTAURANTE", targetEntity = MenuModel.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MenuModel> listMenu;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getEntregaEstimativa() {
		return entregaEstimativa;
	}
	
	public void setEntregaEstimativa(String entregaEstimativa) {
		this.entregaEstimativa = entregaEstimativa;
	}
	
	public Double getNota() {
		return nota;
	}
	
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public String getSobre() {
		return sobre;
	}
	
	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	
	public String getHoraFuncinamento() {
		return horaFuncinamento;
	}
	
	public void setHoraFuncinamento(String horaFuncinamento) {
		this.horaFuncinamento = horaFuncinamento;
	}
	
}

package com.lmb.pedidos.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ITEM_PEDIDO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ItensPedido {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="QUANTIDADE", nullable = false)
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name = "ID_MENU", nullable = false)
	private MenuModel menu;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PEDIDO")
	private PedidoModel pedido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public MenuModel getMenu() {
		return menu;
	}

	public void setMenu(MenuModel menu) {
		this.menu = menu;
	}

	public PedidoModel getPedido() {
		return pedido;
	}

	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}
	
	
	
}

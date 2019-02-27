package com.lmb.pedidos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_PAGAMENTO")
public class ItensPagamento {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="QUANTIDADE", nullable = false)
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name = "ID_MENU", nullable = false)
	private MenuModel menuId;
	
	
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
	
	public MenuModel getMenuId() {
		return menuId;
	}
	
	public void setMenuId(MenuModel menuId) {
		this.menuId = menuId;
	}
	
}

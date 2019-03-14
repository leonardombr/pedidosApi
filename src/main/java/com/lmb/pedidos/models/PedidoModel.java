package com.lmb.pedidos.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "PEDIDO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PedidoModel {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Column(name = "ENDERECO", nullable = false)
	private String endereco;
	
	@Column(name = "ENDERECO_OPCIONAL")
	private String enderecoOpcional;
	
	@Column(name = "PAGAMENTO_OPCAO", nullable = false)
	private String pagamentoOpcao;	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")	
	private List<ItensPedido> listItemPedido;

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

	public String getEnderecoOpcional() {
		return enderecoOpcional;
	}

	public void setEnderecoOpcional(String enderecoOpcional) {
		this.enderecoOpcional = enderecoOpcional;
	}

	public String getPagamentoOpcao() {
		return pagamentoOpcao;
	}

	public void setPagamentoOpcao(String pagamentoOpcao) {
		this.pagamentoOpcao = pagamentoOpcao;
	}

	public List<ItensPedido> getListItemPedido() {
		return listItemPedido;
	}

	public void setListItemPedido(List<ItensPedido> listItemPedido) {
		this.listItemPedido = listItemPedido;
	}

}

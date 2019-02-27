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
@Table(name = "PAGAMENTO")
public class PagamentoModel {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "ENDERECO", nullable = false)
	private String endereco;
	
	@Column(name = "NUMERO", nullable = false)
	private Integer numero;
	
	@Column(name = "ENDERECO_OPCIONAL", nullable = false)
	private String enderecoOpcional;
	
	@Column(name = "PAGAMENTO_OPCAO", nullable = false)
	private String pagamentoOpcao;
	
	
	@OneToMany(mappedBy = "PAGAMENTO", targetEntity = ItensPagamento.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<ItensPagamento> listItemPagamento;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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

	public List<ItensPagamento> getListItemPagamento() {
		return listItemPagamento;
	}

	public void setListItemPagamento(List<ItensPagamento> listItemPagamento) {
		this.listItemPagamento = listItemPagamento;
	}	
	
}

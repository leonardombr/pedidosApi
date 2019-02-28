package com.lmb.pedidos.dto;
	
import java.io.Serializable;

public class ReturnDTO implements Serializable{
	
	
	private String mensagem;
	private Boolean erro;
	private Object value;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Boolean getErro() {
		return erro;
	}
	public void setErro(Boolean verificado) {
		this.erro = verificado;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
}

package com.lmb.pedidos.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseReturn {

	public ResponseEntity handleError(Exception e) {
		ReturnDTO to = new ReturnDTO();
		to.setErro(true);
		to.setMensagem(e.getMessage());
		e.printStackTrace();
		return ResponseEntity.status(500).body(to);
	}

	public ResponseEntity handleResponse(Object value, String message) {
		ReturnDTO to = new ReturnDTO();
		to.setErro(false);
		to.setValue(value);
		to.setMensagem(message);
		return ResponseEntity.status(HttpStatus.OK).body(to);
	}

	public ResponseEntity handleResponse(Object value) {
		ReturnDTO to = new ReturnDTO();
		to.setErro(false);
		to.setValue(value);
		return ResponseEntity.status(HttpStatus.OK).body(to);
	}

}

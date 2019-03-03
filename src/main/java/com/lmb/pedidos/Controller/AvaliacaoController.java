package com.lmb.pedidos.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lmb.pedidos.dto.BaseReturn;
import com.lmb.pedidos.models.AvaliacaoModal;
import com.lmb.pedidos.services.AvaliacaoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/avaliacao")
public class AvaliacaoController extends BaseReturn{
	
	@Autowired
	private AvaliacaoService avaliacaoService;
	
	
	@PostMapping(value = "/salvar", produces = "application/json")
	public @ResponseBody ResponseEntity save(@RequestBody @Valid AvaliacaoModal avaliacao) {
		try {
			AvaliacaoModal a = avaliacaoService.save(avaliacao);
			return handleResponse(a, "Cadastro realizado com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}
	
	@DeleteMapping(value = "/delete", produces = "application/json")
	public @ResponseBody ResponseEntity delete(@RequestBody @Valid AvaliacaoModal avaliacao) {
		try {
			avaliacaoService.delete(avaliacao);
			return handleResponse("Excluido com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public @ResponseBody ResponseEntity getById(@PathVariable Long id) {
		try {
			AvaliacaoModal avaliacao = avaliacaoService.getById(id);
			return handleResponse(avaliacao);
		} catch (Exception e) {
			return handleError(e);
		}
	}
	
	@GetMapping(value = "/listar")
	public @ResponseBody ResponseEntity findAll() {
		try {
			List<AvaliacaoModal> avaliacao = avaliacaoService.findAll();
			return handleResponse(avaliacao);
		} catch (Exception e) {
			return handleError(e);
		}
	}
	
}

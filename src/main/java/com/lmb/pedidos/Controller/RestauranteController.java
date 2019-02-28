package com.lmb.pedidos.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lmb.pedidos.dto.BaseReturn;
import com.lmb.pedidos.models.RestauranteModel;
import com.lmb.pedidos.services.RestauranteService;

@RestController
@RequestMapping(value = "/restaurante")
public class RestauranteController extends BaseReturn {

	@Autowired
	private RestauranteService restauranteService;

	@PostMapping(value = "/salvar", produces = "application/json")
	public @ResponseBody ResponseEntity save(@RequestBody @Valid RestauranteModel restaurante) {
		try {
			RestauranteModel r = restauranteService.save(restaurante);
			return handleResponse(r, "Cadastro realizado com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@DeleteMapping(value = "/delete", produces = "application/json")
	public @ResponseBody ResponseEntity delete(@RequestBody @Valid RestauranteModel restaurante) {
		try {
			restauranteService.delete(restaurante);
			return handleResponse("Excluido com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public @ResponseBody ResponseEntity getById(@PathVariable Long id) {
		try {
			RestauranteModel restaurante = restauranteService.getById(id);
			return handleResponse(restaurante);
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/listar")
	public @ResponseBody ResponseEntity findAll() {
		try {
			List<RestauranteModel> restaurante = restauranteService.findAll();
			return handleResponse(restaurante);
		} catch (Exception e) {
			return handleError(e);
		}
	}

}

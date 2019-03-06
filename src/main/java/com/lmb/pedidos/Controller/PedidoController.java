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
import com.lmb.pedidos.models.PedidoModel;
import com.lmb.pedidos.services.PedidoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/pedido")
public class PedidoController extends BaseReturn {

	@Autowired
	private PedidoService pedidoService;

	@PostMapping(value = "/salvar", produces = "application/json")
	public @ResponseBody ResponseEntity save(@RequestBody @Valid PedidoModel pedido) {
		try {
			PedidoModel p = pedidoService.save(pedido);
			return handleResponse(p, "Pedido realizado com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@DeleteMapping(value = "/delete", produces = "application/json")
	public @ResponseBody ResponseEntity delete(@RequestBody @Valid PedidoModel pedido) {
		try {
			pedidoService.delete(pedido);
			return handleResponse("Excluido com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public @ResponseBody ResponseEntity getById(@PathVariable Long id) {
		try {
			PedidoModel pedido = pedidoService.getById(id);
			return handleResponse(pedido);
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/listar")
	public @ResponseBody ResponseEntity findAll() {
		try {
			List<PedidoModel> pedidos = pedidoService.findAll();
			return handleResponse(pedidos);
		} catch (Exception e) {
			return handleError(e);
		}
	}

}

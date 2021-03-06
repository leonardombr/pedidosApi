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
import com.lmb.pedidos.models.ItensPedido;
import com.lmb.pedidos.services.ItemPedidoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/itemPedido")
public class ItemPedidoController extends BaseReturn {

	@Autowired
	private ItemPedidoService itemPedidoService;

	@PostMapping(value = "/salvar", produces = "application/json")
	public @ResponseBody ResponseEntity salvar(@RequestBody @Valid ItensPedido itemPagamento) {
		try {
			ItensPedido item = itemPedidoService.save(itemPagamento);
			return handleResponse(item, "Cadastro realizado com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@DeleteMapping(value = "/delete", produces = "application/json")
	public @ResponseBody ResponseEntity delete(@RequestBody @Valid ItensPedido itemPagamento) {
		try {
			itemPedidoService.delete(itemPagamento);
			return handleResponse("Excluido com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public @ResponseBody ResponseEntity getById(@PathVariable Long id) {
		try {
			ItensPedido item = itemPedidoService.getById(id);
			return handleResponse(item);
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/listar")
	public @ResponseBody ResponseEntity findAll() {
		try {
			List<ItensPedido> itens = itemPedidoService.findAll();
			return handleResponse(itens);
		} catch (Exception e) {
			return handleError(e);
		}
	}

}

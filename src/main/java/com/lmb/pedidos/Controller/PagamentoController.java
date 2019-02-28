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
import com.lmb.pedidos.models.PagamentoModel;
import com.lmb.pedidos.services.PagamentoService;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoController extends BaseReturn {

	@Autowired
	private PagamentoService pagamentoService;

	@PostMapping(value = "/salvar", produces = "application/json")
	public @ResponseBody ResponseEntity save(@RequestBody @Valid PagamentoModel pagamento) {
		try {
			PagamentoModel p = pagamentoService.save(pagamento);
			return handleResponse(p, "Cadastro realizado com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@DeleteMapping(value = "/delete", produces = "application/json")
	public @ResponseBody ResponseEntity delete(@RequestBody @Valid PagamentoModel pagamento) {
		try {
			pagamentoService.delete(pagamento);
			return handleResponse("Excluido com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public @ResponseBody ResponseEntity getById(@PathVariable Long id) {
		try {
			PagamentoModel pagamento = pagamentoService.getById(id);
			return handleResponse(pagamento);
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/listar")
	public @ResponseBody ResponseEntity findAll() {
		try {
			List<PagamentoModel> pagamentos = pagamentoService.findAll();
			return handleResponse(pagamentos);
		} catch (Exception e) {
			return handleError(e);
		}
	}

}

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
import com.lmb.pedidos.models.MenuModel;
import com.lmb.pedidos.services.MenuService;

@RestController
@CrossOrigin
@RequestMapping(value = "/menu")
public class MenuController extends BaseReturn {

	@Autowired
	private MenuService menuService;

	@PostMapping(value = "/salvar", produces = "application/json")
	public @ResponseBody ResponseEntity save(@RequestBody @Valid MenuModel menu) {
		try {
			MenuModel m = menuService.save(menu);
			return handleResponse(m, "Cadastro realizado com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@DeleteMapping(value = "/delete", produces = "application/json")
	public @ResponseBody ResponseEntity delete(@RequestBody @Valid MenuModel menu) {
		try {
			menuService.delete(menu);
			return handleResponse("Excluido com sucesso!");
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public @ResponseBody ResponseEntity getById(@PathVariable Long id) {
		try {
			MenuModel menu = menuService.getById(id);
			return handleResponse(menu);
		} catch (Exception e) {
			return handleError(e);
		}
	}

	@GetMapping(value = "/listar")
	public @ResponseBody ResponseEntity findAll() {
		try {
			List<MenuModel> menu = menuService.findAll();
			return handleResponse(menu);
		} catch (Exception e) {
			return handleError(e);
		}
	}

}

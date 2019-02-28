package com.lmb.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmb.pedidos.models.MenuModel;
import com.lmb.pedidos.models.PagamentoModel;
import com.lmb.pedidos.repositorys.PagamentoReposytory;

@Service
public class PagamentoService {

	@Autowired
	private PagamentoReposytory pagamentoRepository;
	
	public PagamentoModel save(PagamentoModel pagamento) throws Exception{
		try {
			return pagamentoRepository.save(pagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public void delete(PagamentoModel pagamento) throws Exception{
		try {
			pagamentoRepository.delete(pagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public PagamentoModel getById(Long id) throws Exception{
		try {
			return pagamentoRepository.getOne(id);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<PagamentoModel> findAll() throws Exception{
		try {
			return pagamentoRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}

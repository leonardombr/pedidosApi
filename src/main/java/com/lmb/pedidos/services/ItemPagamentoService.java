package com.lmb.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmb.pedidos.models.ItensPagamento;
import com.lmb.pedidos.repositorys.ItemPagamentoRepository;

@Service
public class ItemPagamentoService {
	
	@Autowired
	private ItemPagamentoRepository itemPagamentoRepository;
	
	
	public ItensPagamento save(ItensPagamento itemPagamento) throws Exception{
		try {
			return itemPagamentoRepository.save(itemPagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public void delete(ItensPagamento itemPagamento) throws Exception{
		try {
			itemPagamentoRepository.delete(itemPagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public ItensPagamento getById(Long id) throws Exception{
		try {
			return itemPagamentoRepository.getOne(id);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<ItensPagamento> findAll() throws Exception{
		try {
			return itemPagamentoRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
}

package com.lmb.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmb.pedidos.models.ItensPedido;
import com.lmb.pedidos.repositorys.ItemPedidoRepository;

@Service
public class ItemPedidoService {
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	
	public ItensPedido save(ItensPedido itemPagamento) throws Exception{
		try {
			return itemPedidoRepository.save(itemPagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public void delete(ItensPedido itemPagamento) throws Exception{
		try {
			itemPedidoRepository.delete(itemPagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public ItensPedido getById(Long id) throws Exception{
		try {
			return itemPedidoRepository.getOne(id);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<ItensPedido> findAll() throws Exception{
		try {
			return itemPedidoRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
}

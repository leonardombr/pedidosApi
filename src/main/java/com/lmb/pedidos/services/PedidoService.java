package com.lmb.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmb.pedidos.models.MenuModel;
import com.lmb.pedidos.models.PedidoModel;
import com.lmb.pedidos.repositorys.PedidoReposytory;

@Service
public class PedidoService {

	@Autowired
	private PedidoReposytory pedidoRepository;
	
	
	
	public PedidoModel save(PedidoModel pedido) throws Exception{
		try {
			pedido.getListItemPedido().forEach(itemPedido -> itemPedido.setPedido(pedido));
			PedidoModel p = pedidoRepository.save(pedido);
			return p;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public void delete(PedidoModel pedido) throws Exception{
		try {
			pedidoRepository.delete(pedido);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public PedidoModel getById(Long id) throws Exception{
		try {
			return pedidoRepository.getOne(id);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<PedidoModel> findAll() throws Exception{
		try {
			return pedidoRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}

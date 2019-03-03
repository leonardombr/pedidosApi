package com.lmb.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmb.pedidos.models.AvaliacaoModal;
import com.lmb.pedidos.repositorys.AvaliacaoRepository;

@Service
public class AvaliacaoService {
	
	@Autowired
	private AvaliacaoRepository avaliacaoRepository;
	
	public AvaliacaoModal save(AvaliacaoModal avaliacao) throws Exception{
		try {
			return avaliacaoRepository.save(avaliacao);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public void delete(AvaliacaoModal avaliacao) throws Exception{
		try {
			avaliacaoRepository.delete(avaliacao);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public AvaliacaoModal getById(Long id) throws Exception{
		try {
			return avaliacaoRepository.getOne(id);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<AvaliacaoModal> findAll() throws Exception{
		try {
			return avaliacaoRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<AvaliacaoModal> findAvaliacaoByRestaurant(Long idRestaurant) throws Exception{
		try {
			List<AvaliacaoModal> listaAvaliacao = avaliacaoRepository.findAllByRestaurant(idRestaurant);
			return listaAvaliacao;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

}

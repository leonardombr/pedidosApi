package com.lmb.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmb.pedidos.models.RestauranteModel;
import com.lmb.pedidos.repositorys.RestauranteRepository;

@Service
public class RestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	public RestauranteModel save(RestauranteModel restaurante) throws Exception{
		try {
			return restauranteRepository.save(restaurante);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public void delete(RestauranteModel restaurante) throws Exception{
		try {
			restauranteRepository.delete(restaurante);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public RestauranteModel getById(Long id) throws Exception{
		try {
			return restauranteRepository.getOne(id);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<RestauranteModel> findAll() throws Exception{
		try {
			return restauranteRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}

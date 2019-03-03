package com.lmb.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmb.pedidos.models.MenuModel;
import com.lmb.pedidos.repositorys.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;
	
	public MenuModel save(MenuModel menu) throws Exception{
		try {
			return menuRepository.save(menu);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public void delete(MenuModel menu) throws Exception{
		try {
			menuRepository.delete(menu);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public MenuModel getById(Long id) throws Exception{
		try {
			return menuRepository.getOne(id);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<MenuModel> findAll() throws Exception{
		try {
			return menuRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}
	
	public List<MenuModel> findMenuByRestaurant(Long idRestaurant) throws Exception{
		try {
			List<MenuModel> listMenu = menuRepository.findAllByRestaurant(idRestaurant);
			return listMenu;
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}
	
}

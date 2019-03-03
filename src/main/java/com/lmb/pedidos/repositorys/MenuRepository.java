package com.lmb.pedidos.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lmb.pedidos.models.MenuModel;

@Repository
public interface MenuRepository extends JpaRepository<MenuModel, Long>{

	@Query(value = "select m.id, m.descricao, m.image_path, m.nome, m.preco, m.id_restaurante from menu as m where m.id_restaurante = :idRestaurant", nativeQuery = true)
	public List<MenuModel> findAllByRestaurant(@Param("idRestaurant") Long idRestaurant);
}

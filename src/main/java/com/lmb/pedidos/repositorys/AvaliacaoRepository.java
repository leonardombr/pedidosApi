package com.lmb.pedidos.repositorys;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lmb.pedidos.models.AvaliacaoModal;

@Repository
public interface AvaliacaoRepository extends JpaRepository<AvaliacaoModal, Long>{

	@Query(value = "select id, avaliacao, comentario, data, nome, id_restaurante from avaliacao where id_restaurante = :idRestaurant", nativeQuery = true)
	public List<AvaliacaoModal> findAllByRestaurant(@PathParam("IdRestaurant") Long idRestaurant);
}

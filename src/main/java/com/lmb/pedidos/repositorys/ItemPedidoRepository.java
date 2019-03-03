package com.lmb.pedidos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmb.pedidos.models.ItensPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItensPedido, Long>{

}

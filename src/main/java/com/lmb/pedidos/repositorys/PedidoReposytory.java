package com.lmb.pedidos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmb.pedidos.models.PedidoModel;

@Repository
public interface PedidoReposytory extends JpaRepository<PedidoModel, Long>{

}

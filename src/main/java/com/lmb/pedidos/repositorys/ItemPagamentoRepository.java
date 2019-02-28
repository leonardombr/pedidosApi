package com.lmb.pedidos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmb.pedidos.models.ItensPagamento;

@Repository
public interface ItemPagamentoRepository extends JpaRepository<ItensPagamento, Long>{

}

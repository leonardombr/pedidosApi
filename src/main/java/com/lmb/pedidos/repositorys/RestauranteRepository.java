package com.lmb.pedidos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmb.pedidos.models.RestauranteModel;

@Repository
public interface RestauranteRepository extends JpaRepository<RestauranteModel, Long>{

}

package com.lmb.pedidos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmb.pedidos.models.MenuModel;

@Repository
public interface MenuRepository extends JpaRepository<MenuModel, Long>{


}

package com.deliverfood.dao;

import com.deliverfood.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long>{

}

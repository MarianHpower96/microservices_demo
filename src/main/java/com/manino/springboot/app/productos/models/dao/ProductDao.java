package com.manino.springboot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.manino.springboot.app.productos.models.entity.Producto;

public interface ProductDao extends CrudRepository<Producto, Long>{

}

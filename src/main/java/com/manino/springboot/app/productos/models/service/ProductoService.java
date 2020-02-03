package com.manino.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manino.springboot.app.productos.models.dao.ProductDao;
import com.manino.springboot.app.productos.models.entity.Producto;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private ProductDao productDao;
		
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productDao.findById(id).orElse(null);
	}
	
}

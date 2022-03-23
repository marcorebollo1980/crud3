package com.crud3.co.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud3.co.entity.Producto;
import com.crud3.co.repository.ProductoRepository;

@Service
@Transactional
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	
	public List<Producto> list(){
		return productoRepository.findAll();
	}
	
	public Optional<Producto> getOne(Integer id){
		return productoRepository.findById(id);
	}
	
	public Optional<Producto> getByNombre(String nombre){
		return productoRepository.findByNombre(nombre);
	}
	
	public void save(Producto producto){
		productoRepository.save(producto);
	}
	
	public void  delete(Integer id){
		 productoRepository.deleteById(id);
	}
	
	public boolean exitsById(Integer id){
		return productoRepository.existsById(id);
	}

	public boolean getByNombre(boolean blank) {
		return false;
	}
	
	

}

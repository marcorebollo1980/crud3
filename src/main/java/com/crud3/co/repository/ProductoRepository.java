package com.crud3.co.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud3.co.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	
	Optional<Producto> findByNombre(String nombre);
	

}

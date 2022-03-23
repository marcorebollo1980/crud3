package com.crud3.co.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductoDto {
	
	@NotBlank
	private String nombre;
	
	@Min(0)
	private Float  precio;
	
	public ProductoDto() {
	}
	
	public ProductoDto(String nombre, Float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	

}

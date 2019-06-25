package com.example.demo.entities;
// Generated 25/06/2019 04:43:50 PM by Hibernate Tools 5.3.0.Beta2

/**
 * Producto generated by hbm2java
 */
public class Producto implements java.io.Serializable {

	private Integer idProducto;
	private Proveedor proveedor;
	private String descripcion;
	private Float precio;

	public Producto() {
	}

	public Producto(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Producto(Proveedor proveedor, String descripcion, Float precio) {
		this.proveedor = proveedor;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
		return this.precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

}

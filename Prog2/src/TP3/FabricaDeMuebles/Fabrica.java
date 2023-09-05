package TP3.FabricaDeMuebles;

import java.util.ArrayList;

public class Fabrica {

	private ArrayList<Producto> Productos;
	
	public Fabrica() {
		this.Productos = new ArrayList<>();
	}
	
	public void addProducto(Producto nuevo) {
		if(!this.Productos.contains(nuevo)) {
			this.Productos.add(nuevo);
		}
		else {
			System.out.println("Ya se encuentra añadido.");
		}
	}
	
	public void removeProducto(Producto existente) {
		if(this.Productos.contains(existente)) {
			this.Productos.remove(existente);
		}
		else {
			System.out.println("No puede remover un producto que no existe.");
		}
	}
	
	public int getStock() {
		return Productos.size();
	}
	
	public int getCostoFabAll() {
		int costo = 0;
		for(Producto p : Productos) {
			costo += p.getCostoFab();
		}
		return costo;
	}
	
	public int getCostoVentaAll() {
		int costo = 0;
		for(Producto p : Productos) {
			costo += p.getValorVenta();
		}
		return costo;
	}
	
}

	

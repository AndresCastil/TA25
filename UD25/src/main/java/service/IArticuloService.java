package service;

import java.util.List;

import dto.Articulo;

public interface IArticuloService {
	
	public List<Articulo> totalArticulos();
	public Articulo guardArticulo(Articulo arti);
	public Articulo actualizaArticulo(Articulo arti);
	public Articulo localizaPorID(int id);
	public void eliminaArticulo(int id);

}

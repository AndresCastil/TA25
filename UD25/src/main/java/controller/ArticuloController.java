package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import service.ArticuloServiceImpl;
import dto.Articulo;

/**
 * 
 * @author Adriana
 *
 */
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl ArticuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> totalArticulo(){
		return ArticuloServiceImpl.totalArticulos();
	}
	
	@GetMapping("/articulos/{id}")
	public Articulo localizaPorID(@PathVariable (name = "id") int id) {
		return ArticuloServiceImpl.localizaPorID(id);
	}
	
	@PostMapping("/articulos/add")
	public Articulo guardaArticulo(@RequestBody Articulo arti) {
		return ArticuloServiceImpl.guardArticulo(arti);
	}
	
	@PutMapping("/articulos/{id}/actualiza")
	public Articulo actualizaArticulo(@PathVariable (name = "id") int id, @RequestBody Articulo arti) {
		Articulo artiSel = new Articulo();
		Articulo artiActualizado = new Articulo();
		
		artiSel = ArticuloServiceImpl.localizaPorID(id);
		artiSel.setNombre(arti.getNombre());
		artiSel.setPrecio(arti.getPrecio());
		artiSel.setFabricante(arti.getFabricante());
		
		artiActualizado = artiSel;
		
		return artiActualizado;
	}
	
	@DeleteMapping("/articulos/{id}/elimina")
	public void eliminaArticulo(@PathVariable (name = "id") int id) {
		ArticuloServiceImpl.eliminaArticulo(id);
	}
	
	
}

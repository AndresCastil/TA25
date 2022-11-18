package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IArticuloDAO;
import dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDAO articuloDAO;

	@Override
	public List<Articulo> totalArticulos() {
		
		return articuloDAO.findAll();
	}

	@Override
	public Articulo guardArticulo(Articulo arti) {
		return articuloDAO.save(arti);
	}

	@Override
	public Articulo actualizaArticulo(Articulo arti) {
		return articuloDAO.save(arti);
	}

	@Override
	public Articulo localizaPorID(int id) {
		return articuloDAO.findById(id).get();
	}

	@Override
	public void eliminaArticulo(int id) {
		articuloDAO.deleteById(id);
	}
	
}

package service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import dao.IFabricanteDAO;
import dto.Fabricante;


@Service
public class FabricanteServiceImpl implements IFabricanteService {
	@Autowired  
	IFabricanteDAO fabricanteDAO;

	@Override
	public List<Fabricante> totalFabricante() {
		
		return fabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardaFabricantes(Fabricante fab) {
		
		return fabricanteDAO.save(fab);
	}

	@Override
	public Fabricante actualizaFabricantes(Fabricante fab) {
		
		return fabricanteDAO.save(fab);
	}

	@Override
	public Fabricante localizaPorID(int id) {
		
		return fabricanteDAO.findById(id).get();
	}

	@Override
	public void eliminaFabricante(int id) {
		
		fabricanteDAO.deleteById(id);
	} 

}

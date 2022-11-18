package service;
import java.util.List;

import dto.Fabricante;

public interface IFabricanteService {
	
	public List<Fabricante> totalFabricante();
	public Fabricante guardaFabricantes(Fabricante fab);
	public Fabricante actualizaFabricantes(Fabricante fab);
	public Fabricante localizaPorID(int id);
	public void eliminaFabricante(int id);

}

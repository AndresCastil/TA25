package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import dto.Fabricante;
import service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl FabService;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> totalFabricantes(){
		return FabService.totalFabricante();
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante localizaPorID(@PathVariable (name = "id") int id) {
		Fabricante fabricante = new Fabricante();
		fabricante = FabService.localizaPorID(id);
		return fabricante;
	}
	
	@PostMapping("/fabricantes/add")  
	public Fabricante guardaFabricantes(@RequestBody Fabricante fabricante) {
		return FabService.guardaFabricantes(fabricante);
	}
	
	@PutMapping("/fabricante/{id}/actualiza")
	public Fabricante actualizaFabricante(@PathVariable (name = "id") int id, @RequestBody Fabricante fab) {
		Fabricante fabSel = new Fabricante();
		Fabricante fabActualiza = new Fabricante();
		
		fabSel = FabService.localizaPorID(id);
		fabSel.setNombre(fab.getNombre());
		
		fabActualiza = fabSel;
		
		return fabActualiza;
	}
	
	@DeleteMapping("/fabricante/{id}/elimina")
	public void eliminaFabricantes(@PathVariable (name = "id") int id) {
		FabService.eliminaFabricante(id);
	}
	
	
	
}

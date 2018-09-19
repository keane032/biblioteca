package ufc.npi.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufc.npi.biblioteca.model.Livro;
import ufc.npi.biblioteca.repository.LivroRepository;
import ufc.npi.biblioteca.service.LivroService;

@RestController
@RequestMapping(value="/app")
public class LivroController {
	
	@Autowired
	private LivroService rep;
	
	@GetMapping("/listar")
	public List<Livro> listarLivro() {
		return rep.listarLivro();
	}
	
	@PostMapping("/livro")
	public Livro adicionar(@RequestBody Livro livro) {
		return rep.adicionar(livro);
	}
	
	@DeleteMapping("/livro")
	public void deletar(@RequestBody Livro livro) {
		 rep.deletar(livro);
	}
	
	@PutMapping("/livro")
	public Livro atualizar(@RequestBody Livro livro) {
		return rep.atualizar(livro);
	}
	
}

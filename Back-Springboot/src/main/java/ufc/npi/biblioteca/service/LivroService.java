package ufc.npi.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import ufc.npi.biblioteca.model.Livro;
import ufc.npi.biblioteca.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository rep;
	
	
	public List<Livro> listarLivro() {
		return rep.findAll();
	}
	
	public Livro adicionar(@RequestBody Livro livro) {
		return rep.save(livro);
	}
	
	public void deletar(@RequestBody Livro livro) {
		 rep.delete(livro);
	}
	
	public Livro atualizar(@RequestBody Livro livro) {
		return rep.save(livro);
	}
	
	
}

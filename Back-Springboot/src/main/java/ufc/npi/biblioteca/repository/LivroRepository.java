package ufc.npi.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ufc.npi.biblioteca.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{}

package br.com.douglasfreire.testeconcrete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.douglasfreire.testeconcrete.entities.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{

}

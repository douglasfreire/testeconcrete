package com.douglasfreire.testeconcrete.repositories;

import com.douglasfreire.testeconcrete.entities.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
}

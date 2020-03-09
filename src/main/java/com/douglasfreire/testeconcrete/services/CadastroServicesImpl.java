package com.douglasfreire.testeconcrete.services;

import com.douglasfreire.testeconcrete.entities.Cadastro;
import com.douglasfreire.testeconcrete.repositories.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroServicesImpl implements CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    public CadastroServicesImpl(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    @Override
    public Cadastro create(Cadastro cadastro) {
        return this.cadastroRepository.save(cadastro);
    }
}

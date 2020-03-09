package br.com.douglasfreire.testeconcrete.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.douglasfreire.testeconcrete.entities.Cadastro;
import br.com.douglasfreire.testeconcrete.repositories.CadastroRepository;

@Service
public class CadastroServicesImpl implements CadastroService{
	
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

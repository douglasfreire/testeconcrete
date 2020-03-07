package br.com.douglasfreire.testeconcrete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.douglasfreire.testeconcrete.entities.Cadastro;
import br.com.douglasfreire.testeconcrete.services.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
	
	@Autowired
	private CadastroService cadastroService;
	
	public CadastroController(CadastroService cadastroService) {
		this.cadastroService = cadastroService;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PostMapping
	public Cadastro create(@RequestBody Cadastro cadastro) {
		return this.cadastroService.create(cadastro);
	}

}

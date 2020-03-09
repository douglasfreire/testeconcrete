package com.douglasfreire.testeconcrete.controllers;


import com.douglasfreire.testeconcrete.entities.Cadastro;
import com.douglasfreire.testeconcrete.services.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

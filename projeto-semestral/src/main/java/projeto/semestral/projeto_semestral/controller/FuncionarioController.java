package projeto.semestral.projeto_semestral.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import projeto.semestral.projeto_semestral.domain.Funcionario;
import projeto.semestral.projeto_semestral.service.FuncionarioService;

import java.util.List;

@RestController
@RequestMapping("v1/funcionarios")
@RequiredArgsConstructor
public class FuncionarioController {

    private final FuncionarioService service;

    @GetMapping
    public List<Funcionario> findAll(){

        return service.findAll();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Funcionario save(@RequestBody Funcionario funcionario){

        return service.save(funcionario);
    }


}

package projeto.semestral.projeto_semestral.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.semestral.projeto_semestral.domain.Cliente;
import projeto.semestral.projeto_semestral.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("v1/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @GetMapping
    public List<Cliente> findAll(){

        return service.findAll();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente save(@RequestBody Cliente cliente){

        return service.save(cliente);
    }


}

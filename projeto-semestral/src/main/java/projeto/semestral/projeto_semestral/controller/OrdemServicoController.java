package projeto.semestral.projeto_semestral.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.semestral.projeto_semestral.domain.Cliente;
import projeto.semestral.projeto_semestral.domain.OrdemServico;
import projeto.semestral.projeto_semestral.dto.response.GetOrdemServicoResponse;
import projeto.semestral.projeto_semestral.mapper.OrdemServicoMapper;
import projeto.semestral.projeto_semestral.service.OrdemServicoService;

import java.util.List;

@RestController
@RequestMapping("v1/ordem-servicos")
@RequiredArgsConstructor
@Slf4j
public class OrdemServicoController {

    private final OrdemServicoService service;
    private final OrdemServicoMapper mapper;

    @GetMapping
    public ResponseEntity<List<GetOrdemServicoResponse>> findAll(){

        var requestFindAll = service.findAll();

        var responseFindAll = mapper.getOrdemServicoList(requestFindAll);

        return ResponseEntity.ok(responseFindAll);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrdemServico save(@RequestBody OrdemServico ordemServico){

        return service.save(ordemServico);
    }
}

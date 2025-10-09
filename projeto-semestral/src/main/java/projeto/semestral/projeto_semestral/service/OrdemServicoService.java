package projeto.semestral.projeto_semestral.service;

import projeto.semestral.projeto_semestral.domain.OrdemServico;
import projeto.semestral.projeto_semestral.repository.OrdemServicoRepository;

import java.util.List;

public class OrdemServicoService {

    private OrdemServicoRepository repository;

    public List<OrdemServico> findAll(){

        return repository.findAll();
    }

}

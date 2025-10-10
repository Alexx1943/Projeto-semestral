package projeto.semestral.projeto_semestral.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import projeto.semestral.projeto_semestral.domain.OrdemServico;
import projeto.semestral.projeto_semestral.repository.OrdemServicoRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdemServicoService {

    private final OrdemServicoRepository repository;

    public List<OrdemServico> findAll() {

        return repository.findAll();
    }

    public OrdemServico findById(Long id) {

        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ordem de serviço não encontrada"));
    }

    public OrdemServico save(OrdemServico ordemServico) {

        ordemServico.setDataCriacao(LocalDateTime.now());
        ordemServico.setDataAlteracao(LocalDateTime.now());

        return repository.save(ordemServico);
    }

    public OrdemServico update(OrdemServico ordemServico) {

        var existente = findById(ordemServico.getId());

        ordemServico.setDataCriacao(existente.getDataCriacao());
        ordemServico.setDataAlteracao(LocalDateTime.now());

        return repository.save(ordemServico);
    }


    public void delete(Long id) {

        var ordemTodelete = findById(id);

        repository.deleteById(id);
    }

    public void deleteAll() {

        repository.deleteAll();
    }


}

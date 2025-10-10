package projeto.semestral.projeto_semestral.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import projeto.semestral.projeto_semestral.domain.Cliente;
import projeto.semestral.projeto_semestral.repository.ClienteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public List<Cliente> findAll(){
        return repository.findAll();
    }

    public Cliente save(Cliente cliente){

        return repository.save(cliente);
    }
}

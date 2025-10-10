package projeto.semestral.projeto_semestral.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import projeto.semestral.projeto_semestral.domain.Funcionario;
import projeto.semestral.projeto_semestral.repository.FuncionarioRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public List<Funcionario> findAll(){
        return repository.findAll();
    }

    public Funcionario save(Funcionario funcionario){

        return repository.save(funcionario);
    }
}

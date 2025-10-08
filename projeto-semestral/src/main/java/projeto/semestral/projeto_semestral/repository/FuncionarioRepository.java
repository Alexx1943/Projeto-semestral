package projeto.semestral.projeto_semestral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.semestral.projeto_semestral.domain.Cliente;
import projeto.semestral.projeto_semestral.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    
}

package projeto.semestral.projeto_semestral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.semestral.projeto_semestral.domain.Funcionario;
import projeto.semestral.projeto_semestral.domain.OrdemServico;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {

    
}

package projeto.semestral.projeto_semestral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.semestral.projeto_semestral.domain.ClienteOrdemServico;
import projeto.semestral.projeto_semestral.domain.FuncionarioOrdemServico;

public interface FuncionarioOrdemServicoRepository extends JpaRepository<FuncionarioOrdemServico, Long> {


}

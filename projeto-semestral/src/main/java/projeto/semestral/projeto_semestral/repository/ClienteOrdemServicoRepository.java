package projeto.semestral.projeto_semestral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.semestral.projeto_semestral.domain.Cliente;
import projeto.semestral.projeto_semestral.domain.ClienteOrdemServico;

public interface ClienteOrdemServicoRepository extends JpaRepository<ClienteOrdemServico, Long> {


}

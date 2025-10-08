package projeto.semestral.projeto_semestral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.semestral.projeto_semestral.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}

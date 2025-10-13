package projeto.semestral.projeto_semestral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import projeto.semestral.projeto_semestral.domain.OrdemServico;

import java.util.List;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {


//    @Query("SELECT up  FROM UserProfile up join fetch up.user u join fetch up.profile p")


//    @Query("SELECT DISTINCT os FROM OrdemServico os " +
//            "LEFT JOIN FETCH os.servicos")
//    List<OrdemServico> retrieve();


}

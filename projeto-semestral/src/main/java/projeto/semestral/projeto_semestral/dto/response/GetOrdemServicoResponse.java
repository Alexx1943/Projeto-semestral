package projeto.semestral.projeto_semestral.dto.response;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
public class GetOrdemServicoResponse {

    public record FuncionarioRecord(Long id, String name){}
    public record ClienteRecord(Long id, String name){}

    private FuncionarioRecord funcionario;
    private ClienteRecord cliente;
    private Long id;
    private String descricao;
    private Double valorServico;
    private LocalDateTime dataCriacao;
}

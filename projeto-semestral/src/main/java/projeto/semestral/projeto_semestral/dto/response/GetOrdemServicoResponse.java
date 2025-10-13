package projeto.semestral.projeto_semestral.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@Builder
public class GetOrdemServicoResponse {

    public record FuncionarioRecord(Long id, String name) {}

    public record ClienteRecord(Long id, String name, String cpf) {}

    public record ServicoRecord(Long id, String servico, Double valorServico, Integer quantidade) {}

    private FuncionarioRecord funcionario;
    private ClienteRecord cliente;
    private List<ServicoRecord> servicos;
    private Long id;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
}

package projeto.semestral.projeto_semestral.domain;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FuncionarioOrdemServico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne(optional = false)
    private Funcionario funcionario;

    @ManyToOne(optional = false)
    private OrdemServico ordemServico;
}

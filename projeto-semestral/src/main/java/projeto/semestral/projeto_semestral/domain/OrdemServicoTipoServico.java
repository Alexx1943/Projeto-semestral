package projeto.semestral.projeto_semestral.domain;


import jakarta.persistence.*;
import lombok.*;

@With
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrdemServicoTipoServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne(optional = false)
    private OrdemServico ordemServico;

    @ManyToOne(optional = false)
    private TipoServico tipoServico;
}

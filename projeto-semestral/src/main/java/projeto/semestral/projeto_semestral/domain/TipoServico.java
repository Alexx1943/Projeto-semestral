package projeto.semestral.projeto_semestral.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class TipoServico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ordem_servico_id")
    @JsonBackReference
    private OrdemServico ordemServico;

    @Column
    private String servico;

    @Column
    private Double valorServico;

    @Column
    private Integer quantidade;
}

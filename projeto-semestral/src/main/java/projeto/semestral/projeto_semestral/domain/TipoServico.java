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
public class TipoServico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column
    private String servico;

    @Column
    private Double valorServico;

    @Column
    private Integer quantidade;
}

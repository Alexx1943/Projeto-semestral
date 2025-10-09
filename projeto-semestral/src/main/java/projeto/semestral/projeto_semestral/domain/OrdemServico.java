package projeto.semestral.projeto_semestral.domain;

import jakarta.persistence.*;
import lombok.*;
import projeto.semestral.projeto_semestral.domain.enumeracao.ServicosDisponiveis;

import java.time.LocalDateTime;

@With
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne(optional = false)
    private Funcionario funcionario;

    @ManyToOne(optional = false)
    private Cliente cliente;

    @Column
    private String descricao;

    @Column
    private Double valorServico;

    @Enumerated(EnumType.STRING)
    private ServicosDisponiveis servicosDisponiveis;


    @Column(updatable = false)
    private LocalDateTime dataCriacao;

    @Column(updatable = true)
    private LocalDateTime dataAlteracao;

}

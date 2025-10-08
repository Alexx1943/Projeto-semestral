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
public class Funcionario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column
    private String name;

    @Column
    private String cpf;

    @Column
    private Cliente cliente;
}

package projeto.semestral.projeto_semestral.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

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

//    @ManyToOne(optional = false)
//    private Funcionario funcionario;

    @ManyToOne(optional = false)
    private Cliente cliente;

    @Column
    private String descricao;

//    @Column
//    private Double valorServico;

    @Transient
    private List<TipoServico> servicos;

    @OneToMany(mappedBy = "ordemServico", cascade = CascadeType.ALL)
    private List<OrdemServicoTipoServico> ordemServicoTipoServicos;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dataCriacao;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dataAlteracao;

}

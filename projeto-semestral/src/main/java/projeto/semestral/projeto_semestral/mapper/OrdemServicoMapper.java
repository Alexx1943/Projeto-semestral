package projeto.semestral.projeto_semestral.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import projeto.semestral.projeto_semestral.domain.OrdemServico;
import projeto.semestral.projeto_semestral.dto.response.GetOrdemServicoResponse;

import java.util.List;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrdemServicoMapper {

    List<GetOrdemServicoResponse> getOrdemServicoList(List<OrdemServico> ordemServicos);

    GetOrdemServicoResponse getOrdemServico(OrdemServico ordemServico);
}

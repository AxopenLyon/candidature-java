package fr.axopen.candidature.mapper;

import fr.axopen.candidature.bo.Chantier;
import fr.axopen.candidature.dto.ChantierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ChantierMapper {
    ChantierDTO chantierToChantierDTO(Chantier chantier);
    List<ChantierDTO> chantierToChantierDTO(List<Chantier> chantiers);
}

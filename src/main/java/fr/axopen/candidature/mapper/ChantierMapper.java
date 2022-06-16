package fr.axopen.candidature.mapper;

import fr.axopen.candidature.bo.Chantier;
import fr.axopen.candidature.dto.ChantierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ChantierMapper {
    ChantierDTO chantierToChantierDTO(Chantier chantier);
}

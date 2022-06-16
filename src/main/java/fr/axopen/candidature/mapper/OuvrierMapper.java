package fr.axopen.candidature.mapper;

import fr.axopen.candidature.bo.Ouvrier;
import fr.axopen.candidature.dto.OuvrierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OuvrierMapper {
    OuvrierDTO ouvrierToOuvrierDTO(Ouvrier ouvrier);
}

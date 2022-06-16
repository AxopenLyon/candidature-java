package fr.axopen.candidature.mapper;

import fr.axopen.candidature.bo.Depense;
import fr.axopen.candidature.dto.DepenseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DepenseMapper {
    DepenseDTO depenseToDepenseDTO(Depense depense);
}

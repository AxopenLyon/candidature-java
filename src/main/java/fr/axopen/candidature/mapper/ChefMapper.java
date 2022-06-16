package fr.axopen.candidature.mapper;

import fr.axopen.candidature.bo.Chef;
import fr.axopen.candidature.dto.ChefDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ChefMapper {
    ChefDTO chefToChefDTO(Chef chef);
}

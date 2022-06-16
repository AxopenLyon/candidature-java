package fr.axopen.candidature.mapper;

import fr.axopen.candidature.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {
    UserDTO userToUserDTO(UserDTO user);
}

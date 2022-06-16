package fr.axopen.candidature.mapper;

import fr.axopen.candidature.bo.Journal;
import fr.axopen.candidature.dto.JournalDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface JournalMapper {
    JournalDTO journalToJournalDTO(Journal journal);
}

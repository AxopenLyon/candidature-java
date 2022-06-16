package fr.axopen.candidature.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OuvrierDTO {
    private Long id;
    private Long numero_chantier;
    private Long matricule_user;
    private String matricule;
    private Boolean unbind;
}

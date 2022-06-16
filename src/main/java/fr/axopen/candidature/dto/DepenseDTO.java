package fr.axopen.candidature.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepenseDTO implements Serializable {
    private Long id;
    private Long id_journal_chantier;
    private Long id_ouvrier_chantier;
    private Integer quart_dheures_jour;
    private Integer quart_dheures_nuit;
    private Boolean voiture;
    private Boolean sent;
}

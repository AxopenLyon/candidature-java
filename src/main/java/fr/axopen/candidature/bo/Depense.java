package fr.axopen.candidature.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "depense_main_doeuvre")
public class Depense {
    @Id
    private Long id;
    private Long id_journal_chantier;
    private Long id_ouvrier_chantier;
    private Integer quart_dheures_jour;
    private Integer quart_dheures_nuit;
    private Boolean voiture;
    private Boolean sent;
}

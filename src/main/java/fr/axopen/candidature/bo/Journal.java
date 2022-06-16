package fr.axopen.candidature.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "journal_chantier")
public class Journal {
    @Id
    private Long id;
    private Long numero_chantier;
    private Date date;
    private Integer temperature_matin;
    private Integer temperature_soir;
    private Boolean moe_generated;
    private Boolean materiel_generated;
    private String note;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_journal_chantier", updatable = false)
    private List<Depense> depenses;
}

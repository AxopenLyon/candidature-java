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
@Table(name = "chantier")
public class Chantier {
    @Id
    private Long numero;
    private String description;
    private String city;
    private Long city_cp;
    private Date date_debut;
    private Date date_fin;
    private String status;
    private String lien_sharepoint;
    private String lien_files;
    private String lien_gearth;
    private Double prix_moyen_moe_jour;
    private Double prix_moyen_moe_nuit;
    private Double prix_moyen_materiel;
    private String journal_pointage_erp;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "numero_chantier", updatable = false)
    private List<Ouvrier> ouvriers;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "numero_chantier", updatable = false)
    private List<Chef> chefs;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "numero_chantier", updatable = false)
    private List<Journal> journaux;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "numero_latest_chantier", updatable = false)
    private List<User> users;
}

package fr.axopen.candidature.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChantierDTO implements Serializable {
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

    private List<OuvrierDTO> ouvriers;
    private List<ChefDTO> chefs;
    private List<JournalDTO> journaux;
    private List<UserDTO> users;
}

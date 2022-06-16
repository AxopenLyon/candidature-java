package fr.axopen.candidature.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JournalDTO implements Serializable {
    private Long id;
    private Long numero_chantier;
    private Date date;
    private Integer temperature_matin;
    private Integer temperature_soir;
    private Boolean moe_generated;
    private Boolean materiel_generated;
    private String note;

    private List<DepenseDTO> depenses;
}

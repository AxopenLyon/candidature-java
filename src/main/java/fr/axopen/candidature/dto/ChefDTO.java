package fr.axopen.candidature.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChefDTO implements Serializable {
    private Long numero_chantier;
    private Long matricule_user;
}

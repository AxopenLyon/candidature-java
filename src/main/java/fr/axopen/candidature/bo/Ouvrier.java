package fr.axopen.candidature.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ouvrier_chantier")
public class Ouvrier {
    @Id
    private Long id;
    private Long numero_chantier;
    private Long matricule_user;
    private String matricule;
    private Boolean unbind;
}

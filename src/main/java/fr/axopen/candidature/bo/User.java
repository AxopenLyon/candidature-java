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
@Table(name = "users")
public class User {
    @Id
    private Long matricule;
    private String fullname;
    private String societe;
    private String email;
    private String job_title;
    private String resource_group_no;
    private String travel_code;
    private Long numero_latest_chantier;
    private String journal_pointage_erp;
}

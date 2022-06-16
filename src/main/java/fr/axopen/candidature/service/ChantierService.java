package fr.axopen.candidature.service;

import fr.axopen.candidature.bo.Chantier;
import fr.axopen.candidature.dto.ChantierDTO;
import fr.axopen.candidature.mapper.ChantierMapper;
import fr.axopen.candidature.mapper.JournalMapper;
import fr.axopen.candidature.repository.ChantierRepository;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Service
public class ChantierService {

    private ChantierRepository cR;
    private ChantierMapper cM;
    private JournalMapper jM;

    public ChantierService(ChantierRepository cR, ChantierMapper cM, JournalMapper jM) {
        this.cR = cR;
        this.cM = cM;
        this.jM = jM;
    }

    /**
     * Méthode qui va retourner un chantier aléatoire.
     *
     * @return ChantierDTO
     */
    public ChantierDTO getRandomChantier() {
        Random rand = new Random();
        Long id = (long) rand.nextInt(999);

        Chantier chantier = this.cR.findByNumero(id);

        if (chantier == null) {
            throw new IllegalArgumentException("Id inconnu");
        }
        return this.cM.chantierToChantierDTO(chantier);
    }

    /**
     * Méthode qui va mettre à jour un chantier aléatoire.
     */
    public void updateRandomChantier() {
        Random rand = new Random();

        Long id = (long) rand.nextInt(999);

        Chantier chantier = new Chantier();

        chantier.setNumero(id);
        chantier.setDescription(this.getRandomString(12));
        chantier.setCity(this.getRandomString(12));
        chantier.setCity_cp((long) rand.nextInt(99999));
        chantier.setDate_debut(new Date(rand.nextInt(2000000000)));
        chantier.setDate_fin(new Date(rand.nextInt(2000000000)));
        chantier.setStatus(this.getRandomString(12));
        chantier.setLien_sharepoint(this.getRandomString(12));
        chantier.setLien_files(this.getRandomString(12));
        chantier.setLien_gearth(this.getRandomString(12));
        chantier.setPrix_moyen_moe_jour((double) rand.nextInt(100));
        chantier.setPrix_moyen_moe_nuit((double) rand.nextInt(100));
        chantier.setPrix_moyen_materiel((double) rand.nextInt(100));
        chantier.setJournal_pointage_erp(this.getRandomString(12));

        this.cR.save(chantier);
    }

    String getRandomString(Integer size) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int numChars = chars.length();

        String result = "";
        for (int i = 0; i < size; ++i) {
            Random rand = new Random();
            result = result + chars.charAt((rand.nextInt(numChars)));
        }

        return result;
    }

    public List<Chantier> getChantiersByCurrentYear() {
        Chantier[] cL = this.cR.findAll().toArray(new Chantier[0]);
        ArrayList<Chantier> cAL = new ArrayList<>();

        for (int i = 0; i < cL.length; i++) {
            if (cL[i].getDate_debut().getYear() == new Date().getYear()) {
                cAL.add(cL[i]);
            }
        }

        return cAL;
    }

    public void deleteById(Long id) {
        Chantier c = this.cR.findByNumero(id);
        this.cR.delete(c);
    }

    public String getProperties() {
        try {
            ClassPathResource cPR = new ClassPathResource("application.properties");
            InputStream iS = cPR.getInputStream();
            String res = "";
            Reader r = new BufferedReader(new InputStreamReader(iS));
            while (true) {
                int d = r.read();
                if (d == -1) {
                    break;
                } else {
                    res = res + (char) d;
                }
            }
            return res;
        } catch (Exception e) {
            throw new RuntimeException("Erreur");
        }
    }

    public ChantierDTO updateChantierDescription(Long id, String description) {
        Chantier c = this.cR.findByNumero(id);
        c.setDescription(description);
        this.cR.save(c);
        return this.cM.chantierToChantierDTO(c);
    }
}

package fr.axopen.candidature.rest;


import fr.axopen.candidature.repository.ChantierRepository;
import fr.axopen.candidature.service.ChantierService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/chantier")
public class ChantierController {

    private ChantierService cS;
    private ChantierRepository cR;

    public ChantierController(ChantierService cS, ChantierRepository cR) {
        this.cS = cS; this.cR = cR;
    }

    @GetMapping()
    @Operation(summary = "Get random chantier")
    public ResponseEntity getRandomChantier() {
        return ResponseEntity.ok(this.cS.getRandomChantier());
    }

    @PostMapping()
    @Operation(summary = "Update a random chantier")
    public ResponseEntity saveRandomChantier() {
        this.cS.updateRandomChantier();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/by/current/year")
    @Operation(summary = "Get all chantiers by current year")
    public ResponseEntity getChantiersByCurrentYear() {
        return ResponseEntity.ok(this.cS.getChantiersByCurrentYear());
    }

    @GetMapping("/findAll")
    @Operation(summary = "Get all chantiers")
    public ResponseEntity getAllChantiers() {
        return ResponseEntity.ok(this.cR.findAll());
    }

    @GetMapping("/delete/{id}")
    @Operation(summary = "Delete a chantier")
    public ResponseEntity deleteChantierById(@PathVariable Long id) {
        this.cS.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/description/{id}")
    @Operation(summary = "Update chantier description")
    public ResponseEntity updateChantierDescription(@PathVariable Long id, @RequestBody String description) {
        return ResponseEntity.ok(this.cS.updateChantierDescription(id, description));
    }

    @GetMapping("/properties")
    @Operation(summary = "Get all properties")
    public ResponseEntity getProperties() {
        return ResponseEntity.ok(this.cS.getProperties());
    }
}

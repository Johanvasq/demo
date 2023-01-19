package co.com.ias.demo.controller;

import co.com.ias.demo.dto.PersonaDTO;
import co.com.ias.demo.service.IPersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/persona")
public class PersonaController {

    private final IPersonaService service;

    public PersonaController(IPersonaService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<?> getPersonAll(){
        return ResponseEntity
                .ok()
                .body(service.getAll());
    }

    @PostMapping()
    public ResponseEntity<?> savePerson(@RequestBody PersonaDTO persona){
        service.save(persona);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<?> updatePerson(@RequestBody PersonaDTO persona){
        service.update(persona);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

package co.com.ias.demo.service.implement;

import co.com.ias.demo.dto.PersonaDTO;
import co.com.ias.demo.repository.IPersonaRepository;
import co.com.ias.demo.repository.entity.Persona;
import co.com.ias.demo.service.IPersonaService;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements IPersonaService{

    private final IPersonaRepository repository;

    //Inyección de dependencias
    public PersonaServiceImpl(IPersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(PersonaDTO persona) {
        if(!repository.existsById(persona.getId())){
            repository.save(new Persona(persona));
        }
    }

    @Override
    public void update(PersonaDTO persona) {
        Optional<Persona> value = repository.findById(persona.getId());
        if(value.isPresent()){
            repository.save(new Persona(persona));
        }
    }

    @Override
    public List<PersonaDTO> getAll() {
        List<Persona> list = (List<Persona>) repository.findAll();
        return list.stream()
                .map(PersonaDTO::new)
                .collect(Collectors.toList());
    }
}

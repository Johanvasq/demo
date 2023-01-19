package co.com.ias.demo.service;

import co.com.ias.demo.dto.PersonaDTO;

import java.util.ArrayList;
import java.util.List;

public interface IPersonaService {

    void save(PersonaDTO persona);

    void update(PersonaDTO persona);

    List<PersonaDTO> getAll();

    // void delete();
}


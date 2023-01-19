package co.com.ias.demo.dto;

import co.com.ias.demo.repository.entity.Persona;

import javax.persistence.Column;
import javax.persistence.Id;

public class PersonaDTO {


    private Integer id;

    private String nombre;

    public PersonaDTO() {
    }

    public PersonaDTO(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PersonaDTO(Persona persona) {
        this.id = persona.getId();
        this.nombre = persona.getNombre();
    }
}

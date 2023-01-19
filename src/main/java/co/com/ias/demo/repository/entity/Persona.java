package co.com.ias.demo.repository.entity;

import co.com.ias.demo.dto.PersonaDTO;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

    @Id private Integer id;

    @Column(name = "NAME_PERSON", nullable = false) private String nombre;

    public Persona() {
    }

    public Persona(Integer id, String nombre) {
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

    public Persona(PersonaDTO personaDTO) {
        this.id = personaDTO.getId();
        this.nombre = personaDTO.getNombre();

    }
}

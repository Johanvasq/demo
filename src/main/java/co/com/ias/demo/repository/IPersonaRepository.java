package co.com.ias.demo.repository;

import co.com.ias.demo.repository.entity.Persona;
import org.springframework.data.repository.CrudRepository;


public interface IPersonaRepository extends CrudRepository<Persona, Integer> {
}

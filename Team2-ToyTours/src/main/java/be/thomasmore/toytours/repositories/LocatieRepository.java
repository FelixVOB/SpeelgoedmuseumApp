package be.thomasmore.toytours.repositories;

import be.thomasmore.toytours.models.Locatie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface LocatieRepository extends CrudRepository<Locatie, Integer> {
    List<Locatie> findAll();
    Optional<Locatie> findById(int id);

}

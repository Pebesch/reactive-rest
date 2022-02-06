package ch.schmucki.reactiverest.repository;

import ch.schmucki.reactiverest.model.Person;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {
    @Query("select id, lastName, firstName, age from person where name = :name")
    Flux<Person> findAllByName(String name);
}

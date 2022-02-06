package ch.schmucki.reactiverest.service;

import ch.schmucki.reactiverest.model.Person;
import reactor.core.publisher.Mono;

import java.util.Collection;

public interface PersonService {
    Collection<Person> findAllByName(String name);
    Collection<Person> findAll();
    Mono<Person> savePerson(Person person);
}

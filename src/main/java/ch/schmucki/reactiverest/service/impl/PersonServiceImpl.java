package ch.schmucki.reactiverest.service.impl;

import ch.schmucki.reactiverest.model.Person;
import ch.schmucki.reactiverest.repository.PersonRepository;
import ch.schmucki.reactiverest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Collection;

@Service
@Component
public class PersonServiceImpl implements PersonService {
    private PersonRepository repository;

    @Autowired
    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Person> findAllByName(String name) {
        return (Collection<Person>) repository.findAllByName(name);
    }

    @Override
    public Collection<Person> findAll() {
        return (Collection<Person>) repository.findAll();
    }

    @Override
    public Mono<Person> savePerson(Person person) {
        return repository.save(person);
    }
}

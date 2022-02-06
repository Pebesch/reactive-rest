package ch.schmucki.reactiverest.controller;

import ch.schmucki.reactiverest.model.Person;
import ch.schmucki.reactiverest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Collection;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(produces = {
            MediaType.APPLICATION_NDJSON_VALUE, MediaType.TEXT_EVENT_STREAM_VALUE
    })
    public Collection<Person>  findAll() {
        return personService.findAll();
    }

    @GetMapping(path = "/{name}", produces = {
            MediaType.APPLICATION_NDJSON_VALUE, MediaType.TEXT_EVENT_STREAM_VALUE
    })
    public Collection<Person> findAllByNames(@PathVariable String name) {
        return personService.findAllByName(name);
    }

    @PostMapping
    public Mono<Person> createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }
}

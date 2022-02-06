package ch.schmucki.reactiverest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    private Long id;
    private Integer age;
    private String lastName;
    private String firstName;
}

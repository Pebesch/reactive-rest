package ch.schmucki.reactiverest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    @Id
    private Long id;
    private String city;
    private int postcode;
    private String street;
}

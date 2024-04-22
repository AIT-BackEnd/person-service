package ait.cohort34.person.model;

import ait.cohort34.person.dto.AddressDto;
import ait.cohort34.person.dto.PersonDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "persons") // подключение к готовой таблице
@Inheritance(strategy = InheritanceType.JOINED) //стратегия наследования
public class Person {
    @Id
    Integer id;
    @Setter
    String name;
    LocalDate birthDate;
    @Setter
//    @Embedded//встроить Address в таблицу
    Address address;
}

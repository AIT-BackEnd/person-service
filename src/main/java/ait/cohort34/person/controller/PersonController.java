package ait.cohort34.person.controller;


import ait.cohort34.person.dto.AddressDto;
import ait.cohort34.person.dto.CityPopulationDto;
import ait.cohort34.person.dto.PersonDto;
import ait.cohort34.person.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    final PersonService personService;

    @PostMapping
    public Boolean addPerson(@RequestBody PersonDto personDto) {
        return personService.addPerson(personDto);
    }

    @GetMapping("/{id}")
    public PersonDto findPersonById(@PathVariable Integer id) {
        return personService.findPersonById(id);
    }

    @DeleteMapping("/{id}")
    public PersonDto removePerson(@PathVariable Integer id) {
        return personService.removePerson(id);
    }

    @PutMapping("/{id}/name/{name}")
    public PersonDto updatePersonName(@PathVariable Integer id, @PathVariable String name) {
        return personService.updatePersonName(id, name);
    }

    @PutMapping("/{id}/address")
    public PersonDto updatePersonAddress(@PathVariable Integer id, @RequestBody AddressDto addressDto) {
        return personService.updatePersonAddress(id, addressDto);
    }

    @GetMapping("/name/{name}")
    public PersonDto[] findByName(@PathVariable String name) {
        return personService.findPersonByName(name);
    }

    @GetMapping("/city/{city}")
    public PersonDto[] findByCity(@PathVariable String city) {
        return personService.findPersonByCity(city);
    }

    @GetMapping("/ages/{min}/{max}")
    public PersonDto[] findPersonsBetweenAge(@PathVariable Integer min, @PathVariable Integer max) {
        return personService.findPersonBetweenAge(min, max);
    }

    @GetMapping("/population/city")
    public Iterable<CityPopulationDto> getCitiesPopulation() {
        return personService.getCityPopulation();
    }
}

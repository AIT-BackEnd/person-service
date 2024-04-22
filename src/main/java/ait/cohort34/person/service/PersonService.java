package ait.cohort34.person.service;

import ait.cohort34.person.dto.AddressDto;
import ait.cohort34.person.dto.CityPopulationDto;
import ait.cohort34.person.dto.PersonDto;



public interface PersonService {

    Boolean addPerson(PersonDto personDto);

    PersonDto findPersonById(Integer id);

    PersonDto removePerson(Integer id);

    PersonDto updatePersonName(Integer id, String name);

    PersonDto updatePersonAddress(Integer id, AddressDto addressDto);

    PersonDto[] findPersonByCity(String city);

    PersonDto[] findPersonByName(String name);

    PersonDto[] findPersonBetweenAge(Integer minAge, Integer maxAge);

    Iterable<CityPopulationDto> getCityPopulation();
}

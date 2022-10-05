package ch.bfh.ti.simple_springboot_thymeleaf_example_1;


import ch.bfh.ti.simple_springboot_thymeleaf_example_1.entity.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonContainer {
    private List<Person> persons = new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}

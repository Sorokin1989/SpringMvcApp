package ru.sorokin.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.sorokin.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;

    private static final String URL="jdbc:postgresql://localhost:5432/first_db";
    private static final String USERNAME="postgres";
    private static final String PASSWORD="postgres";


    public List<Person>index() {
        return people;
    }
    public Person show(int id) {
      //  return people.stream().filter(person -> person.getId() == id).findFirst().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

   // public void update(int id,Person updatedPerson) {
   //     Person personToBeUpdated = show(id);
//
   //     personToBeUpdated.setName(updatedPerson.getName());
   //     personToBeUpdated.setAge(updatedPerson.getAge());
   //     personToBeUpdated.setEmail(updatedPerson.getEmail());

    }

   // public void delete(int id) {
        // people.removeIf(p -> p.getId() == id );
   // }


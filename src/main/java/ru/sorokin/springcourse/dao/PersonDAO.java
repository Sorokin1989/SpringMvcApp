package ru.sorokin.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.sorokin.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;
    {
        people = new ArrayList<Person>();
        people.add(new Person(++PEOPLE_COUNT,"Tom"));
        people.add(new Person(++PEOPLE_COUNT,"Bob"));
        people.add(new Person(++PEOPLE_COUNT,"Mike"));
        people.add(new Person(++PEOPLE_COUNT,"Jack"));
    }

    public List<Person>index() {
        return people;
    }
    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findFirst().orElse(null);
    }
}

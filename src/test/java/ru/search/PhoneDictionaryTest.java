package ru.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Ivanov", "534872", "Bryansk")
        );

        ArrayList<Person> persons = phones.find("Ivan");
        assertThat(persons.get(0).getSurname()).isEqualTo("Ivanov");
    }

    @Test
    public void whenFindByNameNotFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Ivanov", "534872", "Bryansk")
        );

        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons).isEmpty();
    }
}
package creational.builder;

import java.time.LocalDate;

public class PersonBuilderTest {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder("Guru", "8867661916")
                .dob(LocalDate.of(1990, 04, 20))
                .email("guru@guru.com")
                .build();

        System.out.println(p);
    }
}

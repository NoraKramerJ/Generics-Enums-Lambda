package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonData {

    public static List<Person> getAll(){
        return
                Arrays.asList(new Person("Aseel", 30, Gender.FEMALE),
        new Person("Alina Johnson", 31, Gender.FEMALE),
                new Person("Mike Soyar", 35, Gender.MALE),
                new Person("Sara", 25, Gender.FEMALE),
                new Person("James Bond", 87, Gender.MALE),
                new Person("Brooke Hudson", 29, Gender.FEMALE),
                new Person("Zyraa Hanes", 24, Gender.FEMALE)
        );
    }
}
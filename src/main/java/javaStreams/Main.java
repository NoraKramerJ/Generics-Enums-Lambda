package javaStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {


    List<Person> females=PersonData.getAll().
            stream().filter(p->p.getGender()
            .equals(Gender.FEMALE)).collect(Collectors.toList());

   // females.forEach(System.out::println);
   List<Person> sortedByAge= PersonData.getAll().stream().
           sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
     sortedByAge.forEach(System.out::println);
  }


}
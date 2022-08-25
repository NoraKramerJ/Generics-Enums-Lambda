package javaStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
//filter
    List<Person> females=PersonData.getAll().
            stream().filter(p->p.getGender()
            .equals(Gender.FEMALE)).collect(Collectors.toList());
//sort
   // females.forEach(System.out::println);
   List<Person> sortedByAge= PersonData.getAll().stream().
           sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender)
                   .reversed())
           .collect(Collectors.toList());
   //  sortedByAge.forEach(System.out::println);

boolean allMatch=PersonData.getAll().stream().allMatch(p->p.getAge()>24);
      System.out.println(allMatch);
      boolean anyMatch=PersonData.getAll().stream().anyMatch(p->p.getAge()>24);
      //System.out.println(anyMatch);

      //NonMatch
      boolean nonMatch=PersonData.getAll().stream().noneMatch(p->p.getName().equals("Sara"));
      //System.out.println(nonMatch);

      //Max

     Optional<Person>max= PersonData.getAll().stream().max(Comparator.comparing(Person::getAge));
      System.out.println(max.get());

      //Min
      Optional<Person>min= PersonData.getAll().stream().min(Comparator.comparing(Person::getAge));
      System.out.println(min.get());
  }


}
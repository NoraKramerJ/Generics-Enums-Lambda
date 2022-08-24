package Generics.AnimalExample;

import lombok.Data;

@Data
public class GenericsExamples<T extends Animal,AnimalBehavior,Cat,Dog> {


    T animalSounds;

    public void print(){
        System.out.println(animalSounds);

    }

}

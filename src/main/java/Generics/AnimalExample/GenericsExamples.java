package Generics.AnimalExample;

import lombok.Data;

@Data
public class GenericsExamples<T extends Animal > {


T animalToPrint;

    public GenericsExamples(T animalToPrint) {
        this.animalToPrint = animalToPrint;
    }

    public void print(){
animalToPrint.drink();


    }

}

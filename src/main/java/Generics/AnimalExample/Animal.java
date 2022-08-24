package Generics.AnimalExample;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Animal{

    private String name;
    private String gender;
    private String typeOfAnimal;
    private int age;

    public void eat(){
        System.out.println(getName()+ " is eating");
    }
    public void drink(){
        System.out.println(getName()+" is drinking");
    }

}

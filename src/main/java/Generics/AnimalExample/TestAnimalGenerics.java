package Generics.AnimalExample;

public class TestAnimalGenerics {

    public static void main(String[] args) {

        GenericsExamples<Cat> cat1=new GenericsExamples<>(new Cat("Heidi","F","cat",3));

cat1.print();

    }
}

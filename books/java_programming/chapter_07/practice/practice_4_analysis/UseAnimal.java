package books.java_programming.chapter_07.practice.practice_4_analysis;

public class UseAnimal {
    public void doSomething(Animal animal){
        System.out.println("> Inside Animal Version.");
    }

    public void doSomething(Horse animal){
        System.out.println("> Inside Horse Version");
    }

    public static void main(String []args){
        Animal animal = new Horse();
        UseAnimal useAnimal = new UseAnimal();

        useAnimal.doSomething(animal);
    }
}


/*
Output : 
> Inside Animal Version.
*/
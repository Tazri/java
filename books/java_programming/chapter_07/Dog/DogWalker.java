package books.java_programming.chapter_07.Dog;

public class DogWalker {
    public void walk(Dog dog){
        if(dog instanceof Poodle){
            Poodle poodle = (Poodle) dog; // down casting.
            System.out.println("It's Poodle Walking "+poodle.getName());
        }else{
            System.out.println("Walking "+dog.getBread());
        }
    }
}

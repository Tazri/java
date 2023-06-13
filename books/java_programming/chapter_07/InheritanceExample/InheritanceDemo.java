package books.java_programming.chapter_07.InheritanceExample;

public class InheritanceDemo {
    public static void main(String args[]){
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.sleep();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();
    }
}

/*
 * 
 * show the whole package to understand this
 */
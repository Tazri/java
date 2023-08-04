package books.java_programming.chapter_07.Zoo;

public abstract class Animal {
    private final int legs;
    private String name;

    public Animal(int legs, String name){
        this.legs = legs;
        this.name = name;
    }

    public abstract String getDiets();

    // Override toString method.
    public String toString(){
        return (name + " has " + legs + " leg(s).");
    }
}

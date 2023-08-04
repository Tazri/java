package books.java_programming.chapter_07.Zoo;

public class Lion extends Animal {
    public Lion(){
        super(4,"Lison");
    }

    @Override
    public String getDiets(){
        return "Meat";
    }
}

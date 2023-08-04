package books.java_programming.chapter_07.Zoo;

public class Deer extends Animal {
    public Deer(){
        super(4,"Deer");
    }

    @Override
    public String getDiets(){
        return "Grass";
    }
}

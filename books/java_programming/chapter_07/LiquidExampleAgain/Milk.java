package books.java_programming.chapter_07.LiquidExampleAgain;

public class Milk extends Liquid {
    @Override
    public void swirl(boolean clockwise){
        if(clockwise){
            System.out.println("Swirling Milk");
        }
    }
}

package books.java_programming.chapter_07.ExampleLiquid;

public class Milk extends Liquid {
    @Override
    public void swirl(boolean clockwise){
        if(clockwise) 
            System.out.println("Swirling milk... clockwise.");
        else
            System.out.println("Swirling milk....");
    }
}

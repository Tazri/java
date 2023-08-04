package books.java_programming.chapter_07.LiquidExampleAgain;

public class Liquid {
    public void swirl(boolean clockwise){
        if(clockwise){
            System.out.println("Swirling Liquid");
        }
    }

    public static void main(String args[]){
        Liquid myFavoriteBeverage = new Liquid();

        myFavoriteBeverage.swirl(true);
    }
}

package books.java_programming.chapter_07.LiquidExampleAgain;

public class Main {
    public static void main(String args[]){
        Liquid water = new Liquid();
        Liquid milk = new Milk();
        Liquid coffee = new Coffee();

        Cup cup = new Cup();
        cup.addLiquid(water).addLiquid(milk).addLiquid(coffee);

        cup.mix();

        String name = milk.getClass().toString();

        System.out.println("Actual type of milk : "+name);
    }
}

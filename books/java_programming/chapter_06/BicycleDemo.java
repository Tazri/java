package books.java_programming.chapter_06;

public class BicycleDemo {
    public static void main(String args[]){
        // create two different
        // bicycle object

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // call methods on those objects
        bike1.changeCandence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCandence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCandence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}

/*
Ouptut : 
candence : 50 Speed : 10 Gear : 2
candence : 40 Speed : 20 Gear : 3
*/
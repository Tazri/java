package books.java_programming.chapter_06;

public class Bicycle{
    private int candence = 0;
    private int speed = 0;
    private int gear = 1;
    public void changeCandence(int newValue){
        candence = newValue;
    }

    public void changeGear(int newValue){
        gear = newValue;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public void applyBreakes(int decrement){
        speed -= decrement;
    }

    public void printStates(){
        System.out.println("candence : "+candence +
                            " Speed : "+speed+" Gear : "
                            + gear);
    }
}

// this object used in ./BicycleDemo.java file
package books.java_programming.chapter_06;

public class Circle {
    private static final double PI = 3.1416;
    private static int numberOfObjectCreated = 0;
    private int radius;

    public Circle(int radius){
        this.radius = radius;
        numberOfObjectCreated++;
    }

    public int getNumberOfObjectCreated(){
        return numberOfObjectCreated;
    }

    public double getArea(){
        return radius * radius * PI;
    }

    public static void main(String args[]){
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(20);

        System.out.println("circle1 = " +circle1.getNumberOfObjectCreated());
        System.out.println("circle2 = " +circle2.getNumberOfObjectCreated());
        System.out.println("circle3 = " +circle3.getNumberOfObjectCreated());
    }
}

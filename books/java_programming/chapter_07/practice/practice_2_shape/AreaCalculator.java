package books.java_programming.chapter_07.practice.practice_2_shape;

public class AreaCalculator {
    
    // method of get area of circle
    public double getArea(double  radius){
        return radius * Math.PI * radius;
    }

    // method for get area of triangle
    public double getArea(int length,double width){
        return (length*width)/2.0;
    }

    // method for get area of rectangle
    public int getArea(int base,int height){
        return base*height;
    }

    // method for get area of cylinder
    public double getArea(double radius,double height){
        return new AreaCalculator().getArea(radius)*height;
    }
}

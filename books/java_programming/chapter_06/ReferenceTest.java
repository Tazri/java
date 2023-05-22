package books.java_programming.chapter_06;

import java.awt.Point;

public class ReferenceTest {
    public static void main(String [] args){
        Point a;
        Point b;
        a = new Point(100, 100);
        b = a; // here b and a same reference. 

        b.x = 200;
        b.y = 200;
        System.out.println("a : " + a.x + ", "+a.y);
        System.out.println("b: "+b.x + ", " + b.y);
    }
}

/*
Output :
a : 200, 200
b: 200, 200
*/
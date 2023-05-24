package books.java_programming.chapter_07.accessModifierExample;


public class Person {
    public static void main(String args[]){
        DataClass me = new DataClass("Anonymo", 12);

        System.out.println("me.name : "+me.name);
    }
}

/*
Sample Output : 
me.name : Anonymo
*/
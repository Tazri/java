package books.java_programming.chapter_06;

public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Person(String name, String email,int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Age : "+age);
    }
    public static void main(String args[]){
        Person bazlur = new Person("Bazlur","bazlur#masterdevskills.com",50);
        Person ahmed = new Person("Ahmed");

        bazlur.printInfo();
        ahmed.printInfo();
    }
}


/*
Output : 
Name : Bazlur
Email : bazlur#masterdevskills.com
Age : 50
Name : Ahmed
Email : null
Age : 0

*/
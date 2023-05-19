package books.java_programming.chapter_06;

public class ChainPerson {
    public String name ;
    private String email;
    private int age;

    public ChainPerson(String name,String email,int age){
        this(name,email);
        this.age = age;
    }

    public ChainPerson(String name,String email){
        this(name);
        this.email = email;
    }

    public ChainPerson(String name){
        this.name = name;
    }

    public void printInfo(){
        System.out.println("> "+name+"("+age+"), email : "+email);
    }

    public static void main(String args[]){
        ChainPerson me = new ChainPerson("ANS anonymo","Ans.anonymo@gmail.com",12);

        me.printInfo();
    }
}

/*
Output : 
> ANS anonymo(12), email : Ans.anonymo@gmail.com
*/
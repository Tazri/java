package books.java_programming.chapter_07.practice.practice_3_author_and_book;

public class Author {
    private String name;
    private String email;
    private String gender;

    // constructor
    public Author(String name,String email,String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // getter
    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getGender(){
        return this.gender;
    }

    // setter
    public String setName(String name){
        String temp = this.name;
        this.name = name;
        return temp;
    }

    public String setEmail(String email){
        String temp = this.email;
        this.email = email;
        return temp;
    }

    public String setGender(String gender){
        String temp = this.gender;
        this.gender = gender;
        return temp;
    }
}

package books.java_programming.chapter_06;

public enum Size{
    SMALL("This size is small.",4),
    MEDIUM("The Size is medium.",2),
    Large("The size is large.",41),
    EXTRALARGE("The size is extra large.",2);

    // enum string field
    private final String pizzaSize;
    public int no;

    // enum construcot
    private Size(String size,int a){
        this.pizzaSize = size;
        this.no = a;
    }

    public String getSize(){
        return pizzaSize;
    }

    public int getNo(){
        return no;
    }
}

class Main{
    public static void main(String []args){
        Size size = Size.SMALL;

        System.out.println("size.getSize() : "+size.getSize());
    }
}

/*
Output :
size.getSize() : This size is small.
*/
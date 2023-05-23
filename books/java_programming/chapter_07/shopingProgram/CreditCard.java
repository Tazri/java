package books.java_programming.chapter_07.shopingProgram;

public class CreditCard{
    private final long number;
    private final String validThrough;
    private final int cvv;

    public CreditCard(long number,int cvv,String validThrough){
        this.number = number;
        this.cvv = cvv;
        this.validThrough = validThrough;
    }

    public long getNumber(){
        return this.number;
    }

    public String validThrough(){
        return this.validThrough;
    }

    public int getCVV(){
        return this.cvv;
    }
}

// this type of object called immutable, because this object property are not changeable.
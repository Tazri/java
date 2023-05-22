package books.java_programming.chapter_06;


public enum Level{
    HIGH(3), MEDIUM(2), LOW(1);

    private final int levelCode;

    Level(int levelCode){ // constructor of enum
        this.levelCode = levelCode;
    }

    public int getLevelCode(){
        return this.levelCode;
    }
}

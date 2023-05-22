package books.java_programming.chapter_06;

public class EnumExample {
    public void displayDay(Day day){
        if(day == Day.SATURDAY){
            System.out.println("It's staurday! Weekend!");
        }else if(day == Day.FRIDAY){
            System.out.println("It's Friday!! Weekend!");
        }else{
            System.out.println("Weekday!");
        }
    }
    
    public static void main(String []args){
        EnumExample enumExample = new EnumExample();
        Day day = Day.SATURDAY;
        enumExample.displayDay(day);
    }
}

/*
Output :
It's staurday! Weekend!
*/
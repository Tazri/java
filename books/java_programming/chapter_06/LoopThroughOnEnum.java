package books.java_programming.chapter_06;


public class LoopThroughOnEnum{
    public static void main(String args[]){
        for(Day day : Day.values()){
            System.out.println("day : "+day);
        }
    }
}

/*
Output :
day : SATURDAY
day : SUNDAY
day : MONDAY
day : TUESDAY
day : WEDNESDAY
day : THURSDAY
day : FRIDAY
*/
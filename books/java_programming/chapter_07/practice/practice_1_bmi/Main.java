package books.java_programming.chapter_07.practice.practice_1_bmi;

public class Main {
    public static void main(String args[]){
        BMI bmi = new BMI("Tanvir Rifat",145,70);
        System.out.println("The BMI for "+bmi.getName()+" is ("+bmi.getBMI()+") "+bmi.getStatus());
    }
}


/*
 * Output : 
 * The BMI for Tanvir Rifat is (20.805120213811858) Normal Weight
 */
package books.java_programming.chapter_06;

public class Student {
    public final String name;
    private final double[] marks;

    public Student(String name,double[] marks){
        this.name = name;
        this.marks = marks;
    } 

    public double average(){
        return totalMarks() / marks.length;
    }

    public double totalMarks(){
        double totalMarks = 0.0;

        for(double mark : marks){
            totalMarks += mark;
        }

        return totalMarks;
    }

    public static void main(String args[]){
        Student anonymo = new Student("Anonymo", new double[]{
            97.45, 95.75, 100
        });

        double totalMarks = anonymo.totalMarks();
        double average = anonymo.average();

        System.out.println("Name : "+anonymo.name);
        System.out.println("Total Marks : "+totalMarks);
        System.out.println("Average : "+average);
    }
}

/*
Output : 
Name : Anonymo
Total Marks : 293.2
Average : 97.73333333333333
*/
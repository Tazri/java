package books.java_programming.chapter_07.practice.practice_1_bmi;

public class BMI {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    private String name;
    private double weight; // in pounds
    private double height; // in inches

    // constructor
    public BMI(String name,double weight, double height){
        this.name = name;
        this. weight = weight;
        this. height = height;
    }

    public double getBMI(){
        double bmi = (this.weight*BMI.KILOGRAMS_PER_POUND)/Math.pow(this.height*BMI.METERS_PER_INCH,2);

        return bmi;
    }

    public String getStatus(){
        double bmi = getBMI();

        if(bmi < 18.5) return "Underweight";
        else if(bmi < 25) return "Normal Weight";
        else if(bmi < 30) return "OverWeight";
        else if(bmi < 35) return "Obesity class I";
        else if(bmi < 40) return "Obesity class II";
        else return "Obesity class II";
    }

    public String getName(){
        return this.name;
    }
}

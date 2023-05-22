package books.java_programming.chapter_05.practice;

import java.util.Scanner;

public class Temperature{
    public static void main(String args[]){
        // get all temperature input
        Scanner input = new Scanner(System.in);
        final int DISTRICT = 64;
        final int DAYS = 365;
        double [][]temperatureList = new double[DISTRICT][DAYS];

        for(int district = 0;district < temperatureList.length;district++){
            for(int day = 0;day < temperatureList[district].length;day++){
                System.out.print("> district["+district+"] day["+day+"] : ");
                temperatureList[district][day] = input.nextDouble();
            }
        }

        // get highest, lowest and average temperature
        for(int district =0;district < temperatureList.length;district++){
            System.out.println("\n>>> Temperature details for district " + district +" <");
            
            // figure out highest, lowest and average temperature
            double list[] = temperatureList[district];

            double high = list[0];
            double low = list[0];
            double sum = list[0];

            for(int day  = 1;day < list.length;day++){
                if(list[day] < low) low = list[day];

                if(list[day] > high) high = list[day];

                sum += list[day];
            }

            double average = sum/list.length;

            System.out.println("> Highest Temperature is : "+high);
            System.out.println("> Lowest Temperature is : "+low);
            System.out.println("> Average Temperature is : "+average);
        }

        input.close();
    }
}
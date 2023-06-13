package books.java_programming.chapter_07.InheritanceWithBicycle;

public class BikeDemo {
    public static void main(String []args){
        MountainBike mountainBike = new MountainBike();
        mountainBike.setGear(5);

        System.out.println("mountainBike.gear : "+mountainBike.gear);
    }
}

/*
Output Sample : 
mountainBike.gear : 5
*/
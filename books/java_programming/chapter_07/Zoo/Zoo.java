package books.java_programming.chapter_07.Zoo;

public class Zoo {
    private Animal [] animals;

    public Zoo(Animal[] animals){
        this.animals = animals;
    }

    public void printInfo(){
        for(Animal animal : animals){
            System.out.println(animal.getDiets());
        }
    }

    public static void main(String args[]){
        Deer d = new Deer();
        Lion l = new Lion();

        Zoo zoo = new Zoo(new Animal[]{d,l});

        zoo.printInfo();
    }
}

/*
 * output : 
 * Grass
 * Meat
 */
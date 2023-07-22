package books.java_programming.chapter_07.ExampleLiquid;

import java.util.ArrayList;

public class Cup {
    public ArrayList<Liquid> liquids = new ArrayList<Liquid>();
    
    public void addLiquid(Liquid liquid){
        liquids.add(liquid);
    }

    public void mix(){
        for(Liquid liquid:liquids){
            liquid.swirl(true);
        }
    }
}

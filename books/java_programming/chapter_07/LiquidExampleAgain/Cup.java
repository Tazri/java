package books.java_programming.chapter_07.LiquidExampleAgain;

import java.util.ArrayList;

public class Cup {
    public ArrayList <Liquid> liquids = new ArrayList<Liquid>();

    public Cup addLiquid(Liquid liquid){
        liquids.add(liquid);

        return this;
    }

    public void mix(){
        for( Liquid liquid : liquids){
            liquid.swirl(true);
        }
    }
}

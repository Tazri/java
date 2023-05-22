package books.java_programming.chapter_06;

public class CricketPlayer {
    private static int totalScore;
    public String name;
    private int score;

    public CricketPlayer(String name){
        this.name = name;
    }

    public static int getTotalScore(){
        return totalScore;
    }

    public void addScore(int score){
        this.score += score;
        totalScore += score;
    }

    public int getScore(){
        return score;
    }

    public static void main(String args[]){
        CricketPlayer sayeem = new CricketPlayer("Sayeem");
        sayeem.addScore(1);
        sayeem.addScore(4);
        sayeem.addScore(6);
        sayeem.addScore(4);

        CricketPlayer rifat = new CricketPlayer("Rifat");
        rifat.addScore(0);
        rifat.addScore(1);
        rifat.addScore(2);
        rifat.addScore(4);

        CricketPlayer sakib = new CricketPlayer("Sakib");
        sakib.addScore(6);
        sakib.addScore(1);
        sakib.addScore(4);
        sakib.addScore(1);
        sakib.addScore(1);
        sakib.addScore(2);

        System.out.println("> Sayeem : "+sayeem.getScore());
        System.out.println("> Rifat : "+rifat.getScore());
        System.out.println("> Sakib : "+sakib.getScore());
        System.out.println("> Total Score : "+CricketPlayer.totalScore);


    }
}

/*
Output :
> Sayeem : 15
> Rifat : 7
> Sakib : 15
> Total Score : 37
*/
package practice;

public class DotStar {
    public static void main(String args[]){
        for(int star = 6,dot = 0;star > 0;star--,dot++){
            for(int i = 0;i < dot;i++){
                System.out.print(". ");
            }

            for(int i = 0;i < star;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Output : 
* * * * * * 
. * * * * * 
. . * * * * 
. . . * * * 
. . . . * * 
. . . . . *
*/
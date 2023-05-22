package books.java_programming.chapter_04.practice;

public class LetterHalfPyramid{
    public static void main(String args[]){
        int n = 1;
        for(char a = 'A';a <= 'H';a++,n++){
            for(int i = 0;i < n;i++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}

/*
Output : 
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 
G G G G G G G 
H H H H H H H H 
*/
package practice;
class Pattern {
    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String []args){
        print("Fill Square pattern : ");
        print("* * * * *");
        print("* * * * *");
        print("* * * * *");
        print("* * * * *");
        print("* * * * *");

        print("\nEmpty Square pattern : ");
        print("* * * * *");
        print("*       *");
        print("*       *");
        print("*       *");
        print("* * * * *");

        print("\nTriangle Pattern : ");
        print("* * * * *");
        print(" *     *");
        print("  *   *");
        print("   * *");
        print("    *");

    }
}

/*
Output : 
Fill Square pattern : 
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

Empty Square pattern : 
* * * * *
*       *
*       *
*       *
* * * * *

Triangle Pattern : 
* * * * *
 *     *
  *   *
   * *
    *
*/
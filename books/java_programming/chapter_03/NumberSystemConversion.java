package books.java_programming.chapter_03;
public class NumberSystemConversion {
    public static void main(String []args){
        int number = 1_000_000; // 1 million

        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        String octal = Integer.toOctalString(number);

        System.out.println("Binary : "+binary); // Binary : 11110100001001000000
        System.out.println("Hex : "+hex); // Hex : f4240
        System.out.println("Octal : "+octal); // Octal : 3641100
    }
}

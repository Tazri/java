import java.lang.Math;

public class LogTable {
    public static void main(String args[]){
        System.out.println("n \tlog10(n) \tlog2(n) \tloge(n)");
        System.out.println("------------------------------------------");
        int n = 1;

        while(n <= 10){
            double log10 = Math.log10(n);
            double log2 = Math.log(n) / Math.log(2);
            double loge = Math.log(n);

            String row = String.format("%d:"+"\t%.6f\t%.6f"+"\t%.6f",n,log10,log2,loge);
            System.out.println(row);

            n++;
        }
    }
}

/*
Output : 
n       log10(n)        log2(n)         loge(n)
------------------------------------------
1:      0.000000        0.000000        0.000000
2:      0.301030        1.000000        0.693147
3:      0.477121        1.584963        1.098612
4:      0.602060        2.000000        1.386294
5:      0.698970        2.321928        1.609438
6:      0.778151        2.584963        1.791759
7:      0.845098        2.807355        1.945910
8:      0.903090        3.000000        2.079442
9:      0.954243        3.169925        2.197225
10:     1.000000        3.321928        2.302585
*/
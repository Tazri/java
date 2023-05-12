package practice;

import java.util.Scanner;

public class Market {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("> How many product did you buy ? ");
        System.out.print("> ");
        int totalProduct = input.nextInt();
        int totalPrice = 0;

        if(totalProduct <= 0){
            System.out.print("> Ok bye! Come again if you want to buy something.");
        }else{
            System.out.println("> Enter their price one by one : ");
            for(int i = 1;i <= totalProduct;i++){
                System.out.print("> Product["+i+"] Price : $");
                int price = input.nextInt();
                totalPrice += price;
            }
            
            // calculate vat
            double vat = (15.0*(double)totalPrice)/100.0;
            int floorVat = (int)vat;
            totalPrice += floorVat;

            System.out.println("> Total Price : $"+totalPrice);
            
            int paid = 0;
            
            do{
                System.out.println("> Please pay the money : ");
                System.out.print("> $");
                paid += input.nextInt();

                if(paid < totalPrice){
                    int needToPay = totalPrice - paid;
                    System.out.println("> You have to pay more "+needToPay);
                }
            }while(paid < totalPrice);

            if(paid > totalPrice){
                int changes = paid - totalPrice;

                System.out.println("> Here is your changes : "+changes);
            }

            System.out.println("> Thanks for coming and brought something :) <");
        }

        input.close();
    }
}

/*
Output : 
> How many product did you buy ? 
> 2
> Enter their price one by one : 
> Product[1] Price : $25
> Product[2] Price : $45
> Total Price : $80
> Please pay the money : 
> $50
> You have to pay more 30
> Please pay the money : 
> $50
> Here is your changes : 20
> Thanks for coming and brought something :) <
*/
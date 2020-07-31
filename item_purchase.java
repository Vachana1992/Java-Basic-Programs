package week1;

import java.util.Scanner;

public class item_purchase {

    public static void main(String[] args){
        System.out.print("Enter item code: ");
        Scanner sc =new Scanner(System.in);
        String code = sc.nextLine();
        System.out.print("Enter item title: ");
        String title = sc.nextLine();
        System.out.print("enter original price of an item: ");
        double org_price = sc.nextDouble();
        System.out.print("Enter the discount rate in %: ");
        double rate = sc.nextDouble();
        double disc_price = org_price*(rate/100);
        double pay = org_price-disc_price;
        System.out.println("--------------------------------");
        System.out.println("Item Code : "+code);
        System.out.println("Item Title : "+title);
        System.out.println("Item original price : "+org_price +"$");
        System.out.println("Discounted amount : "+disc_price+"$");
        System.out.println("The amount to pay : "+pay+"$");



    }
}

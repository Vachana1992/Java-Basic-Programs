package week1;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args){
        System.out.println("Enter your weight in  Kg : ");
        Scanner sc = new Scanner(System.in);
        double w = sc.nextInt();
        double p = w * 2.2 ;
        System.out.println("Weight in pounds is : "+p);
    }
}

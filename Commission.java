package week1;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args){
        System.out.print("enter the salry: ");
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        System.out.print("Total sales they earn: ");
        double sale = sc.nextDouble();
        double pay = sal + sale*20/100;
        System.out.println("Gross pay: "+pay);
        System.out.print("ënter tax percent: ");
        double tax_p = sc.nextDouble();
        double net_amt = pay-(pay*tax_p/100);
        System.out.print("Net salary: "+net_amt);
    }
}

package week1;

import java.util.Scanner;

public class gross_netpay {
    public static void main(String[] args){
        System.out.print("Enter no.of hours work in a day: ");
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        System.out.print("Enter hourly pay: ");
        double rate = sc.nextDouble();
        System.out.print("Enter no of days worked in a month: ");
        int days = sc.nextInt();
        double pay = hr*rate*days;
        System.out.println("Gross pay (in month): "+pay);
        System.out.println("--------------------------------");
        System.out.print("enter tax percentage: ");
        double tax_per = sc.nextDouble();
        double t_pay = pay*tax_per/100;
        double net_amt = pay - t_pay;
        System.out.println("Net Amount: "+net_amt);

    }
}

package week1;

import java.util.Scanner;

public class C_Area {
    public static void main(String[] args){

        System.out.println("enter radius of circle ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of circle : "+area);


    }
}

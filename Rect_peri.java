package week1;

import java.util.Scanner;

public class Rect_peri {
    public static void main(String[] args){
        System.out.println("Enter length and breadth of a rectangle :");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int P = 2 * l * b;
        System.out.println("The perimeter of rectangle is : "+P);
    }
}

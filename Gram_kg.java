package week1;

import java.util.Scanner;

public class Gram_kg {
    public static void main(String[] args){
        System.out.println("enter user's name: ");
        Scanner sc =  new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("enter parcel weight in grams : ");
        int w = sc.nextInt();
        int wkg  = w / 1000 ;
        System.out.println(name+"'s parcel weight"+ w +"g,in kg is "+ wkg +"Kg");
    }
}

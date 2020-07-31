package week1;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args){
        System.out.println("Hi , What's your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome to our show Mr."+name+ ", How old are you? ");
        int age = sc.nextInt();
        System.out.println("Hmmm, you don't look a day over "+age+ ". Tell me Mr." +name+ ", Where do you live? ");
        Scanner obj = new Scanner(System.in);
        String p = obj.nextLine();
        System.out.println("Oh, I've heard "+p+ " is a lovely place. " );
        System.out.println("Yes, It is!!");
    }
}

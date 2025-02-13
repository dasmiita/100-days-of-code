/* 
Day 3: Input and Output
1. Write a program that reads user input and print it to the console.
2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings)
3. Write a program to read the user input using Scanner class
 */
import java.util.Scanner;
public class day03 {
    public static void main(String[] args) {
        
    
    System.out.println("hi! whats your name?");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("well, nice to meet you " + name +" :)");
    System.out.println("do you mind sharing your age?");
    int age = sc.nextInt();
    System.out.println("you sure seem young for a " + age +" year old ;)");
    System.out.println("Also i feel hungry do you think i could have a piece of that cake you're eating");
    double piece = sc.nextDouble();
    System.out.println("What?! Just " + piece + " of the whole thing?? Come on, be more generous!");
    System.out.println("Ah well, nevermind " + name + ". I will remember you");
    sc.close();
    }

    
}

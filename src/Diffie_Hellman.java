import java.util.Random;
import java.util.Scanner;

public class Diffie_Hellman {

    public static void main(String[] args){

        System.out.println("\n######################");
        System.out.println("### Diffie Hellman ###");
        System.out.println("######################");

        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();

//  Taking input from user for p
        System.out.println("\n\nEnter the value for p: ");
        int p = input.nextInt();

//  Taking input from user for g
        System.out.println("\nEnter the value for g: ");
        int g = input.nextInt();

//  Picking a random number SA
        System.out.println("\nAlice is thinking of a secret number.......");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        int sa = randomNumber.nextInt(10);
        System.out.println("Alice picks a secret number SA");

//  Picking a random number SB
        System.out.println("\nBob is thinking of a secret number.......");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        int sb = randomNumber.nextInt(10);
        System.out.println("Bob picks a secret number SB");

//  Computing the value for TA
        long temp = ((long) Math.pow(g, sa));
        int ta = (int) (temp % p);
        System.out.println("\nAlice computes TA");

//  Computing the value for TB
        temp = ((long) Math.pow(g, sb));
        int tb = (int) (temp % p);
        System.out.println("Bob computes TB");

//  Alice and Bob exchanges TA and TB
        System.out.println("\nAlice and Bob exchange TA and TB.......");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Exchange completed");

//  Computing the value for Secret Key
        temp = (long) Math.pow(tb, sa);
        int ska = (int) (temp % p);
        System.out.println("\nAlice computes secret key");

//  Computing the value for Secret Key
        temp = (long) Math.pow(ta, sb);
        int skb = (int) (temp % p);
        System.out.println("Bob computes secret key");

//  Result
        if(ska == skb){
            System.out.println("\nCommunication will take place");
            System.out.println("The secret key is " + ska);
        }else{
            System.out.println("\nCommunication cannot take place");
        }

    }
}

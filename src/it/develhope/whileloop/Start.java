package it.develhope.whileloop;


import java.util.Random;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {



        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(10);

        System.out.println("Welcome!");
        System.out.println("Guess the number from 1 to 10: ");

        while (scanner.hasNextInt()){
            int guessNumber = scanner.nextInt();
            if (guessNumber == number){
                System.out.println("Congratulations!!");
                break;
            }else {
                System.out.println("Try again!");
            }
        }

    }
}

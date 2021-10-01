package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("how many sides does your dice have?");
        // Scanner sides  = new Scanner (System.in);
        int sides = input.nextInt();

        System.out.println("how many times do you want to throw the dice?");
        int diceThrow = input.nextInt();
        //Scanner diceThrows = new Scanner(System.in);
        Random random = new Random();

        int[] tally = new int[sides + 1];

        for (int i = 0; i < diceThrow; i++) {
            int newRandom = random.nextInt(sides) + 1;
           // System.out.println(newRandom);

            tally[newRandom]++;


        }
        for (int i = 1; i < sides; i++) {
            System.out.println("your dice landed on side " + i + " " + tally[i] + " times");

        }



        input.nextInt()


    }
}

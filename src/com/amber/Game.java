package com.amber;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private String[] names = {"amber", "cameron", "mason", "chris"};
    private String correctGuess;


    public void guessName(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Guess a name: ");
            String guess = scan.next();
            int answer = Arrays.binarySearch(names, guess);
            this.correctGuess = guess;
            if(answer >= 0) break;
            System.out.print("Incorrect; Please Choose Again: ");
        }
        System.out.println("You got it right! \n" +
                "The answer is " + correctGuess);


    }
}

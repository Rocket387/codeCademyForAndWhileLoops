package org.example;

import java.util.Random;
import java.util.Scanner;

public class Passcode {
    public static int getNewPasscode() {
        Random randomGenerator = new Random();

        // Generate a number between 1 and 6
        return randomGenerator.nextInt(1999) +1;
    }

    public static void main(String[] args) {

        int passcode = getNewPasscode();
        // set attempts to 0
        int attempts = 0;

// enter loop if condition is true
        while (passcode != 5522 && attempts < 4) {

            System.out.println("Try again.");
            passcode = getNewPasscode();
            attempts += 1;

            // is condition still true?
            // if so, repeat code block
        }
// exit when condition is not true
    }

}

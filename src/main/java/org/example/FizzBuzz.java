package org.example;

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if(i %15 ==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if(i %3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if(i %5 ==0){
                System.out.println("Buzz");
                continue;
            }

            System.out.println(i);
        }

    }
}

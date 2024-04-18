package org.example;

public class BurritoCounter {
    public static int getBurritosSold(int lastOrderNumber) {
        int totalBurritosSold = 0;

        for(int i = 0; i <= lastOrderNumber; i++){
            totalBurritosSold +=i;
        }
        return totalBurritosSold;
    }

    public static int getNumDivisibleOrders(int lastOrderNumber) {
        int numDivisbleOrders = 0;
        for(int i = 1; i <= lastOrderNumber; i++){
            if(i % 9 == 0){
                numDivisbleOrders++;
            }
        }

        return numDivisbleOrders;
    }

    public static boolean hasLeftoverFunds(int burritoCost) {
        int budget = 100;
        int numBurritos = 0;

        while (budget >= burritoCost) {
            numBurritos++;
            budget -= burritoCost;
        }

        System.out.println("Remaining budget: " + budget);

        return budget > 0;
    }

    public static int getTip(int budget) {
        int maxDigit = 0;

        while (budget > 0) {
            int digit = budget % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }

            budget /= 10;
        }

        return maxDigit * 900;
    }

    public static int getReverseBudget(int budget) {
        int reverseBudget = 0;

        while (budget > 0) {
            int digit = budget % 10;
            budget /= 10;
            reverseBudget = (reverseBudget * 10) + digit;
        }

        return reverseBudget;
    }

    public static void main(String []args) {
        // Try testing your code with different arguments in the method call
        System.out.println(getBurritosSold(548));
        System.out.println(getNumDivisibleOrders(18));
        System.out.println(hasLeftoverFunds(7));
        System.out.println(hasLeftoverFunds(10));
        System.out.println(getTip(123));
        System.out.println(getReverseBudget(123));
    }
}

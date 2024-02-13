package org.example;
import java.util.ArrayList;

class PrimeDirective {
    // Add your methods here:

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<>();

        for(int number: numbers){
            if(number %2 == 0){
                primes.add(number);
            }
        }
        return primes;
    }
    // Add your methods here:
    public boolean isPrime(int number) {

        if(number == 2){
            return true;
        } else if(number <2){
            return false;
        }

        for(int i = 2; i<number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        pd.isPrime(7);
        System.out.println(pd.onlyPrimes(numbers));
    }
}
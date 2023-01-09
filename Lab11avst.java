// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]) {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        // Step 1: Treat all numbers as Prime
        //Write a Loop that changes all numbers to prime (True) in the array
        for (int k = 2; k < primes.length; k++) {
            // Change all the values to true here
            primes[k] = true;
        }


        for (int k = 2; k < primes.length; k++) {
            for (int k = 2 * 2; k < primes.length; k += 2) {
                primes[k] = false;
            }
        }
    }
        public static void displayPrimes(boolean primes[]) {
            System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
            System.out.println();

            for (int k = 2; k < primes.length; k++) {
                if (primes[k] == true)
                    System.out.print(k + "  ");
            }
        }
    }



    // for (int k = 3 * 2; k < primes.length; k += 3) {
//            primes[k] = false;
//            }
//            for (int k = 4 * 2; k < primes.length; k += 4) {
//            primes[k] = false;
//            }
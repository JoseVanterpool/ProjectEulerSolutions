import java.util.ArrayList;

public class Main {
/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
        System.out.println();
    }

    public static long largestPrimeFactor(long n){
        ArrayList<Integer>  primeList = new ArrayList<Integer>();
        double root = java.lang.Math.sqrt(n);
        //Checks if the number is divisible by 2
        if(n % 2 == 0){
            primeList.add(2);
        }

        // Checks if the number is divible by each odd number upto the squareroot of n
        for(int i = 3; i <= root; i+=2){
            if(n % i == 0){
                primeList.add(i);
            }
        }

        int largestPrime = 0;

        for(int prime1 : primeList){
            boolean factor = false;
            for(int prime2 : primeList){

                if(prime1 > prime2){
                    if(prime1 % prime2 == 0){
                        factor = true;
                        break;
                    }
                }
            }
            if(factor == false && prime1 > largestPrime){
                largestPrime = prime1;
            }
        }
        return largestPrime;
    }
}

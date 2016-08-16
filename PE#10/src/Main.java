/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

public class Main {

    public static void main(String[] args) {
        long sum = 2;
        for(int i = 3; i < 2000000; i+=2){
            if(isPrime(i)){
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }else if(n > 2){
            double root = java.lang.Math.sqrt(n);
            for(int i = 3; i <= root; i+=2 ){
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}

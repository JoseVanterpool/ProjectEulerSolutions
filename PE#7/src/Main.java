public class Main {
/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/
    public static void main(String[] args) {
        int primesSeen = 1;
        int lastPrime = 2;
        for (int i = 3; primesSeen < 10001; i+=2){
            if(isPrime(i)){
                lastPrime = i;
                primesSeen++;
            }
        }

        System.out.println(lastPrime);

        return;
    }

    static boolean isPrime (int n){
        if(n<2){
            return false;
        }else if(n > 2){
            double root = java.lang.Math.sqrt(n);
            for(int i = 3; i <= root; i+=2){
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}

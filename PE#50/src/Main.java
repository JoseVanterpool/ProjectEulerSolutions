public class Main {

    public static void main(String[] args) {
        int sum = 2;
        int biggestPrime = 2;
        for (int i = 3; sum < 1000000; i+=2){
            if(isPrime(i)){
                sum += i;
                if(isPrime(sum)){
                    biggestPrime = sum;
                }
            }
        }
        System.out.println(biggestPrime);
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

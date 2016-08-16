public class Main {

/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/


    public static void main(String[] args) {

        int largestPalindrome = 0;

        for(int i = 100; i <= 999; i++){
            for(int j = 100; j <= 999; j++) {
                int num = i*j;
                if (isPalindrome(num) && num > largestPalindrome) {
                    largestPalindrome = num;
                }
            }
        }

        System.out.println(largestPalindrome);

        return;
    }

        public static boolean isPalindrome(int n){
            String number = Integer.toString(n);
            int head = 0;
            int tail = number.length() - 1;

            while(head < tail){
                if(number.charAt(head) == number.charAt(tail)){
                    head ++;
                    tail --;
                }else{
                    return false;
                }
            }
            return true;
        }

}


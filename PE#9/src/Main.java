public class Main {
/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
    public static void main(String[] args) {
        int m;
        int n = 2;
        int A = 0;
        int B = 0;
        int C = 0;

        int sum = A + B + C;
        while(sum !=  1000){
            m = 1;
            while(m < n){
                A = generateA(n , m);
                B = generateB(n , m);
                C = generateC(n , m);
                sum = A + B + C;
                System.out.println("A: " +A +" B: " +B +" C: " +C + " Sum: "+(sum));
                if (sum == 1000){
                    int product = A*B*C;
                    System.out.println("The product of ABC is: " + product);
                    break;
                }
                m++;
            }
            n++;
        }

    }

    static int generateA(int n, int m){
        return (n*n - m*m);
    }

    static int generateB(int n, int m){
        return 2*n*m;
    }

    static int generateC(int n, int m){
        return (n*n + m*m);
    }
}

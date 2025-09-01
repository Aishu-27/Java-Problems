import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // numbers <= 1 are not prime
        if (n <= 1) {
            System.out.println("It is not prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {  
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }
}

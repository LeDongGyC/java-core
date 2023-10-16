package Chuong5.bai22;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        int [] primeNumbers = firstPrimes(n);
        showResult(primeNumbers);

    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[] firstPrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int i = 2;
        while(count<n){
            if(isPrime(i)){
                primes[count]=i;
                count ++;
            }
            i++;
        }
        return primes;
    }
    private static void showResult(int[] primes){
        System.out.println("Mang co " + primes.length + " so nguyen to.");
        for (int numbers : primes) {
            System.out.print("\t"+ numbers);
        }
    }

}



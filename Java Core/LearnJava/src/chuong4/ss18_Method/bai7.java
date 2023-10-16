package chuong4.ss18_Method;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong: ");
        int n = scanner.nextInt();
        int sum = sumDigits(n);
        System.out.println(sum);
    }

    private static int sumDigits(int n) {
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

}

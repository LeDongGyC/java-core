package chuong4.ss18_Method;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
         int n = scanner.nextInt();
        showFirstDigit(n);
    }

    private static void showFirstDigit(int n) {
        while(n>10){
            n/=10;
        }
        System.out.println("chu so dau tien: "+ n);
    }
}

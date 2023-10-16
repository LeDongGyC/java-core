package chuong4.ss21_phuong_thuc_de_quy;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        System.out.println("Chu so dau tien cua " + n + ": " + firstDigits(n));
    }

    private static int firstDigits(int n) {
        if(n<10){
            return n;
        }else {
            return firstDigits(n/10);
        }
    }
}

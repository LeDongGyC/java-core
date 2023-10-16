package chuong4.ss21_phuong_thuc_de_quy;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = scanner.nextInt();
        System.out.println("Tong cac chu so: " + sumDigits(n));
    }

    private static int sumDigits(int n) {
        if(n<10){
            return n;
        }else {
            return n%10 +sumDigits(n/10);
        }
    }
}

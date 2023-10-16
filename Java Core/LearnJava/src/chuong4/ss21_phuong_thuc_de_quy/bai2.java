package chuong4.ss21_phuong_thuc_de_quy;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println("F(" + n + ") = " + fibonaci(n));
    }

    private static long fibonaci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
}

package chuong4.ss21_phuong_thuc_de_quy;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = scanner.nextInt();
        System.out.println("Tong tu 1 den " + n + " = " + sum(n));
    }

    private static int sum(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}

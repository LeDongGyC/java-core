package chuong4.ss21_phuong_thuc_de_quy;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println(n + "! = " + fatorial(n));
    }

    private static long fatorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }


}

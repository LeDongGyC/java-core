package chuong4.ss21_phuong_thuc_de_quy;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = scanner.nextInt();
        System.out.println("Tong: " + sum(n));
    }

    private static float sum(int n) {
        if(n==1){
            return 1;
        } else {
            return 1 / n + sum(n-1);
        }
    }
}

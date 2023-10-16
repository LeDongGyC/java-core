package chuong4.ss21_phuong_thuc_de_quy;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = scanner.nextInt();
        System.out.println("So chu so cua " + n + ": " + countDigits(n));
    }

    private static int countDigits(int n) {
        if(n<10){
            return 1;
        }else{
            return 1 + countDigits(n/10);
        }
    }
}

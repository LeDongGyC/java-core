package chuong4.ss21_phuong_thuc_de_quy;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        b = scanner.nextInt();
        System.out.println("UCLN: " + ucln(a,b));
    }

    private static int ucln(int a, int b) {
        if(a==b){
            return a;
        } else if(a>b){
            return ucln(a-b,b);
        }else
            return ucln(a,b-a);
    }
}

package chuong4.ss18_Method;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 3 so: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int minValue = min(a,b,c);
        System.out.println("so nho nhat: "+ minValue);
    }
    public static int min(int a, int b, int c) {
        int min = a;
        if (min > b) { // nếu b < min thì min là b
            min = b;
        }
        if (min > c) { // sau đó tiếp tục ktra nếu c < min
            min = c; // min là c.
        }
        return min;
    }
}


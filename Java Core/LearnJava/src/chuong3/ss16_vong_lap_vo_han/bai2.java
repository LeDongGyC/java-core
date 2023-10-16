package chuong3.ss16_vong_lap_vo_han;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = scanner.nextInt();
        for (int i = n; i >=2; i--) {
            boolean isPrime = true;
            int bound = (int) Math.sqrt(i);
            for (int j = 2; j <= bound; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && n % i == 0) {
                System.out.println("UCLN: " + i);
                break;
            }
        }
    }
}

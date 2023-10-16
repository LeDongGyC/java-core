package chuong3.ss16_vong_lap_vo_han;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Moi nhap so nguyen lon hon 2: ");
            int n = scanner.nextInt();
            int bound = (int) Math.sqrt(n);
            boolean isPrime = true;
            for (int i = 2; i < bound; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("So ban vua nhap la so nguyen to: " + n);
//                break;
            }
        }
    }
}

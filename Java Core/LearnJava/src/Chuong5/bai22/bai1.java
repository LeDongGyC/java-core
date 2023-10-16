package Chuong5.bai22;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        showArray(numbers);
        long sum = sumElement(numbers);
        System.out.println("Tong cac phan tu trong mang: " + sum);
    }

    private static long sumElement(int[] numbers) {
        long s = 0;
        for (int i = 0; i <numbers.length ; i++) {
            s += numbers[i];
        }
        return s;
    }

    private static void showArray(int[] numbers) {
        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print("\t" + numbers[i]);
        }
        System.out.println();
    }

    private static int[] getNumbers() {
        System.out.println("Nhap so luong phan tu: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Nhap phan tu thu: " + (i+1));
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

}

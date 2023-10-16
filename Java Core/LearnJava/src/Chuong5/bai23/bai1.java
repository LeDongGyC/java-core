package Chuong5.bai23;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        System.out.println("Mang truoc khi sap xep: ");
        showResult(numbers);
        System.out.println();
        System.out.println("Mang sau khi sap xep");
        bubleSort(numbers);
        showResult(numbers);
    }

    private static void showResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }

    private static void bubleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    int x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    private static int[] getNumbers() {
        System.out.println("Nhap so luong phan tu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}


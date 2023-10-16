package Chuong5.bai23;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        System.out.println("Mang truoc khi sap xep: ");
        showResult(numbers);
        System.out.println();
        System.out.println("Mang sau khi sap xep: ");
        Arrays.sort(numbers);
        showResult(numbers);
        int max2 = findMax2(numbers);
        if (max2 != numbers[numbers.length - 1]) {
            showMax2(numbers, max2);
        } else {
            System.out.println("Khong co gia tri thoa");
        }
    }

    private static void showMax2(int[] numbers, int max2) {
        System.out.println("Giá trị max2 = " + max2);
        System.out.print("Chỉ số: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max2) {
                System.out.print(i + " ");
            }
        }
    }

    private static int findMax2(int[] numbers) {
        int max = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != max) {
                return numbers[i];
            }
        }
            return max;
    }

        private static void showResult ( int[] numbers){
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + ", ");
            }
        }

        private static int[] getNumbers () {
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


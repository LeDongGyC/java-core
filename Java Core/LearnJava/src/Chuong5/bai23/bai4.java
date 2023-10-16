package Chuong5.bai23;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        System.out.println("Mang da nhap :");
        showResult(numbers);
        System.out.println();
        System.out.println("Mang sau khi da sap xep");
        sort(numbers);
        showResult(numbers);
        int min2 = findMin2(numbers);
        if (min2 != numbers[numbers.length - 1]) {
            showMin2(numbers, min2);
        }else {
            System.out.println("Khong thoa");
        }
    }

    private static void showMin2(int[] numbers, int min2) {
        System.out.println("\nGia tri lon thu 2: " + min2);
        System.out.print("Chi so: ");
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]==min2){
                System.out.print(i);
            }
            
        }
    }

    private static int findMin2(int[] numbers) {
        int min = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != min) {
                return numbers[i];
            }
        }
        return min;
    }

    private static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    int x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    private static void showResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    private static int[] getNumbers() {
        System.out.println("Nhap so luong: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap so thu " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}

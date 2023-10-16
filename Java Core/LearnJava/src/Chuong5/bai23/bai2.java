package Chuong5.bai23;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        float[] grades = getGrades();
        System.out.println("Diem truoc khi sap xep: ");
        showResult(grades);
        System.out.println();
        System.out.println("Diem sau khi sap xep");
        bubleSort(grades);
        showResult(grades);
    }

    private static void showResult(float[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + "\t");
        }
    }

    private static void bubleSort(float[] grades) {
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = grades.length - 1; j > i; j--) {
                if (grades[j] < grades[j - 1]) {
                    float x = grades[j];
                    grades[j] = grades[j - 1];
                    grades[j - 1] = x;
                }
            }
        }
    }

    private static float[] getGrades() {
        System.out.println("Nhap so luong hoc sinh: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] grades = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap diem hoc sinh " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            if (grades[i] < 0 || grades[i] > 10) {
                System.out.println("Vui long nhap lai: ");
                i--;
            }
        }
        return grades;
    }
}


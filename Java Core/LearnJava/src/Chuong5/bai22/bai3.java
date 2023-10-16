package Chuong5.bai22;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        String result = isRevert(numbers)? "Mang doi xung": "Mang khong doi xung";
        System.out.println(result);
    }

    private static int[] getNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong mang: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.println("Nhap phan tu thu: " + (i+1));
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static boolean isRevert(int[] numbers){
        for (int i = 0; i <=numbers.length/2 ; i++) {
            if(numbers[i]==numbers[numbers.length-i-1]){
                return true;
            }
        }
        return false;
    }
}

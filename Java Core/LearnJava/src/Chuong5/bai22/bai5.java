package Chuong5.bai22;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.println("Nhap chuoi: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] word = str.split("\\s+");
        for (int i = word.length-1; i >=0 ; i--) {
            System.out.print(word[i] + " ");
        }
    }
}

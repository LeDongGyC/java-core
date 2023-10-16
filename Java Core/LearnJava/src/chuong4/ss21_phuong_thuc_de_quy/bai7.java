package chuong4.ss21_phuong_thuc_de_quy;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String str = scanner.nextLine();
         showRevert(str, str.length()-1);
    }

    private static void showRevert(String str, int pos) {
        if(pos>=0){
            System.out.print(str.charAt(pos));
            showRevert(str, pos-1);
        }
    }
}

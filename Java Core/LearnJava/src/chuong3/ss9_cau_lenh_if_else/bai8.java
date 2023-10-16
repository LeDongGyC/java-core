package chuong3.ss9_cau_lenh_if_else;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = scanner.nextLine();
        if(str.charAt(0) == str.charAt(str.length()-1)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }


}

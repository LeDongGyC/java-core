package chuong3.ss9_cau_lenh_if_else;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Nhap 1 chuoi: ");
        str = scanner.nextLine();
//        if(str.startsWith(" ")){
        if(str.matches("^\\s+.*")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

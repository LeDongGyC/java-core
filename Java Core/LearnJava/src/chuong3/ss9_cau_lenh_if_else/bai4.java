package chuong3.ss9_cau_lenh_if_else;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1;
        String str2;
        System.out.println("Nhap vao chuoi str1: ");
        str1 = scanner.nextLine();
        System.out.println("Nhap vao chuoi str2: ");
        str2 = scanner.nextLine();
        int result = str1.compareTo(str2);
        if(result<0){
            System.out.println("str1 dung truoc str2");
        } else if(result==0){
            System.out.println("2 chuoi tuong duong");
        }else {
            System.out.println("str1 dung sau str2");
        }
    }
}

package chuong3.ss9_cau_lenh_if_else;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        if(name.matches("^[a-zA-Z\\s]+$")){
            System.out.println("Ten hop le");
        }else {
            System.out.println("Ten khong hop le");
        }
    }

}

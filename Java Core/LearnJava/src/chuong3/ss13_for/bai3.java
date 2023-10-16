package chuong3.ss13_for;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự: ");
        String str = input.nextLine();
        str = str.trim(); // loại bỏ các dấu cách thừa
        // thay thế các chỗ có 1 hoặc nhiều khoảng trắng bằng 1 dấu cách
        str = str.replace("\\s+", " ");
        System.out.println("Chuỗi sau chuẩn hóa: " + str);
        // tiến hành kiểm tra và in ra
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) { // in ra chữ cái đầu từ đầu tiên
                System.out.println(str.charAt(i));
            }
            if (str.charAt(i) == ' ') { // in ra chữ cái đầu từ tiếp theo
                System.out.println(str.charAt(i + 1));
            }
        }
    }
}

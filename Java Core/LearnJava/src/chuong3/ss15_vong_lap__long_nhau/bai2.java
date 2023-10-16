package chuong3.ss15_vong_lap__long_nhau;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác: ");
        int h = input.nextInt();
        // vẽ tam giác theo hướng: hàng thứ 1 in ra h dấu *
        // từ hàng thứ 2 bắt đầu giảm đi mỗi hàng 1 dấu *
        // so với hàng trước nó
        for (int i = h; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

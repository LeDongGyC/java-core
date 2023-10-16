package Chuong6.bai30;

import java.util.Scanner;

public class bai1 {
    enum Season {
        SPRING("MUA XUAN"), SUMMER("MUA HA"), FALL("MUA THU"), WINTER("MUA DONG");
        private String value;

        Season(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println(Season.SPRING.getValue());
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(Season.SUMMER.getValue());
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(Season.FALL.getValue());
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(Season.WINTER.getValue());
        }
    }
}

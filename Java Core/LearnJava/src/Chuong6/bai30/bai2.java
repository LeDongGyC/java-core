package Chuong6.bai30;

import java.util.Scanner;

public class bai2 {
    enum Zodiac {
        THE_RAT("TÝ"), THE_OX("SỬU"), THE_TIGER("DẦN"),
        THE_CAT("MÃO"), THE_DRAGON("THÌN"), THE_SNAKE("TỴ"),
        THE_HORSE("NGỌ"), THE_GOAT("MÙI"), THE_MONKEY("THÂN"),
        THE_ROOTSTER("DẬU"), THE_DOG("TUẤT"), THE_PIG("HỢI");

        private String value;

        Zodiac(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri 1-12: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println(Zodiac.THE_RAT.getValue());
                break;
            case 2:
                System.out.println(Zodiac.THE_OX.getValue());
                break;
            case 0:
                System.out.println("Chuong trinh dang thoat...");
//                System.exit(0);
        }
    }
}

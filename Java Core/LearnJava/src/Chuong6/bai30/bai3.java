package Chuong6.bai30;

import java.util.Scanner;

public class bai3 {
    enum DayOfWeek {
        THU_HAI("MOMDAY");
        private String value;

        DayOfWeek(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    public static void main(String[] args) {
        System.out.println("Nhap thu: ");
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();
        if(dayOfWeek == "THU HAI"){
            System.out.println(DayOfWeek.THU_HAI.getValue());
        }
    }

}

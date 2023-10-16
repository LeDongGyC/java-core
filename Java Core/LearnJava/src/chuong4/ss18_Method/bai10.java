package chuong4.ss18_Method;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 cau: ");
        String str = scanner.nextLine();
        int count = countVowl(str.toLowerCase());
        System.out.println("So nguyen ma trong chuoi: " + count);
    }

    private static int countVowl(String str) {
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='o'||str.charAt(i)=='a'||str.charAt(i)=='i'){
                count ++;
            }
        }
        return count;
    }
}

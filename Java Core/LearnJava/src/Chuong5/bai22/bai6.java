package Chuong5.bai22;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        String[] friends = getFriends();
        showResult(friends);

    }

    private static String[] getFriends() {
        System.out.println("Nhap so luong ban: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] friends = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap nguoi ban: " + (i + 1));
            friends[i] = scanner.next();
        }
        return friends;
    }

    private static int findMinLength(String[] friends) {
        int min = friends[0].length();
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].length() < min) {
                min = friends[i].length();
            }
        }
        return min;
    }

    private static void showResult(String[] friends) {
        int minName = findMinLength(friends);
        for (String friend : friends) {
            if(friend.length() == minName){
                System.out.println("Ten ban ngan nhat la " + friend);
            }
        }
    }
}

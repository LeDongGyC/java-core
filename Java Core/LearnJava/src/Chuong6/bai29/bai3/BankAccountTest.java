package Chuong6.bai29.bai3;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tai khoan cua ban:  ");
        String accNumber = scanner.nextLine();
        bankAccount.setOwner(accNumber);
        System.out.println("Nhap ten tai khoan cua ban: ");
        String owner = scanner.nextLine();
        bankAccount.setAccNumber(owner);
        bankAccount.setBallance(15_000_000);
        System.out.println("Nhap so tien ban muon gui: ");
        long amount = scanner.nextLong();
        bankAccount.deposit(amount);

        System.out.println("Ten tai khoan: " + bankAccount.getOwner());
        System.out.println("So tai khoan: " + bankAccount.getAccNumber());

        System.out.println("Nhap so tien muon rut: ");
        long money = scanner.nextLong();
        if (bankAccount.withdraw(money)) {
            System.out.println("Rut tien thanh cong: ");
            bankAccount.checkAccBallance();
        } else {
            System.out.println("Vui long nhap lai:");
        }
    }
}

package Chuong6.bai27.bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tai khoan cua ban: ");
        bankAccount.accNumber = scanner.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        bankAccount.owner = scanner.nextLine();
        bankAccount.ballance = 20000;
        System.out.println("Nhap so tien muon chuyen vao: ");
        long money = scanner.nextLong();
        bankAccount.deposit(money);
        System.out.println("Nhap so tien muon rut: ");
        long amount = scanner.nextLong();
        if(bankAccount.withdraw(amount)){
            System.out.println("Rut thanh cong!");
            bankAccount.checkAccBallance();
        }else {
            System.out.println("Vui long nhap lai: ");
        }
    }
}

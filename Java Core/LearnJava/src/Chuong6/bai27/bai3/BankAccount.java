package Chuong6.bai27.bai3;

public class BankAccount {
    public String accNumber;    // số tài khoản
    public String owner;        // chủ tài khoản
    public String type;         // loại tài khoản(vd: tiết kiệm)
    public long ballance;       // số dư
    public String bankName;     // tên ngân hàng
    public String startDate;    // ngày phát hành
    public String endDate;      // ngày hết hạn

    public BankAccount() {
        accNumber = "";
        owner = "";
        type = "";
        ballance = 0;
        bankName = "";
        startDate = "";
        endDate = "";
    }

    public BankAccount(String accNumber, String owner) {
        this.accNumber = accNumber;
        this.owner = owner;
    }

    public boolean deposit(long amount) {
        if (amount > 0) {
            ballance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(long amount) {
        if(amount>0 && amount<=ballance){
            ballance -= amount;
            return true;
        }
        return false;
    }

    public void checkAccBallance() {
        System.out.println("Số dư của bạn hiện tại là: " + ballance);
    }
}

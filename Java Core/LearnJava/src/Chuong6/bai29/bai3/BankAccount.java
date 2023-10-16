package Chuong6.bai29.bai3;

public class BankAccount {
    private String accNumber;   // so tk
    private String owner;       // ten tk
    private String type;        // loai tai khoan
    private long ballance;      // số dư
    private String bankName;    // tên ngân hàng
    private String startDate;   // ngày phát hành
    private String endDate;     // ngày hết hạn

    public BankAccount() {
    }

    public BankAccount(String accNumber) {
        this.accNumber = accNumber;
    }

    public BankAccount(String accNumber, String owner) {
        this(accNumber);
        this.owner = owner;
    }

    public BankAccount(String accNumber, String owner, String type) {
        this(accNumber, owner);
        this.type = type;
    }

    public BankAccount(String accNumber, String owner, String type, long ballance) {
        this(accNumber, owner, type);
        this.ballance = ballance;
    }

    public BankAccount(String accNumber, String owner, String type, long ballance, String bankName) {
        this(accNumber, owner, type, ballance);
        this.bankName = bankName;
    }

    public BankAccount(String accNumber, String owner, String type, long ballance, String bankName, String startDate) {
        this(accNumber, owner, type, ballance, bankName);
        this.startDate = startDate;
    }

    public BankAccount(String accNumber, String owner, String type, long ballance, String bankName, String startDate, String endDate) {
        this(accNumber, owner, type, ballance, bankName, startDate);
        this.endDate = endDate;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBallance() {
        return ballance;
    }

    public void setBallance(long ballance) {
        this.ballance = ballance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean deposit(long amount) {
        if (amount > 0) {
            ballance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(long amount) {
        if (amount > 0 && amount < ballance) {
            ballance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void checkAccBallance() {
        System.out.println("Số dư của bạn hien tại là: " + ballance);
    }
}

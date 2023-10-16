package Chuong6.bai27.bai1;

public class Employee {
    public String id;
    public String fullName;
    public String address;
    public int age;
    public String phoneNumber;
    public float salary;
    public float experience;

    public void work (String job) {
        System.out.println(fullName + " đang làm nhiệm vụ " + job);
    }

    public void receiveSalary(float amount){
    System.out.println(fullName + " da nhap luong thang nay: " + amount);
    }
}



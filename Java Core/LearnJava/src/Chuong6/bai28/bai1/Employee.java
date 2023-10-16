package Chuong6.bai28.bai1;

public class Employee {
    public String id;
    public String fullName;
    public String address;
    public int age;
    public float salary;
    public float experience;

    public Employee() {
    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String fullName) {
        this(id);
        this.fullName = fullName;
    }

    public Employee(String id, String fullName, String address) {
        this(id, fullName);
        this.address = address;
    }

    public Employee(String id, String fullName, String address, int age) {
        this(id, fullName, address);
        this.age = age;
    }

    public Employee(String id, String fullName, String address, int age, float salary, float experience) {
        this(id, fullName, address, age);
        this.experience = experience;
    }

    public void job(String job) {
        System.out.println(fullName + " dang lam nhiem vu " + job);
    }

    public void relax() {
        System.out.println(fullName + " dang nghi ngoi");
    }

    public void receiveSalary(float amount) {
        salary = amount;
        System.out.println(fullName + " đã nhận lương tháng là " + salary + "đ");
    }
}




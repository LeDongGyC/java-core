package Chuong6.bai29.bai1;

public class Employee {
    private String id;
    private String fullName;
    private String address;
    private int age;
    private String phoneNumber;
    private float salary;
    private float experience;

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

    public Employee(String id, String fullName, String address, int age, String phoneNumber) {
        this(id, fullName, address, age);
        this.phoneNumber = phoneNumber;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber, float salary) {
        this(id, fullName, address, age, phoneNumber);
        this.salary = salary;
    }

    public Employee(String id, String fullName, String address, int age, String phoneNumber, float salary, float experience) {
        this(id, fullName, address, age, phoneNumber, salary);
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public String setFullName(String fullName) {
        this.fullName = fullName;
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public void work(String job) {
        System.out.println(fullName + " dang lam " + job);
    }

    public void relax() {
        System.out.println(fullName + " dang nghi ngoi");
    }

    public void receiveSalary(float amount) {
        salary = amount;
        System.out.println(fullName + " da nhan luong thang nay: " + salary);
    }

    public void travel(String someWhere) {
        System.out.println(fullName + " đang vi vu ở " + someWhere);
    }
}

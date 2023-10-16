package Chuong6.bai29.bai1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        String fullName = "Pham Le Dong";
        employee1.setFullName(fullName);
        String address = "Quang Nam";
        employee1.setAddress(address);
        int age = 18;
        employee1.setAge(age);
        System.out.println(fullName + " \t" + address + "\t" + age);
        employee1.work("Lap trinh vien");
        employee1.receiveSalary(15_000_000);
    }
}

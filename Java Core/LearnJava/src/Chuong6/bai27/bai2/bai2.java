package Chuong6.bai27.bai2;

public class bai2 {
    public static void main(String[] args) {
        Address address = new Address();
        address.district = ("Khoi 1");
        address.city = "Quang Nam";
        System.out.println("Dia chi cua toi: " + address.myAddress());
    }
}

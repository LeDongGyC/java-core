package Chuong6.bai29.bai2;

public class AddressTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Quang Nam");
        address.setDistrict("Nui Thanh");
        address.setVillage("Thi Tran");
        System.out.println("Tinh: " + address.getCity());
        System.out.println("Huyen: " + address.getDistrict());
    }
}

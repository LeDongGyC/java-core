package Chuong6.bai27.bai2;

public class Address {
    public String number;
    public String lane;
    public String road;
    public String village;
    public String wards;
    public String district;
    public String city;

    public Address() {
        number = "";
        lane = "";
        road = "";
        village = "";
        wards = "";
        district = "";
        city = "";
    }

    public Address(String district, String city){
        this.city = city;
        this.district = district;
    }

    public String myAddress(){
        String address = "";
        if(!number.isEmpty()) {
            address += "Số " + number;
        }
        if(!lane.isEmpty()) {
            address += " ngõ " + lane;
        }
        if(!road.isEmpty()) {
            address += " đường " + road;
        }
        if(!village.isEmpty()) {
            address += " thôn/xóm " + village;
        }
        if(!wards.isEmpty()) {
            address += " xã/phường " + wards;
        }
        if(!district.isEmpty()) {
            address += " quận/huyện " + district;
        }
        if(!city.isEmpty()) {
            address += " tỉnh/thành phố " + city;
        }
       return address;
    }
}

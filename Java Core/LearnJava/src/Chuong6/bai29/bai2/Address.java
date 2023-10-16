package Chuong6.bai29.bai2;

public class Address {
    private String number;
    private String lane;
    private String road;
    private String village;
    private String wards;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String number) {
        this.number = number;
    }

    public Address(String number, String lane) {
        this(number);
        this.lane = lane;
    }

    public Address(String number, String lane, String road) {
        this(number, lane);
        this.road = road;
    }

    public Address(String number, String lane, String road, String village) {
        this(number, lane, road);
        this.village = village;
    }

    public Address(String number, String lane, String road, String village, String wards) {
        this(number, lane, road, village);
        this.wards = wards;
    }

    public Address(String number, String lane, String road, String village, String wards, String district) {
        this(number, lane, road, village, wards);
        this.district = district;
    }

    public Address(String number, String lane, String road, String village, String wards, String district, String city) {
        this(number, lane, road, village, wards, district);
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String fullAddress() {
        String address = "";
        if (!number.isEmpty()) {
            address += "Số " + number;
        }
        if (!lane.isEmpty()) {
            address += " ngõ " + lane;
        }
        if (!road.isEmpty()) {
            address += " đường " + road;
        }
        if (!village.isEmpty()) {
            address += " thôn/xóm " + village;
        }
        if (!wards.isEmpty()) {
            address += " xã/phường " + wards;
        }
        if (!district.isEmpty()) {
            address += " quận/huyện " + district;
        }
        if (!city.isEmpty()) {
            address += " tỉnh/thành phố " + city;
        }
        return address;
    }
}

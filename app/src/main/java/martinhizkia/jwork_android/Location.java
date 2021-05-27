package martinhizkia.jwork_android;

public class Location {
    private String province;
    private String description;
    private String city;
    public String getProvince() {
        return province;
    }
    public String getDescription() {
        return description;
    }
    public String getCity() {
        return city;
    }
    public Location(String province, String description, String city){
        this.province = province;
        this.description = description;
        this.city = city;
    }
}

package martinhizkia.jwork_android;

public class Recruiter {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    public Recruiter(int recruiterId, String name, String email, String phoneNumber, Location location){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public Location getLocation() {
        return location;
    }

}

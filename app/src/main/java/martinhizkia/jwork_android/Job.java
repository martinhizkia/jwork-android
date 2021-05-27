package martinhizkia.jwork_android;

public class Job {
    private int id;
    private String name;
    public Job(int id, String name, Recruiter recruiter, int fee, String category) {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }
    private Recruiter recruiter;
    private int fee;
    private String category;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Recruiter getRecruiter() {
        return recruiter;
    }
    public int getFee() {
        return fee;
    }
    public String getCategory() {
        return category;
    }
}

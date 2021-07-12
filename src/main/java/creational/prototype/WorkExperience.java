package creational.prototype;

/**
 * @author Jonny Long
 * @date 2021/4/21 19:33
 */
public class WorkExperience {
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public WorkExperience() {
    }

    public WorkExperience(String workDate, String company) {
        this.workDate = workDate;
        this.company = company;
    }

    public WorkExperience clone(){
        WorkExperience workExperience = new WorkExperience();
        workExperience.setWorkDate(this.workDate);
        workExperience.setCompany(this.company);
        return workExperience;
    }
}

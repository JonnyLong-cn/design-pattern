package creational.prototype;

/**
 * @author Jonny Long
 * @date 2021/4/21 19:37
 */
public class Resume {
    private String name;
    private Integer age;
    private WorkExperience work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public WorkExperience getWork() {
        return work;
    }

    public void setWork(WorkExperience work) {
        this.work = work;
    }

    public Resume clone(){
        Resume resume = new Resume();
        resume.setAge(this.age);
        resume.setName(this.name);
        WorkExperience workClone = work.clone();
        resume.setWork(workClone);
        return resume;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=[workDate = " + work.getWorkDate() +
                ", company = "+work.getCompany() +"]"+
                '}';
    }
}

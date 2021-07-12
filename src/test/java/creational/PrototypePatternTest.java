package creational;

import creational.prototype.Resume;
import creational.prototype.WorkExperience;
import org.junit.Test;

/**
 * @author Jonny Long
 * @date 2021/4/21 20:16
 */
public class PrototypePatternTest {
    @Test
    public void test(){
        Resume resume1 = new Resume();
        resume1.setName("张三");
        resume1.setAge(30);
        WorkExperience workExperience = new WorkExperience("2021/04/24","阿里巴巴");
        resume1.setWork(workExperience);
        System.out.println(resume1);

        Resume resume2 = resume1.clone();
        resume2.setName("李四");
        resume2.setWork(new WorkExperience("2021/06/05","字节跳动"));
        System.out.println(resume2);

        Resume resume3 = resume1.clone();
        resume3.setName("王五");
        resume3.setAge(18);
        System.out.println(resume3);
    }
}

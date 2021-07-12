package behavioral.observer.subject;

import behavioral.observer.subject.Subject;

/**
 * @author Jonny Long
 * @date 2021/7/3 9:59
 */
public class ConcreteSubject extends Subject {
    private String subjectState = "aaa";
    public String getState(){
        return subjectState;
    }
    public void setState(String s){
        subjectState = s;
    }
}

package behavioral.observer.subject;

import behavioral.observer.observer.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Jonny Long
 * @date 2021/7/3 9:55
 */
public class Subject {
    private List<Observer> observerList = new LinkedList<>();
    public void attach(Observer observer){
        observerList.add(observer);
    }
    public void detach(Observer observer){
        observerList.remove(observer);
    }
    public void notifyObserver(){
        for (Observer o:observerList) {
            o.update();
        }
    }
}

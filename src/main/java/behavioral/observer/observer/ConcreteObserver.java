package behavioral.observer.observer;

import behavioral.observer.subject.ConcreteSubject;

/**
 * @author Jonny Long
 * @date 2021/7/3 10:01
 */
public class ConcreteObserver implements Observer {
    private int num;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject,int num) {
        this.num = num;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getState();
        System.out.println("观察者:"+num+"的状态是"+observerState);
    }

    public ConcreteSubject getSubject(){
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}

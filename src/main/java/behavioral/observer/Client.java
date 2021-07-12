package behavioral.observer;

import behavioral.observer.observer.ConcreteObserver;
import behavioral.observer.subject.ConcreteSubject;

/**
 * @author Jonny Long
 * @date 2021/7/3 10:05
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver(subject,1));
        subject.attach(new ConcreteObserver(subject,2));
        subject.attach(new ConcreteObserver(subject,3));
        subject.setState("ABC");
        subject.notifyObserver();
    }
}

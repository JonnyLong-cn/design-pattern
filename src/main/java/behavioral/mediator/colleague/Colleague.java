package behavioral.mediator.colleague;

import behavioral.mediator.mediator.Mediator;

/**
 * @author Jonny Long
 * @date 2021/7/3 9:33
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }
    public abstract void send(String message);
    public abstract void notify(String message);
}

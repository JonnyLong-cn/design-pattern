package behavioral.mediator.colleague.impl;

import behavioral.mediator.colleague.Colleague;
import behavioral.mediator.mediator.Mediator;

/**
 * @author Jonny Long
 * @date 2021/7/3 9:37
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void notify(String message) {
        System.out.println("同事2得到消息:"+message);
    }
}

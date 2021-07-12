package behavioral.mediator.mediator.impl;

import behavioral.mediator.colleague.Colleague;
import behavioral.mediator.colleague.impl.ConcreteColleague1;
import behavioral.mediator.colleague.impl.ConcreteColleague2;
import behavioral.mediator.mediator.Mediator;

/**
 * @author Jonny Long
 * @date 2021/7/3 9:38
 */
public class ConcreteMediator implements Mediator {
    private ConcreteColleague1 col1;
    private ConcreteColleague2 col2;

    public void setCol1(ConcreteColleague1 col1) {
        this.col1 = col1;
    }

    public void setCol2(ConcreteColleague2 col2) {
        this.col2 = col2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (col1.equals(colleague)) {
            col2.notify(message);
        } else if (col2.equals(colleague)) {
            col1.notify(message);
        }
    }
}

package behavioral.mediator;

import behavioral.mediator.colleague.impl.ConcreteColleague1;
import behavioral.mediator.colleague.impl.ConcreteColleague2;
import behavioral.mediator.mediator.impl.ConcreteMediator;

/**
 * @author Jonny Long
 * @date 2021/7/3 9:41
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);
        mediator.setCol1(c1);
        mediator.setCol2(c2);
        c1.send("谢谢");
        c2.send("你好");
    }
}

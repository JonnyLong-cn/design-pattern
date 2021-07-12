package behavioral.mediator.mediator;

import behavioral.mediator.colleague.Colleague;

/**
 * @author Jonny Long
 * @date 2021/7/3 9:34
 */
public interface Mediator {
    void send(String message, Colleague colleague);
}

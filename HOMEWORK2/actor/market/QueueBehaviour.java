package HOMEWORK2.actor.market;

import HOMEWORK2.actor.actor.*;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();

}
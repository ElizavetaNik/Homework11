package HOMEWORK2.actor.market;

import HOMEWORK2.actor.actor.*;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();

}
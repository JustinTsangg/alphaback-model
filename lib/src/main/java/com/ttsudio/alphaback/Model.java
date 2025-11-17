package com.ttsudio.alphaback;

import java.util.List;

public interface Model {
    // ticker -> buy(true)/sell(false)
    public List<Order> simulateStep(State state);
}

package com.ttsudio.alphaback;

import java.util.ArrayList;
import java.util.List;

public class ExampleModel implements Model{
    @Override
    public List<Order> simulateStep(State state) {
        List<Order> decisions = new ArrayList<>();
        
        //Sell all owned assets
        state.ownedAssets().forEach((stock, amt) -> {
            decisions.add(new Order(stock, amt, false));
        });

        //buy 10 random stocks
        List<String> stocks = new ArrayList<>(state.pricesMap().keySet());
        for(int i = 0; i < 10; i++){
            String stock = stocks.get((int)(Math.random() * stocks.size()));
            decisions.add(new Order(stock, 1.0f, true));
        }

        return decisions;
    }
}

package com.ttsudio.alphaback;

import java.util.Map;

public interface Model {
    public Map<String,Boolean> simulateStep(State state);
}

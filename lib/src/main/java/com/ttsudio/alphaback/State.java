package com.ttsudio.alphaback;

import java.util.Map;

public record State(Map<String,Float> pricesMap, Map<String, Float> ownedAssets) {
    
}

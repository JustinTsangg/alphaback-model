package com.ttsudio.alphaback;

import java.util.List;
import java.util.Map;

public record State(Map<String,Float> pricesMap, List<String> ownedAssets) {
    
}

package designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class IceCreamRegistry {
    Map<String, IceCream> stringIceCreamMap = new HashMap<>();

    IceCream get(String key) {
        return (IceCream) stringIceCreamMap.get(key).clone();
    }

    void put(String key, IceCream iceCream) {
        stringIceCreamMap.put(key, iceCream);
    }
}

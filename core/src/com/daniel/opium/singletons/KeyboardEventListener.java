package com.daniel.opium.singletons;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyboardEventListener {
    private static KeyboardEventListener instance;
    private HashMap<Integer, ArrayList<Runnable>> functionsPerKey = new HashMap<>();
    private KeyboardEventListener(){};

    public static KeyboardEventListener getInstance() {
        if (instance == null) {
            instance = new KeyboardEventListener();
        }
        return instance;
    }

    public void addListener(int key, Runnable function) {
        if (functionsPerKey.get(key) == null) {
            functionsPerKey.put(key, new ArrayList<Runnable>());
        }
        functionsPerKey.get(key).add(function);
    }

    public void runByKey(int key) {
        for (Runnable runnable : functionsPerKey.get(key)) {
            runnable.run();
        }
    }
}

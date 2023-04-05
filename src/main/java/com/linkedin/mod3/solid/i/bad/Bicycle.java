package com.linkedin.mod3.solid.i.bad;

public class Bicycle implements Vehicle {
    public void start() {
        throw new UnsupportedOperationException("Bicycles don't have engines!");
    }

    public void stop() {
        throw new UnsupportedOperationException("Bicycles don't have engines!");
    }

    public void steer() {
        // steer the bicycle
    }

    public void accelerate() {
        // pedal faster
    }

    public void brake() {
        // brake the bicycle
    }
}


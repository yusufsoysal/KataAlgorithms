package com.yusufsoysal.algorithms.codechallenge.busgossip.model;

import org.apache.commons.collections4.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {
    private List<Integer> busStops;
    private int currentStopIndex = 0;
    private Set<Driver> gossippedDrivers = new HashSet<>();

    public Driver(List<Integer> busStops) {
        if(CollectionUtils.isEmpty(busStops)){
            throw new IllegalArgumentException("At least one bus stop is needed");
        }

        this.busStops = busStops;
    }

    public int moveBusToNextStop() {
        currentStopIndex = (currentStopIndex + 1) % busStops.size();
        return busStops.get( currentStopIndex );
    }

    public void makeGossipWith(Driver otherDriver) {
        gossippedDrivers.addAll( otherDriver.getGossippedDrivers() );
        gossippedDrivers.add( otherDriver );
    }

    public Set<Driver> getGossippedDrivers() {
        return gossippedDrivers;
    }

    public boolean hadGossipWith(Driver otherDriver) {
        return gossippedDrivers.contains(otherDriver);
    }
}

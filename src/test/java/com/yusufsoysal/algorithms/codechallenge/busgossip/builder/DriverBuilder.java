package com.yusufsoysal.algorithms.codechallenge.busgossip.builder;

import com.yusufsoysal.algorithms.codechallenge.busgossip.model.Driver;

import java.util.*;

public final class DriverBuilder {
    private List<Integer> busStops = new ArrayList<>();
    private Set<Driver> gossippedDrivers = new HashSet<>();

    private DriverBuilder() {
    }

    public static DriverBuilder aDriver() {
        return new DriverBuilder();
    }

    public DriverBuilder withBusStops(Integer... busStop) {
        busStops.addAll(Arrays.asList(busStop));
        return this;
    }

    public DriverBuilder withGossippedDrivers(Driver... drivers) {
        this.gossippedDrivers.addAll(Arrays.asList(drivers));
        return this;
    }

    public Driver build() {
        Driver driver = new Driver(busStops);
        gossippedDrivers.stream()
                .forEach(otherDriver -> driver.makeGossipWith(otherDriver));
        return driver;
    }
}

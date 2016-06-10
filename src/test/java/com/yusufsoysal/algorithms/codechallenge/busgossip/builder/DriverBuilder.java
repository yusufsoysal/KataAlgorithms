package com.yusufsoysal.algorithms.codechallenge.busgossip.builder;

import com.yusufsoysal.algorithms.codechallenge.busgossip.model.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class DriverBuilder {
    private List<Integer> busStops = new ArrayList<>();

    private DriverBuilder() {
    }

    public static DriverBuilder aDriver() {
        return new DriverBuilder();
    }

    public DriverBuilder withBusStops(Integer ... busStop) {
        busStops.addAll(Arrays.asList(busStop));
        return this;
    }

    public Driver build() {
        Driver driver = new Driver(busStops);
        return driver;
    }
}

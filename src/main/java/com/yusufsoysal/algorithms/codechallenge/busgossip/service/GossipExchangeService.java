package com.yusufsoysal.algorithms.codechallenge.busgossip.service;

import com.yusufsoysal.algorithms.codechallenge.busgossip.model.Driver;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GossipExchangeService {


    public Integer makeDriversExchangeGossip(Driver... drivers) {
        boolean notAllGossipsExchanged;
        Integer numberOfStops = 0;

        int maxIterationCount = determineMaxIterationCount(drivers);

        do {
            numberOfStops++;

            exchangeGossip(drivers);
            notAllGossipsExchanged = !isAllGossipsCompleted(drivers);

            if( notAllGossipsExchanged ){
                moveBusesIfNeeded(drivers);
            }
        } while (notAllGossipsExchanged && numberOfStops <= maxIterationCount);

        if (!notAllGossipsExchanged) {
            return numberOfStops;
        }

        return null;
    }

    private void moveBusesIfNeeded(Driver[] drivers) {
        for (Driver driver : drivers) {
            driver.moveBusToNextStop();
        }
    }

    private boolean isAllGossipsCompleted(Driver[] drivers) {
        int numberOfDrivers = drivers.length;
        return !Arrays.stream(drivers)
                .filter(driver -> driver.getGossippedDriversCount() != numberOfDrivers)
                .findAny()
                .isPresent();
    }

    private void exchangeGossip(Driver[] drivers) {
        IntStream.range(0, drivers.length)
                .forEach(index1 ->
                        IntStream.range(index1 + 1, drivers.length)
                                .filter(index2 -> drivers[index1].getCurrentStop() == drivers[index2].getCurrentStop())
                                .forEach(index2 -> {
                                    drivers[index1].makeGossipWith(drivers[index2]);
                                    drivers[index2].makeGossipWith(drivers[index1]);
                                })
                );
    }

    private int determineMaxIterationCount(Driver[] drivers) {
        Integer maxIterationCount = Arrays.stream(drivers)
                .map(Driver::getStopCount)
                .reduce((a, b) -> findLeastCommonMultiple(a, b))
                .get();

        return maxIterationCount;
    }

    private int findLeastCommonMultiple(int numberOne, int numberTwo) {
        final int bigger = Math.max(numberOne, numberTwo);
        final int smaller = Math.min(numberOne, numberTwo);

        return IntStream.rangeClosed(1, smaller)
                .filter(factor -> (factor * bigger) % smaller == 0)
                .map(factor -> Math.abs(factor * bigger))
                .findFirst()
                .getAsInt();
    }
}

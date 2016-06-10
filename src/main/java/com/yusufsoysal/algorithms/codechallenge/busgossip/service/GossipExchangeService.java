package com.yusufsoysal.algorithms.codechallenge.busgossip.service;

import com.yusufsoysal.algorithms.codechallenge.busgossip.model.Driver;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GossipExchangeService {


    public Integer makeDriversExchangeGossip(Driver ... drivers) {

        boolean allGossipsCompleted;
        Integer numberOfStops = 0;

        int maxIterationCount = determineMaxIterationCount(drivers);

        do {
            numberOfStops++;
            for( int i = 0; i<drivers.length; i++ ){
                for( int j=i+1; j<drivers.length; j++ ){
                    Driver driver1 = drivers[i];
                    Driver driver2 = drivers[j];

                    if( driver1.getCurrentStop() == driver2.getCurrentStop() ){
                        driver1.makeGossipWith(driver2);
                        driver2.makeGossipWith(driver1);
                    }
                }
            }

            allGossipsCompleted = true;
            for (Driver driver : drivers) {
                if( driver.getGossippedDrivers().size() != drivers.length ){
                    allGossipsCompleted = false;
                }
            }

            if( !allGossipsCompleted ){
                for (Driver driver : drivers) {
                    driver.moveBusToNextStop();
                }
            }
        } while( !allGossipsCompleted && numberOfStops <= maxIterationCount);

        if( allGossipsCompleted ){
            return numberOfStops;
        }

        return null;
    }

    private int determineMaxIterationCount(Driver ... drivers){
        Integer maxIterationCount = Arrays.stream(drivers)
                .map(Driver::getStopCount)
                .reduce((a, b) -> findLeastCommonMultiple(a, b))
                .get();

        return maxIterationCount;
    }

    private int findLeastCommonMultiple(int numberOne, int numberTwo) {
        final int bigger = Math.max(numberOne, numberTwo);
        final int smaller = Math.min(numberOne, numberTwo);

        return IntStream.rangeClosed(1,smaller)
                .filter(factor -> (factor * bigger) % smaller == 0)
                .map(factor -> Math.abs(factor * bigger))
                .findFirst()
                .getAsInt();
    }
}

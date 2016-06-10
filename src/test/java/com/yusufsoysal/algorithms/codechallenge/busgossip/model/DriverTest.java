package com.yusufsoysal.algorithms.codechallenge.busgossip.model;

import com.yusufsoysal.algorithms.codechallenge.busgossip.builder.DriverBuilder;
import junitparams.naming.TestCaseName;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DriverTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveAtLeastOneStop(){
        new Driver(Collections.emptyList());
    }

    @Test
    public void shouldMoveToNextStop(){
        Driver driver = new Driver(Arrays.asList(1,2,3,4,5));

        assertThat(driver.moveBusToNextStop(), is(equalTo(2)));
        assertThat(driver.moveBusToNextStop(), is(equalTo(3)));
        assertThat(driver.moveBusToNextStop(), is(equalTo(4)));
        assertThat(driver.moveBusToNextStop(), is(equalTo(5)));
    }

    @Test
    public void shouldMoveToFirstStopWhenItGotToLast(){
        Driver driver = new Driver(Arrays.asList(1,2,3));

        driver.moveBusToNextStop(); // second stop
        driver.moveBusToNextStop(); // last stop

        assertThat(driver.moveBusToNextStop(), is(equalTo(1)));
    }

    @Test
    public void shouldMoveEvenThereIsOnlyOneStop(){
        Driver driver = new Driver(Collections.singletonList(1));

        assertThat(driver.moveBusToNextStop(), is(equalTo(1)));
        assertThat(driver.moveBusToNextStop(), is(equalTo(1)));
        assertThat(driver.moveBusToNextStop(), is(equalTo(1)));
    }

    @Test
    public void shouldReturnTrueIfHaveGossipFromOtherDriver(){
        Driver driver1 = DriverBuilder.aDriver().withBusStops(1).build();
        Driver driver2 = DriverBuilder.aDriver().withBusStops(2).build();

        driver1.makeGossipWith(driver2);

        assertThat(driver1.hadGossipWith(driver2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnTrueIfGossipPassedThruFromOtherDriver(){
        Driver driver1 = DriverBuilder.aDriver().withBusStops(1).build();
        Driver driver2 = DriverBuilder.aDriver().withBusStops(2).build();
        Driver driver3 = DriverBuilder.aDriver().withBusStops(3).build();

        driver1.makeGossipWith(driver2);
        driver3.makeGossipWith(driver1);

        assertThat(driver3.hadGossipWith(driver2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnCurrentStop( ){
        Driver driver = DriverBuilder.aDriver().withBusStops(1, 2, 5, 8, 10).build();

        assertThat(driver.getCurrentStop(), is(equalTo(1)));
        driver.moveBusToNextStop();

        assertThat(driver.getCurrentStop(), is(equalTo(2)));
        driver.moveBusToNextStop();

        assertThat(driver.getCurrentStop(), is(equalTo(5)));
        driver.moveBusToNextStop();

        assertThat(driver.getCurrentStop(), is(equalTo(8)));
        driver.moveBusToNextStop();

        assertThat(driver.getCurrentStop(), is(equalTo(10)));
        driver.moveBusToNextStop();
    }

    @Test
    public void shouldHaveGossipWithİtself(){
        Driver driver1 = DriverBuilder.aDriver().withBusStops(1).build();

        assertThat(driver1.hadGossipWith(driver1), is(equalTo(true)));
    }

    @Test
    public void shouldReturnNumberOfStops(){
        Driver driver1 = DriverBuilder.aDriver().withBusStops(1, 3, 5, 6, 20, 33).build();
        assertThat(driver1.getStopCount(), is(equalTo(6)));
    }

}
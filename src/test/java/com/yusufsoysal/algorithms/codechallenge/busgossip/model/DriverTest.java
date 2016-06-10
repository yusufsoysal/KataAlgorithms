package com.yusufsoysal.algorithms.codechallenge.busgossip.model;

import com.yusufsoysal.algorithms.codechallenge.busgossip.builder.DriverBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class DriverTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveAtLeastOneStop(){
        new Driver(Collections.emptyList());
    }

    @Test
    public void shouldMoveToNextStop(){
        Driver driver = new Driver(Arrays.asList(1,2,3,4,5));

        Assert.assertThat(driver.moveBusToNextStop(), is(equalTo(2)));
        Assert.assertThat(driver.moveBusToNextStop(), is(equalTo(3)));
        Assert.assertThat(driver.moveBusToNextStop(), is(equalTo(4)));
        Assert.assertThat(driver.moveBusToNextStop(), is(equalTo(5)));
    }

    @Test
    public void shouldMoveToFirstStopWhenItGotToLast(){
        Driver driver = new Driver(Arrays.asList(1,2,3));

        driver.moveBusToNextStop(); // second stop
        driver.moveBusToNextStop(); // last stop

        Assert.assertThat(driver.moveBusToNextStop(), is(equalTo(1)));
    }

    @Test
    public void shouldMoveEvenThereIsOnlyOneStop(){
        Driver driver = new Driver(Collections.singletonList(1));

        Assert.assertThat(driver.moveBusToNextStop(), is(equalTo(1)));
        Assert.assertThat(driver.moveBusToNextStop(), is(equalTo(1)));
        Assert.assertThat(driver.moveBusToNextStop(), is(equalTo(1)));
    }

    @Test
    public void shouldReturnIfHaveGossipFromOtherDriver(){
        Driver driver1 = DriverBuilder.aDriver().withBusStops(1).build();
        Driver driver2 = DriverBuilder.aDriver().withBusStops(2).build();

        driver1.makeGossipWith(driver2);

        Assert.assertThat(driver1.hadGossipWith(driver2), is(equalTo(true)));
    }

}
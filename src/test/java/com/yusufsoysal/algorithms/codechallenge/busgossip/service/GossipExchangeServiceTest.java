package com.yusufsoysal.algorithms.codechallenge.busgossip.service;

import com.yusufsoysal.algorithms.codechallenge.busgossip.builder.DriverBuilder;
import com.yusufsoysal.algorithms.codechallenge.busgossip.model.Driver;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;

public class GossipExchangeServiceTest {

    private GossipExchangeService service = new GossipExchangeService();

    @Test
    public void shouldReturnNumberOfStopsToMakeAllGossips(){
        Driver driver1 = DriverBuilder.aDriver().withBusStops(3, 1, 2, 3).build();
        Driver driver2 = DriverBuilder.aDriver().withBusStops(3, 2, 3, 1).build();
        Driver driver3 = DriverBuilder.aDriver().withBusStops(4, 2, 3, 4, 5).build();

        Integer numberOfStops = service.makeDriversExchangeGossip( driver1, driver2, driver3 );

        Assert.assertThat( numberOfStops, is(equalTo(5)) );
    }

    @Test
    public void shouldReturnNullWhenDriversWillNeverShareAllGossips(){
        Driver driver1 = DriverBuilder.aDriver().withBusStops(2, 1, 2).build();
        Driver driver2 = DriverBuilder.aDriver().withBusStops(5, 2, 8).build();

        Integer numberOfStops = service.makeDriversExchangeGossip( driver1, driver2 );

        Assert.assertThat( numberOfStops, is(nullValue()) );
    }
}
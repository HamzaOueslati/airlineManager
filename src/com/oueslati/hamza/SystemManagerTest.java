package com.oueslati.hamza;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SystemManagerTest extends TestCase {

    SystemManager sm ;

    @Before
    public void setUp() throws Exception {
        SystemManager sm = new SystemManager();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCreateAirport() throws Exception {
        SystemManager sm = new SystemManager();

        //Success Creation
        sm.createAirport("CDG");
        Airport result = sm.findAirport("CDG");

        assertEquals(result.getName(),"CDG");
    }

    @Test
    public void testCreateAirline() throws Exception {
        SystemManager sm = new SystemManager();
        sm.createAirline("AZERT");
        Airline airLine = sm.findAirline("AZERT");
        if(airLine == null){
            fail("creation de airline non reussi");
        }else{
            assertEquals(airLine.getName(),"AZERT");
        }


    }

    @Test
    public void testCreateFlight() throws Exception {

    }

    @Test
    public void testCreateSection() throws Exception {

    }

    @Test
    public void testFindAvailableFlights() throws Exception {

    }

    @Test
    public void testBookSeat() throws Exception {

    }

    @Test
    public void testFindAirline() throws Exception {

    }

    @Test
    public void testFindAirport() throws Exception {

    }
}
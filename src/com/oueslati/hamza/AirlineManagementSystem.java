/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oueslati.hamza;

import com.oueslati.hamza.exception.FieldLengthException;
import com.oueslati.hamza.exception.ObjectExistInHashSetException;

/**
 *
 */
public class AirlineManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FieldLengthException, ObjectExistInHashSetException {
       
        SystemManager res = new SystemManager();
        
        res.createAirport("DEN");
        res.createAirport("DFW");
        res.createAirport("LON");
        //res.createAirport("DEN");
        res.createAirport("CDG");
        res.createAirport("JPN");
        //res.createAirport("DEN");
        //res.createAirport("DE");
        res.createAirport("DEH");
        //res.createAirport("DRlrdn3");
        
        // Ai r l i n e s
        res.createAirline("DELTA");
        res.createAirline("AIRFR");
        res.createAirline("AMER");
        res.createAirline("JET");
        //res.createAirline("DELTA");
        res.createAirline("SWEST");
        //res.createAirline("FRONTIER");
        
        //Flights
        res.createFlight("DELTA", "DEN", "LON", 2008, 11, 12, "123");
        try {
            res.createFlight("DELTA", "DEN", "DEH", 2009, 8, 9, "567");
        } catch (FieldLengthException e) {
            e.printStackTrace();
        } catch (ObjectExistInHashSetException e) {
            e.printStackTrace();
        }
        //res.createFlight("DELTA", "DEN", "NCE", 2010, 9, 8, "567");
        
        //Sections
        res.createSection("JET", "123", 2, 2, SeatClass.ECO);
        res.createSection("JET", "123", 1, 3, SeatClass.ECO);
        res.createSection("JET", "123", 2, 3, SeatClass.FIRST);
        res.createSection("DELTA", "123", 1, 1, SeatClass.BUSI);
        res.createSection("DELTA", "123", 1, 2, SeatClass.ECO);
        res.createSection("SWSERTT", "123", 5, 5, SeatClass.ECO);
        
        res.displaySystemDetails();
        
        res.findAvailableFlights("DEN", "LON");
        
        res.bookSeat("DELTA", "123", SeatClass.BUSI, 1, 'A');
        res.bookSeat("DELTA", "123", SeatClass.ECO, 1, 'A');
        res.bookSeat("DELTA", "123", SeatClass.ECO, 1, 'B');
        //res.bookSeat("DELTA", "123", SeatClass.BUSI, 1, 'A');
        
        res.displaySystemDetails();
        
        res.findAvailableFlights("DEN", "LON");
    }
}

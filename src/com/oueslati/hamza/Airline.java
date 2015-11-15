
package com.oueslati.hamza;

import com.oueslati.hamza.exception.FieldLengthException;
import com.oueslati.hamza.exception.ObjectExistInHashSetException;
import com.oueslati.hamza.exception.ObjectNotExistInHashSetException;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Airline
{
    private String name;
    
    private Set<Flight> flights;


    public Airline(String name) throws FieldLengthException
    {
        if( name.length() <= 5 ){
            this.name = name;
            this.flights = new LinkedHashSet();
        }
        else
            throw new FieldLengthException("The name of the airline is too long (5 char max)");
    }


    public Set<Flight> getFlights() {
        return flights;
    }

    public String getName() {
        return name;
    }


    public void createFlight(Airport orig, Airport dest, Calendar date, String id) throws FieldLengthException, ObjectExistInHashSetException
    {    
        if(!this.flights.add(new Flight(id, orig, dest, date)))
            throw new ObjectExistInHashSetException("ID : "+id+" already exist");
    }
    

    public Flight findFlight(String id) throws ObjectNotExistInHashSetException
    {
        for(Flight flight: this.flights)
            if(flight.getId().equals(id))
                return flight;
        
        throw new ObjectNotExistInHashSetException("Flight "+id+" doesn't exist");
    }
    

    public void createSection(String id, int rows, int cols, SeatClass s) throws ObjectExistInHashSetException, FieldLengthException, ObjectNotExistInHashSetException
    {
         Flight flight = this.findFlight(id);
         flight.createSection(rows, cols, s);
  
    }
    

    public void bookFight(String fl, SeatClass s, int row, char col) throws ObjectNotExistInHashSetException, FieldLengthException, ObjectExistInHashSetException
    {
        Flight flight = this.findFlight(fl);
        
        flight.bookSeat(s, row, col);
    }
            

    public void displayFlights()
    {
        for(Flight flight: this.flights){
            System.out.println(flight);
            flight.displayFlightSections();
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Airline other = (Airline) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb = sb.append("Airline{name=").append(name).append("}");
        return  sb.toString();
    }
    
    
}


package com.oueslati.hamza;


public class Seat {
    
    private SeatID seatNum;
    private boolean isBooked;

    public Seat(SeatID id)
    {
        this.seatNum = id;
        this.isBooked = false;
    }
    

    public SeatID getSeatNum()
    {
        return this.seatNum;
    }
    

    public boolean getStatus()
    {
        return this.isBooked;
    }


    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb = sb.append("Seat{seatNum=")
            .append(seatNum)
            .append(", isBooked=")
            .append(isBooked)
            .append("}");
        return  sb.toString();
    }
    
    
    
}

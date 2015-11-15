
package com.oueslati.hamza;

import java.util.Objects;

import com.oueslati.hamza.exception.FieldLengthException;


public class Airport
{
    private String name;

    public String getName()
    {
        return this.name;
    }
    

    public Airport(String name) throws FieldLengthException
    {
        if(name.length() == 3)
            this.name = name;
        else
            throw new FieldLengthException("The length of name of the Airport must have exactly 3 caracters");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Airport other = (Airport) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb = sb.append("Airport{name=").append(name).append("}");
        return  sb.toString();
    }
    
    
}

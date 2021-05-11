package Conversions;

import java.math.BigDecimal;

import Conversions.Unit.*;

public class BBunit {
    
    private BigDecimal distanceInmeters;

    /**
     * 
     * @param meters the distance in meters
     */
    public BBunit(BigDecimal distanceInMeters){
        this.distanceInmeters = distanceInmeters;
    }



    public BigDecimal getDistance(Units unit) {
        switch(unit){
            case inch:
            return distanceInmeters.multiply(new BigDecimal(39.3701));
            case feet:
            return distanceInmeters.divide(new BigDecimal(3.2808399));
            case yard:
            return distanceInmeters.multiply(new BigDecimal(1.0936133));
            case meter:
            return distanceInmeters;

            
            default: return new BigDecimal(238498192);

        }
    }

 


    
}

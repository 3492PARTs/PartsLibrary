package Sensors;

import edu.wpi.first.wpilibj.DigitalInput;

public class DigitalSensor {

    DigitalInput sensor;


    /**
     * 
     * @param portNum the port the sensor is in
     */
    public DigitalSensor(int portNum){
        this.sensor = new DigitalInput(portNum);
    }


    /**
     * 
     * @return gets sensor state 
     */
    public boolean getRawSensor(){
        return sensor.get();
    }
    
    /**
     * 
     * @return the inverted sensor state
     */
    public boolean getInvSensor(){
        return !sensor.get();
    }
}
package Sensors;

import Sensors.Abstract.Sensor;
import edu.wpi.first.wpilibj.Ultrasonic;

public class BBProximityUltraSonic implements Sensor{

    private Ultrasonic ultrasonic;
    private boolean isWorking;

    public BBProximityUltraSonic(Ultrasonic ultrasonic){
        this.ultrasonic = ultrasonic;
        
    }

    @Override
    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    @Override
    public boolean getWorking() {
        // TODO Auto-generated method stub
        return isWorking;
    }

    



    
}
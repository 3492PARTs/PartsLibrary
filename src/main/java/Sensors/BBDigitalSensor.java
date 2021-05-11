/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package Sensors;

import Sensors.Abstract.Sensor;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 * Add your docs here.
 */
public class BBDigitalSensor implements Sensor{

    DigitalInput digitalInput;

    boolean isWorking;

    public BBDigitalSensor(int portNum){
        digitalInput = new DigitalInput(portNum);
    }

    public boolean sensorState(){
        return digitalInput.get();
    }

    @Override
    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    @Override
    public boolean getWorking() {
        return isWorking;
    }
}

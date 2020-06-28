/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package Sensors;

import edu.wpi.first.wpilibj.DigitalInput;

/**
 * Add your docs here.
 */
public class DigitalSensor {

    DigitalInput digitalInput;

    public DigitalSensor(int portNum){
        digitalInput = new DigitalInput(portNum);
    }

    public boolean sensorState(){
        return digitalInput.get();
    }

    public boolean notSensorState(){
        return !digitalInput.get();
    }

    

}

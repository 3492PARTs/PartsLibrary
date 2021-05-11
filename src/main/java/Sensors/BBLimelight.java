package Sensors;

import Sensors.Abstract.Sensor;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;



public class BBLimelight implements Sensor{

    NetworkTable limeLight;
    NetworkTableEntry TargetAquired;
    NetworkTableEntry HorizontalOffset;
    NetworkTableEntry VerticalOffset;
    NetworkTableEntry TargetArea;
    private boolean isWorking;

    /** 
     * 
     * @param limeLight The limelight network table
     */
    public BBLimelight(NetworkTable limeLight){
        this.limeLight = limeLight;
        TargetAquired = limeLight.getEntry("tv");
        HorizontalOffset = limeLight.getEntry("tx");
        VerticalOffset = limeLight.getEntry("ty");
        TargetArea = limeLight.getEntry("ta");
    }

    public boolean isTargetAquired(){
        return TargetAquired.getBoolean(false);
    }

    public double getHorizontalOffset(){
        return HorizontalOffset.getDouble(0.0);
    }

    public double getVerticalOffset(){
        return VerticalOffset.getDouble(0.0);
    }

    public double getTargetArea(){
        return TargetArea.getDouble(0.0);
    }

    /**
     * 
     * @param distanceFromBottomWall distance from the bottom of the structure the target is on
     * @return returns the distance in the input unit
     */
    public double getDistanceFromVerticleTarget(double distanceFromBottomWall){
        return distanceFromBottomWall/Math.cos(getVerticalOffset());
    }


    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    @Override
    public boolean getWorking() {
        return isWorking;
    }

    
}
package Sensors;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;



public class LimeLight{

    NetworkTable limeLight;
    NetworkTableEntry TargetAquired;
    NetworkTableEntry HorizontalOffset;
    NetworkTableEntry VerticalOffset;
    NetworkTableEntry TargetArea;

    /** 
     * 
     * @param limeLight The limelight network table
     */
    public LimeLight(NetworkTable limeLight){
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

    
}
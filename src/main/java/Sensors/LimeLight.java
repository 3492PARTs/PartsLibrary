package Sensors;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;


public class LimeLight{

    
    NetworkTable limeLight;
    NetworkTableEntry targetAquiredIn, horizontalOffsetIn, verticalOffsetIn, targetAreaIn;


    /**
     * 
     * @param limeLight the limelight network table object
     */
    public LimeLight(NetworkTable limeLight){
        this.limeLight = limeLight;
    }

    /**
     * 
     * @param limeLight the limeLight network table object
     * @param targetAquiredIn the String key for Target aquired
     * @param horizontalOffsetIn the String key for Target horizontal offset
     * @param verticalOffsetIn the String key for Target vertical offset
     * @param targetAreaIn the String key for Target area
     */
    public LimeLight(NetworkTable limeLight,String targetAquiredIn,String horizontalOffsetIn,String verticalOffsetIn,String targetAreaIn){
        this.limeLight = limeLight;
        this.targetAquiredIn = limeLight.getEntry(targetAquiredIn);
        this.horizontalOffsetIn = limeLight.getEntry(horizontalOffsetIn);
        this.verticalOffsetIn = limeLight.getEntry(verticalOffsetIn);
        this.targetAquiredIn = limeLight.getEntry(targetAreaIn);
    }

    
    public boolean isTargetAquired(){
        return targetAquiredIn.getBoolean(false);
    }

    public double getHorizontalOffset(){
        return horizontalOffsetIn.getDouble(0.0);
    }

    public double getVerticalOffset(){
        return verticalOffsetIn.getDouble(0.0);
    }

    public double getTargetArea(){
        return targetAreaIn.getDouble(0.0);
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
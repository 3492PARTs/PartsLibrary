package Sensors;

import edu.wpi.first.wpilibj.Encoder;

public class Encoders{

Encoder encoder;
int ticksPerRotation;
private int goalRaw;
private double goalRot;
private double degreeGoal;

    public Encoders(int port1, int port2,int ticksPerRotation){
        this.encoder = new Encoder(port1, port2);
        this.ticksPerRotation = ticksPerRotation;
    }

    public double getTotalRotations(){
        return encoder.get()/ticksPerRotation;
    }

    public int getRawCount(){
        return encoder.get();
    }

    public double getDegrees(){
        return  (encoder.get()%ticksPerRotation) * (ticksPerRotation/360.0);
    }
    /**
     * 
     * @param Goal the number of raw sensor units you want the encoder to acheive
     */
    public void setGoalRaw(int Goal){
        this.goalRaw = Goal;
    }

    public boolean atGoalRaw(){
        return getRawCount() >= goalRaw;
    }

    /**
     * 
     * @param goal the goal in rotations
     */
    public void setGoalRot(double goal){
        this.goalRot = goal;
    }

    /**
     * 
     * @return whether the encoder has rotated to the goal
     */
    public boolean atGoalRot(){
        return getTotalRotations() >= goalRot;
    }

    public void setDegreeGoal(double goal){
        this.degreeGoal = goal;
    }


    /**
     * 
     * @return whether the encoder is at the desired amount of degrees
     */
    public boolean atGoalDegrees(){
        return getDegrees() >= degreeGoal;
    }

}
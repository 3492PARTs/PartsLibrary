package Subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
/**
 * @see This class is non dunctional and you should inherit from it it has all of the basic things except for motors which you need to put in yourself
 * 
 */
public abstract class DriveTrain {



    private SpeedControllerGroup left, right;
    private DifferentialDrive M_drive;
    private double mult = 1;
  

    public DriveTrain(){

      M_drive = new DifferentialDrive(left, right);
    }

    /**
     * 
     * @param left the speed the left speed group should move
     * @param right the speed the right speed groiup should move
     */
    public void move(double leftSpeed, double rightSpeed){
        M_drive.tankDrive(leftSpeed, rightSpeed);
    }


    public void stop(){
        move(0, 0);
    }

      // joystick limiter
  private double limitedJS1 = 0;
  private double limitedJS2 = 0;

  /**
   * Drive with speed ramp
   * 
   * @param joyY joystick left y axis
   * @param JoyX joystick right y axis
   */
  public void moveLimited(Double joy1, Double joy2) {
    double limit = .02;
    double change = joy1 - limitedJS1;
    if (change > limit) {
      change = limit;
    } else if (change <= limit) {
      change = -limit;
    }
    limitedJS1 += change;

    change = joy2 - limitedJS2;
    if (change > limit)
      change = limit;
    else if (change <= limit)
      change = -limit;
    limitedJS2 += change;
    M_drive.tankDrive((mult) * limitedJS1, (mult) * limitedJS2);
  }



  public void setMult(double mult){this.mult = mult;}
 
  
}
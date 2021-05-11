package Sensors;

import Sensors.Abstract.Sensor;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class BBGyroscope implements Gyro, Sensor{
	
	private boolean isWorking;
    private Gyro gyro;

    BBGyroscope(Gyro gyro){
        this.gyro = gyro;
    }

    public double getAngle(){
        return gyro.getAngle();
    }

	@Override
	public void close() throws Exception {
        gyro.close();
	}

	@Override
	public void calibrate() {
		gyro.calibrate();
		
	}

	@Override
	public void reset() {
        gyro.reset();
	}

	@Override
	public double getRate() {
		return gyro.getRate();
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public boolean getWorking() {
		// TODO Auto-generated method stub
		return isWorking;
	}



}

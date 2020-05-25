package Sensors;

import edu.wpi.first.wpilibj.Encoder;

public class Encoders{

Encoder encoder;
int ticksPerRotation;

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

}
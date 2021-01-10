package Utilities;



public class PIMath {

    final double proportionCoefficient;
    final double integralCoefficient;
    double errorIntegral;

    public PIMath(double proportionCoefficient, double integralCoefficient){
        this.proportionCoefficient = proportionCoefficient;
        this.integralCoefficient = integralCoefficient;
    }

    public double update(double error){
        errorIntegral += error;
        double output = (proportionCoefficient * error);
        output += (integralCoefficient * errorIntegral);

        return output;
    }



}
package Utilities;

public class Timer{

    long startTime;
    double secondGoal;

    Timer(){
        start();
    }
    /**
     * 
     * @param seconds the length of the timer
     */
    Timer(double seconds){
        start();
        this.secondGoal = seconds;
    }

    private void start(){
        this.startTime = System.currentTimeMillis();
    }
    /**
     * 
     * @return the elapsed time in miliseconds as a long
     */
    public long getElapsedMillis(){
        return System.currentTimeMillis() - startTime;
    }

    public int getElapsedMillisInt(){
        return (int) getElapsedMillis();
    }

    public double getElapsedSeconds(){
        return 1000 * ((double) getElapsedMillis());
    }

    public boolean getTimerOver(){
        return ((int)(secondGoal)*1000) >= getElapsedMillis();
    }



}
package Utilities;

public class Timer{

    long startTime;


    Timer(){
        start();
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



}
package Utilities;

public abstract class Toggler {
    boolean state;

    public Toggler(boolean defaultState){
        this.state = defaultState;
    }

    public void toggle(){
        state = !state;
    }
    
    public boolean getState(){
        return state;
    }


}
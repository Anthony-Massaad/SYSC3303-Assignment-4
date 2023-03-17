package assignment4;

public class State implements Context{

    protected State state; 

    public State getState(){
        return this.state; 
    }

    public void setState(State state){
        this.state = state; 
    }

    @Override
    public State pedestrianWaiting() {
    	System.out.println("ERROR");
        return this.state.pedestrianWaiting();
    }

    @Override
    public State timeout() {
    	System.out.println("ERROR");
        return this.state.timeout(); 
    }
    
    @Override
    public void setTimer() {
    	System.out.println("ERROR");
    	this.state.setTimer(); 
    }

    public static State start(){
        while (true){

        }
    }

    public static void main(String[] args) {
        State context = new State();
        System.out.println("Hellow");
    }
}

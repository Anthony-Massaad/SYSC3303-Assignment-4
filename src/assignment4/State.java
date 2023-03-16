package assignment4;

public class State implements Context{

    protected State state; 

    public State(){}

    public State getState(){
        return this.state; 
    }

    public void setState(State state){
        this.state = state; 
    }

    @Override
    public State pedestrianWaiting() {
        return this.state.pedestrianWaiting();
    }

    @Override
    public State timeout() {
        return this.state.timeout(); 
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

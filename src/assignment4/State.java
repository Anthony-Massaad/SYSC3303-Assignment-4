package assignment4;

public class State implements Context{

    private State state; 

    public State(){
        this(null);
    }

    public State(State state){
        this.state = state; 
    }

    public State getState(){
        return this.state; 
    }

    public void setState(State state){
        this.state = state; 
    }

    public void nextState(){
        this.state.nextState();
    };

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
    }
}

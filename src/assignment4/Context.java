package assignment4;

public interface Context {
    State pedestrianWaiting();
    State timeout();
    void setTimer(); 
}

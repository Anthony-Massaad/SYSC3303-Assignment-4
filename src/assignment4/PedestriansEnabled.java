package assignment4;

import assignment4.constants.PedestrianAction;

public abstract class PedestriansEnabled extends State implements Runnable{
    
	private PedestrianAction currState;
	private PedestriansEnabled crossState; 
    public PedestriansEnabled(){
        this.currState = PedestrianAction.DONT_WALK;
        this.crossState = null; 
    }
    
    public void signalPedestrians(PedestrianAction state) {
    	this.currState = state; 
    }
    
    public PedestrianAction getCurrState() {
    	return this.currState;
    }
    
    public void setCrossState(PedestriansEnabled crossState) {
    	this.crossState = crossState; 
    }
    
    @Override
    public State timeout() {
    	return null; 
    }
    
    @Override
    public void setTimer() {
    	this.crossState.setTimer();
    }

	@Override
	public void run() {
		try {
			while (true) {
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

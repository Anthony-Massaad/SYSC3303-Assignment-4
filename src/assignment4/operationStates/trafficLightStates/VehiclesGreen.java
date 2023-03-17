package assignment4.operationStates.trafficLightStates;

import assignment4.VehiclesEnabled;

public class VehiclesGreen extends VehiclesEnabled{
	
    private boolean isPedesrianWaiting;
    
    public VehiclesGreen() {
    	this.isPedesrianWaiting = false; 
    }
    
    @Override
    public 
    
    @Override
    public void setTimer() {
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
}

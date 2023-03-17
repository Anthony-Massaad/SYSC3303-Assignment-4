package assignment4;

import assignment4.constants.TrafficLight;

public abstract class VehiclesEnabled extends State implements Runnable{

	
	private TrafficLight trafficLightState; 
	private VehiclesEnabled vehicleEnabledState; 
    public VehiclesEnabled(){
    	this.trafficLightState = TrafficLight.GREEN;
    	this.vehicleEnabledState = null; 
    }
    
    
    public void signalVehicles(TrafficLight state) {
    	this.trafficLightState = state; 
    }
    
    public void setVehicleState(VehiclesEnabled state) {
    	this.vehicleEnabledState = state; 
    }
    
    public TrafficLight getTrafficLightState() {
    	return this.trafficLightState; 
    }
    
    @Override
    public void setTimer() {
    	this.vehicleEnabledState.setTimer(); 
    }
    
    @Override
    public State timeout() {
		return null;
    }
    
    @Override
    public State pedestrianWaiting() {
    	return null; 
    }
    
    @Override
    public void run() {
    	try {
    		while (true) {
    			
        	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}

package task2;

public class Call {
	private final double priceForAMinute=0.50;
	GSM caller;
	GSM receiver;
	private double duration;
	
	
	public double getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public double getPriceForAMinute() {
		
		return this.priceForAMinute;
	}
	public Call(GSM caller, GSM receiver, double duration) {
		this.caller = caller;
		this.receiver = receiver;
		this.duration = duration;		
		
	}
	public GSM getCaller() {
		return caller;
	}
	public void setCaller(GSM caller) {
		this.caller = caller;
	}
	public GSM getReceiver() {
		return receiver;
	}
	public void setReceiver(GSM receiver) {
		this.receiver = receiver;
	}

	
	
	
}

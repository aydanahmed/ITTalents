package task2;

public class GSM {
	private static final int phoneNumberLength = 10;
	private static final String phoneNumberBegin = "08";
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private double outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;

	public GSM(String model) {
		setModel(model);
	}

	public void setModel(String model) {
		if (!model.equals("")) {
			this.model = model;
		}
	}

	public String getModel() {
		return model;
	}

	public void setOutgoingCallsDuration(double outgoingCallsDuration) {
		if (outgoingCallsDuration > 0) {
			this.outgoingCallsDuration = outgoingCallsDuration;
		}
	}

	public double getOutgoingCallsDuration() {
		return outgoingCallsDuration;
	}

	public void setLastIncomingCall(Call lastIncomingCall) {
		if (lastIncomingCall != null) {
			this.lastIncomingCall = lastIncomingCall;
		}
	}

	public Call getLastIncomingCall() {
		if (lastIncomingCall != null) {
			return lastIncomingCall;
		} else
			return null;
	}

	public void setLastOutgoingCall(Call lastOutgoingCall) {
		if (lastOutgoingCall != null) {
			this.lastOutgoingCall = lastOutgoingCall;
		}
	}

	public Call getLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			return lastOutgoingCall;
		} else
			return null;
	}

	public void insertSimCard(String simMobileNumber) {
		if (!(simMobileNumber.length() == phoneNumberLength)) {
			return;
		}

		String tmp = simMobileNumber.substring(0, 2);
		if (tmp.equals(phoneNumberBegin)) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		}
	}

	public void removeSimCard() {
		hasSimCard = false;
	}

	public boolean getSimCard() {
		return hasSimCard;
	}

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	public void call(GSM receiver, double duration) {
		if (duration <= 0) {
			return;
		}

		if (this.simMobileNumber == receiver.simMobileNumber) {
			return;
		}

		if (!this.hasSimCard || !receiver.hasSimCard) {
			return;
		}

		Call call = new Call(this, receiver, duration);
		this.lastOutgoingCall = call;
		receiver.lastIncomingCall = call;
		this.outgoingCallsDuration += duration;

	}

	public double getSumForCall() {
		return outgoingCallsDuration * this.lastOutgoingCall.getPriceForAMinute();

	}


	public void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			System.out.println("==================================");
			System.out.println("Last Outgoing call info >>>>");
			System.out.println("Duration: " + lastOutgoingCall.getDuration());
			System.out.println("Caller: "
					+ lastOutgoingCall.getCaller().getModel());
			System.out.println(lastOutgoingCall.getCaller()
					.getSimMobileNumber());

		}
	}

	public void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println("==================================");
			System.out.println("Last Incoming call info >>>>");
			System.out.println("Duration: " + lastIncomingCall.getDuration());
			System.out.println("Receiver: "
					+ lastIncomingCall.getCaller().getModel());
			System.out.println(lastIncomingCall.getCaller()
					.getSimMobileNumber());
		}
}
}

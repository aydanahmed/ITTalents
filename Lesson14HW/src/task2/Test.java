package task2;

public class Test {

	public static void main(String[] args) {
		GSM gsm = new GSM("Galaxy s3");
		gsm.insertSimCard("0884567897");
				
		GSM gsm1 = new GSM("Galaxy s6");
		gsm1.insertSimCard("0845678977");
		
		GSM gsm2 = new GSM("Galaxy s5");
		gsm2.insertSimCard("0889456123");
		
		gsm.call(gsm1, 20);
		gsm1.call(gsm, 40);
		gsm1.call(gsm2, 30);
		gsm.printInfoForTheLastOutgoingCall();
		gsm2.printInfoForTheLastIncomingCall();
		
		System.out.println("All sum for outgoing calls is: "+gsm1.getSumForCall()+ " lv.");
	}

}

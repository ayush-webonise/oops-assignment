package mobileImplement;

public class smartPhone extends Mobile implements IMobile,IMobileSMS{
    boolean power;
    String sender;
    String contactlist[];


    public smartPhone() {
		// TODO Auto-generated constructor stub
    	 this.power=false;
         this.modelNo=1100;
         this.size=4.7;
         this.weight=56.4;
         this.os=new String("IOS");
         this.sender=new String("Ayu");
         this.contactlist= new String[]{"Ayush","Ram","Sumit"};
       }


    public void call(String receiver) {

        System.out.println("Calling to " + receiver);


    }

    public void answer(String receiver) {


        System.out.println(receiver + " calling");


    }


    public void sendSms(String receiver) {

        System.out.println("Message sent successfully from " + sender + " to " + receiver);


    }

}

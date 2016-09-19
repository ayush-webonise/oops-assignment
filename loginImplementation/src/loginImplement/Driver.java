package loginImplement;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Press 1 for Login \n2 for Register");
        @SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);

        int firstNumber = reader.nextInt();
        if(firstNumber==1) {
            System.out.println("Press 1 to Login with facebook \n2 to Login with Linked In \n3 to wwwwwwwwwwwwwwwwwwwwwwwLogin with Twitter ");
            @SuppressWarnings({ "unused", "resource" })
			Scanner reader1 = new Scanner(System.in);
            int num = reader.nextInt();

            if(num==1){
                Facebook fb=new Facebook();
                fb.login();


            }

            if(num==2){
                LinkedIn ln=new LinkedIn();
                ln.login();


            }
            if(num==3){
                Twitter tw=new Twitter();
                tw.login();


            }

        }

        else if(firstNumber==2){
            System.out.println("Press 1 to Register with facebook \n2 to Register with Linked In \n3 to Register with Twitter ");
            @SuppressWarnings({ "unused", "resource" })
			Scanner reader1 = new Scanner(System.in);
            int num = reader.nextInt();

            if(num==1){
                Facebook fb=new Facebook();
                fb.register("Deep",22,"deepn94@gmail.com");


            }

            if(num==2){
                LinkedIn ln=new LinkedIn();
                ln.register("Deep",22,"deepn94@gmail.com");


            }
            if(num==3){
                Twitter tw=new Twitter();
                tw.register("Deep",22,"deepn94@gmail.com");


            }


        }





	}

}

package loginImplement;

public class Registration {
	String name;
    int age;
    String email;

    public Registration(){
        this.name="null";
        this.age=0;
        this.email="null";
    }


    public void register(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        System.out.println("You are now registered");

    }

}

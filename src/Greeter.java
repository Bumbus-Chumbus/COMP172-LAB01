/*
    purpose: Objects of this class will print greetings
    Author: Kenny Graham
    Modified: 8/30/18
 */
public class Greeter {
    ///Properties
    private String toBeGreeted;

    //methods
    public Greeter(String greeted){
        this.toBeGreeted = greeted;
    }

    public void greet(){
        System.out.println("Hello, " + toBeGreeted);
    }
}
